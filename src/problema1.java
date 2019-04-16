public class problema1 {

    public static void main(String[] args) {
        double x = 15.5;
        double f = Math.cbrt(x)
                + Math.log(x)
                - Math.min(Math.tan(x * x), Math.tanh(x * x * x));
        System.out.println("f = "+f);
    }
}
