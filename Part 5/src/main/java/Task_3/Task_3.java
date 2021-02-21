package Task_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task_3 {
    //3.Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
    //выходных и праздничных днях.

    public static void main(String[] args) {
        try {
            SimpleDateFormat sdfHoliday = new SimpleDateFormat("dd.MM.yyy");
            Calendar calendar = new Calendar(2000);
            DayOfWeek Monday = DayOfWeek.Monday;
            System.out.println("Calendar for 2000 year" + calendar.getYear());
            Calendar.Holiday holiday = calendar.new Holiday(sdfHoliday.parse("01.01.2000"), "New Year", Monday);
            calendar.addHolidayCalendar(holiday);
            calendar.addHolidayCalendar(calendar.createHoliday(sdfHoliday.parse("01.09.2000"), "Knowledge day", DayOfWeek.Monday));
            calendar.addHolidayCalendar(calendar.createHoliday(sdfHoliday.parse("03.07.2000"), "Independence of day", DayOfWeek.Wednesday));
            calendar.addHolidayCalendar(calendar.createHoliday(sdfHoliday.parse("09.05.2000"), "Victory of day", DayOfWeek.Wednesday));
            calendar.addHolidayCalendar(calendar.createHoliday(sdfHoliday.parse("08.03.2000"), "Women of day", DayOfWeek.Tuesday));
            calendar.printHolidaysCalendar();
            calendar.sortOfDateHolidays();
            System.out.println("Sort by date");
            calendar.printHolidaysCalendar();
            System.out.println("Remove from list knowledge day");
            calendar.removeHolidayFromCalendar("Knowledge day");
            calendar.printHolidaysCalendar();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
