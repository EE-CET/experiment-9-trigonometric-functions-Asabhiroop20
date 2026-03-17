import java.util.Scanner;
public class Trigonometry {
    public static double sine(double angle){
        double angle_rad=Math.toRadians(angle);
        double Sin=Math.sin(angle_rad);
        return Sin;
    }
    public static double cosine(double angle){
        double angle_rad=Math.toRadians(angle);
        double Cos=Math.cos(angle_rad);
        return Cos;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double theta=sc.nextDouble();
        double sin_result=sine(theta);
        double cos_result=cosine(theta);
        System.out.println("Sine: "+ sin_result);
        System.out.println("Cosine: "+ cos_result);
        sc.close();

    }


    
    
}
