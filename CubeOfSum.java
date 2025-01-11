package jspider.sumSeries;

public class CubeOfSum {
    public static void main(String[] args) {
        //1*1*1+2*2*2+3*3*3+------------+100*100*100
        int i=1;
        int sum=0;
        while(i<=100){
            sum  =sum+(i*i*i);
            i++;
        }
        System.out.println("Sum of all cube up to 100 (1*1*1) is:"+sum);
    }
}
