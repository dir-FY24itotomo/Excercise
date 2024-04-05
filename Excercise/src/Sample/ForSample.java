package Sample;

public class ForSample {

    public static void main(String[] args) {
        for (var i = 1; i <= 10; i++) {
            if(i<3) {
                continue;
            }else if (i<7) {
                System.out.println(i);
            }else {
                System.out.println(i*10);
            }
        }
    }

}