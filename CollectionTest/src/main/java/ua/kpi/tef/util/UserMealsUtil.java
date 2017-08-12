package ua.kpi.tef.util;

import ua.kpi.tef.model.UserMeal;
import ua.kpi.tef.model.UserMealWithExceed;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * GKislin
 * 31.05.2015.
 */
public class UserMealsUtil {

    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,13,0), "Обед", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,20,0), "Ужин", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,10,0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,13,0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,20,0), "Ужин", 510)
        );
        getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000);
//        .toLocalDate();
//        .toLocalTime();
        //System.out.println(mealList.get(0).getDateTime().toLocalTime());
        System.out.println(getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000));
    }

    public static List<UserMeal> getFilteredPerDay(List<UserMeal> mealList, LocalDate repDate) {
        List<UserMeal> result = new ArrayList<>();
        for (int i = 0; i < mealList.size(); i++) {
            if (mealList.get(i).getDateTime().toLocalDate().equals(repDate)) result.add(mealList.get(i));
        }
        return result;
    }

    public static int caloriesPerDay(List<UserMeal> mealList) {
        int cal = 0;
        for (int i = 0; i < mealList.size(); i++) {
            cal += mealList.get(i).getCalories();
        }
        return cal;
    }

    public static List<UserMealWithExceed>  getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
        List<UserMealWithExceed> result = new ArrayList<>();

        for (int i = 0; i < mealList.size(); i++) {
            if (TimeUtil.isBetween(mealList.get(i).getDateTime().toLocalTime(), startTime, endTime)) {
                UserMealWithExceed user = new UserMealWithExceed(mealList.get(i).getDateTime(), mealList.get(i).getDescription(), mealList.get(i).getCalories(),
                        isFat(caloriesPerDay(getFilteredPerDay(mealList, mealList.get(i).getDateTime().toLocalDate())), caloriesPerDay));
                result.add(user);
            }
        }

        // TODO return filtered list with correctly exceeded field
        return result;
    }

    public static boolean isFat(int currentCalories, int maxCalories) {
        if (currentCalories > maxCalories) return true;
            else return false;

    }
}
