package jspider.sumSeries;

public class SumDivideOfMultiplyOfSum {
    public static void main(String[] args) {
        // 1/1*2+1/2*3+1/3*4+----- up to 100
        int i=1;
        double sum=0;
        while (i<=100){
            sum= sum+(1.0/(i*(i+1)));
            i++;
        }
        System.out.println(sum);
    }
}
