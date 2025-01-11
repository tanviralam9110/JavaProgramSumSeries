package jspider.sumSeries;

public class SumOfSum {
    //1+2+3+-------+100
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum is:"+sum);
    }
}