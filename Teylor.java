import java.text.NumberFormat;

public class Teylor {
    Teylor(float x_, int k_){
        x = x_;
        k = k_;
        a = Math.sin(x);
        e = Math.pow(10,-k);
    }
    public void findRow(){
        while(Math.abs(elem) > e) {
            c += elem;
            elem *= -1;
            elem /= n * (n - 1);
            elem *= x * x;
            n += 2;
        }

        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(k+1);
        System.out.println("Hello Java!");
        System.out.println(a);
        System.out.println(c);
        System.out.println(Math.abs(a-c));
    }
    float x;
    int k;
    double a;
    double e;
    double c = x;
    int n = 2;
    double elem = 1;
}