package jspider.sumSeries;

public class SumOfOddNumber {
    public static void main(String[] args) {
        // 1+3+5+7+---------- up to 100
        int i=1;
        int sum=0;
        while (i<=100){
            if (i%2!=0)
                sum=sum+i;
            i++;
        }
        System.out.println("Sum of all odd number up to 100 is:"+sum);
    }
}
