import java.time.LocalDate;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate() {
        LocalDate today = LocalDate.now();
        this.year = today.getYear();
        this.month = today.getMonthValue();
        this.day = today.getDayOfMonth();
    }

    public MyDate(int day, String monthName, int year) {
        this.day = day;
        this.year = year;
        this.month=convertToMonthNumber(monthName);
    }
    public static int convertToMonthNumber(String monthName){
        monthName=monthName.toLowerCase();
        switch(monthName){
            case "january":return 1;
            case "february":return 2;
            case "march":return 3;
            case "april":return 4;
            case "may":return 5;
            case "june":return 6;
            case "july":return 7;
            case "august":return 8;
            case "september":return 9;
            case "october":return 10;
            case "november":return 11;
            case "december":return 12;
            default: return -1;
        }
    }

    public void set(int day, int month, int year) {
        if (day < 1) day = 1;
        else if (day > numberOfDaysInMonth()) day = numberOfDaysInMonth();
        this.day = day;
        if (month < 1) month = 1;
        else if (month > 12) month = 12;
        this.month = month;
        if (year < 0) year = -year;
        this.year = year;

    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    public boolean isLeapYear() {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    public String getMonthName() {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            default:
                return "December";
        }
    }

    public void stepForwardOneDay() {
        day++;
        if (day > numberOfDaysInMonth()) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public void stepForward(int days) {

        for (int i=1; i<=days;i++){
          stepForwardOneDay();
        }
    }

    public boolean isBefore(MyDate other) {
        if (this.year < other.year) {
            return true;
        } else if (this.year > other.year) {
            return false;
        }
        if (this.month < other.month) {
            return true;
        } else if (this.month > other.month) {
            return false;
        }
        return this.day < other.day;
    }

    public int yearsBetween(MyDate other) {
        int years = Math.abs(this.year - other.year);
        if (this.isBefore(other)) {
            if (this.month < other.month || (this.month == other.month
                    && this.day < other.day)) {
                years--;
            }
        } else {
            if (other.month < this.month || (other.month == this.month
                    && other.day < this.day)) {
                years--;
            }
        }
        return years;
    }

    public int numberOfDaysInMonth() {
        switch (month) {
            case 2:
                if (isLeapYear()) {
                    return 29;
                }
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public String toString() {
        String s = "";
        if (day < 10) {
            s += "0";
        }
        s += day + "/";
        if (month < 10) {
            s += "0";
        }
        s += month + "/";
        s += year;
        return s;
    }
}


