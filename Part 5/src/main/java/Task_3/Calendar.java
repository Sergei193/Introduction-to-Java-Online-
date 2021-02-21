package Task_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;

public class Calendar {
    private int year;
    private ArrayList<Holiday> listHoliday;

    public Calendar(int year) {
        this.year = year;
        listHoliday = new ArrayList<>();
    }

    protected Holiday createHoliday(Date dateHoliday, String nameOfHoliday, DayOfWeek dayOfWeek) {
        Holiday holiday = new Holiday(dateHoliday, nameOfHoliday, dayOfWeek);
        return holiday;
    }

    protected void addHolidayCalendar(Holiday holiday) {
        listHoliday.add(holiday);

    }

    protected void sortOfDateHolidays() {
        listHoliday.sort(Comparator.comparing(Holiday::getDateHoliday));
    }

    protected void removeHolidayFromCalendar(String nameOfHoliday) {
        if (listHoliday.isEmpty()) {
            System.out.println(" List holidays in calendar is empty");
        } else {
            Iterator<Holiday> holidayIterator = listHoliday.iterator();
            while (holidayIterator.hasNext()) {
                Holiday holiday = holidayIterator.next();
                if (holiday.getNameOfHoliday().equals(nameOfHoliday)) {
                    holidayIterator.remove();
                }
            }
        }


    }

    protected void printHolidaysCalendar() {
        if (listHoliday.isEmpty()) {
            System.out.println(" List holidays in calendar is empty");
        } else {
            for (Holiday holiday : getListHoliday()) {
                System.out.println(holiday.toString());
            }

        }
    }

    public int getYear() {
        return year;
    }

    public ArrayList<Holiday> getListHoliday() {
        return listHoliday;
    }

    protected class Holiday {
        private Date dateHoliday;
        private String nameOfHoliday;
        private DayOfWeek dayOfWeek;

        public Holiday(Date dateHoliday, String nameOfHoliday, DayOfWeek dayOfWeek) {
            this.dateHoliday = dateHoliday;
            this.nameOfHoliday = nameOfHoliday;
            this.dayOfWeek = dayOfWeek;
        }

        public Date getDateHoliday() {
            return dateHoliday;
        }

        public DayOfWeek getDayOfWeek() {
            return dayOfWeek;
        }

        public String getNameOfHoliday() {
            return nameOfHoliday;
        }

        @Override
        public String toString() {
            return "Holiday : " + getNameOfHoliday() + "date : " + getDateHoliday() + " day of week : " + getDayOfWeek();
        }
    }
}
