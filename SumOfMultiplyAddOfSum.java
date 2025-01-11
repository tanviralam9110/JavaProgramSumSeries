package jspider.sumSeries;

public class SumOfMultiplyAddOfSum {
    public static void main(String[] args) {
        //1*2*3+2*3*4+3*4*5+-----+ UpTo 100
        int i=1;
        double sum=0;
        while (i<=100){
            sum= sum+i*(i+1)*(i+2);
            i++;
        }
        System.out.println(sum);
    }
}
