package jspider.sumSeries;

public class SumOfDivideSquareOfSum {
    public static void main(String[] args) {
     //   1/1*1+1/2*2+1/3*3------up to 100
        int i=1;
        double sum=0;
        while(i<=100){
            sum=sum+(1.0/(i*i));
            i++;
        }
        System.out.println(sum);
    }
}
