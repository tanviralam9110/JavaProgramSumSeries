package jspider.sumSeries;

public class MultiplyOfSum {
    public static void main(String[] args) {
        //1*2+2*3+3*4+-----------99*100;
        int i=1;
        long sum=0;
        while (i<=99){
            sum=sum+i*(i+1);
            i++;
        }
        System.out.println(sum);
    }
}
