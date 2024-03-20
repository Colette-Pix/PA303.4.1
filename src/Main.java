import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LessThan10(7);
        LessThan10(15);
        LessThanOrGreaterThan10(7);
        LessThanOrGreaterThan10(15);
        Between10And20(15);
        Between10And20(50);
        IsInRange(15);
        IsInRange(5);

        int grade,day,salary;
        Scanner scan = new Scanner(System.in);
        grade= scan.nextInt();
        day=scan.nextInt();
        scan.nextLine(); //consume the empty line break
        String FilingStatus;
        FilingStatus = scan.nextLine();
        salary=scan.nextInt();
        scan.close();
        GetLetterGrade(grade);
        WeekdayName(day);
        GetTax(FilingStatus,salary);
    }



    public static void LessThan10(int x){
        if (x < 10){
            System.out.println("Less than 10");
        }
    }

    public static void LessThanOrGreaterThan10(int x){
        if (x < 10){
            System.out.println("Less than 10");
        } else if (x > 10) {
            System.out.println("Greater than 10");
        }
    }

    public static void Between10And20(int x){
        if (x < 10){
            System.out.println("Less than 10");
        } else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        }
        else if (x >= 20){
            System.out.println("Greater than or equal to 20");
        }
    }

    public static void IsInRange(int x){
        if (x < 10 || x > 20){
            System.out.println("Out of range");
        } else  {
            System.out.println("In range");
        }

    }

    public static void GetLetterGrade(int x){


        if (x >= 90 && x <= 100){
            System.out.println("A");
        }
        else if (x >= 80 && x < 90){
            System.out.println("B");
        }
        else if (x >= 70 && x < 80){
            System.out.println("C");
        }
        else if (x >= 60 && x < 70){
            System.out.println("D");
        }
        else if (x < 60  && x >= 0){
            System.out.println("F");
        }
        else{
            System.out.println("Score out of range");
        }
    }

    public static void WeekdayName(int x){


        switch (x) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Out of range");
        }
    }

    public static void GetTax(String fStatus, double income){
    int result = -1;
        switch (fStatus){
            case ("Single"):
                result=GetSingleRate(income);
                break;
            case ("Married Filing Jointly"):
            case ("Qualifying Widow"):
            case ("Qualifying Widower"):
                result=GetJointRate(income);
                break;
            case ("Married Filing Separately"):
                result = GetSeparateRate(income);
                break;
            case ("Head of Household"):
                result = GetHOHRate(income);
                break;

        }


        System.out.println(result*income/100);
    }

    public static int GetSingleRate(double income){
        if (income >= 0 && income <=8350){
            return (10);
        }
        else if (income >= 8351 && income <=33950){
            return (15);
        }
        else if (income >= 33951 && income <=82250){
            return(25);
        }
        else if (income >= 82251 && income <=171550){
            return(28);
        }
        else if (income >= 171551 && income <=372950){
            return(33);
        }
        else if (income >= 372951){
            return(35);
        }
        return (-1);
    }

    public static int GetJointRate(double income){
        if (income >= 0 && income <=16700){
            return (10);
        }
        else if (income >= 16701 && income <=67900){
            return (15);
        }
        else if (income >= 67901 && income <=137050){
            return(25);
        }
        else if (income >= 137051 && income <=208850){
            return(28);
        }
        else if (income >= 208851 && income <=372950){
            return(33);
        }
        else if (income >= 372951){
            return(35);
        }
        return (-1);
    }

    public static int GetSeparateRate(double income){
        if (income >=  0 && income <=33950){
            return (GetSingleRate(income));
        }
        else if (income >= 33951 && income <=68525){
            return(25);
        }
        else if (income >= 68526 && income <=104425){
            return(28);
        }
        else if (income >= 104426 && income <=186375){
            return(33);
        }
        else if (income >= 186375){
            return(35);
        }
        return (-1);
    }

    public static int GetHOHRate(double income){
        if (income >=  0 && income <=11950){
            return (10);
        }
        else if (income >= 11951 && income <=45500){
            return(15);
        }
        else if (income >= 45501 && income <=117450){
            return(25);
        }
        else if (income >= 117451 && income <=190200){
            return(28);
        }
        else if (income >= 190201 && income <=372951){
            return(33);
        }
        else if (income >= 186375){
            return(35);
        }
        return (-1);
    }

}

