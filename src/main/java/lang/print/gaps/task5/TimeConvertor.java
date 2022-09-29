package lang.print.gaps.task5;

public class TimeConvertor {

    public static double convert(float minutes) {
        return minutes * 60;
    }

    public static void main(String[] args) {
        System.out.println(convert(30));
    }
}
