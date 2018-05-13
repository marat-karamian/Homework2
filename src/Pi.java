public class Pi {

    public static void main(String args[]){

        //используем ряд Никаланта: π = 3 + 4/(2*3*4) — 4/(4*5*6) + 4/(6*7*8) — 4/(8*9*10) + 4/(10*11*12) — (4/(12*13*14) …
        double pi = 3 + 4.0/(2*3*4) - 4.0/(4*5*6);
        int a = 6, b = 7, c = 8;

        for (float i=0; i<366.5; i++){
            pi += 4.0/(a*b*c);
            a+=2;
            b+=2;
            c+=2;
            pi -= 4.0/(a*b*c);
            a+=2;
            b+=2;
            c+=2;
        }
        System.out.println("pi = " + (double)Math.round(pi * 10000000000d) / 10000000000d);
        double p = Math.PI;
        System.out.println("Math.PI = " + (double)Math.round(p * 10000000000d) / 10000000000d);

    }
}
