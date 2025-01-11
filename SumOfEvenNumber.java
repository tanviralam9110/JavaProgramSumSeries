package jspider.sumSeries;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        //2+4+6+------upTo 100;
        int i=1;
        int sum=0;
        while (i<=100){
            if (i%2==0)
                sum=sum+i;
            i++;
        }
        System.out.println("Sum of all even number up to 100 is :"+sum);
    }
}
