package ua.kpi.tef;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.kpi.tef.model.UserMeal;
import ua.kpi.tef.model.UserMealWithExceed;
import ua.kpi.tef.util.UserMealsUtil;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;



/**
 * Created by User on 11.08.2017.
 */
public class UserMealsUtilTest {

    List<UserMeal> mealList = Arrays.asList(
            new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,10,0), "Завтрак", 500),
            new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,13,0), "Обед", 1000),
            new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,20,0), "Ужин", 500),
            new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,10,0), "Завтрак", 1000),
            new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,13,0), "Обед", 500),
            new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,20,0), "Ужин", 510));

    @Test
    public void testGetFilteredWithExceeded() {
        List<UserMealWithExceed> list = UserMealsUtil.getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000);
        Assertions.assertEquals(list.get(0).getDateTime(), mealList.get(0).getDateTime());
        Assertions.assertTrue(list.size() == 2);
        Assertions.assertFalse(list.get(0).isExceed());
    }

    @Test
    public void testGetFilteredWithExceeded1() {
        List<UserMealWithExceed> list = UserMealsUtil.getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000);
        Assertions.assertTrue(list.size() == 2);
    }

    @Test
    public void testGetFilteredWithExceeded2() {
        List<UserMealWithExceed> list = UserMealsUtil.getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000);
        Assertions.assertFalse(list.get(0).isExceed());
    }

}
