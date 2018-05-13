public class Pi2 {

    public static void main(String args[]){

        //Используем ряд Лейбница π = (4/1) — (4/3) + (4/5) — (4/7) + (4/9) — (4/11) + (4/13) — (4/15) …
        double pi = 4.0/1 - 4.0/3 + 4.0/5 - 4.0/7;

        int n = 9;
        for (int i=0; i<800000000; i++){
            pi += 4.0/n;
            n += 2;
            pi -= 4.0/n;
            n += 2;
        }
        System.out.println("pi = " + (double)Math.round(pi * 10000000000d) / 10000000000d);
        double p = Math.PI;
        System.out.println("Math.PI = " + (double)Math.round(p * 10000000000d) / 10000000000d);
    }
}
