public class Operatory {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int wynik;
 /*
 b--;//dekrementacja czyli odejmuje zawsze 1
 System.out.println(b);
 b++;//inkrementacje czyli oddaje zawsze 1
 System.out.println(b);
 //Wyrażenie modulo %
 wynik=b%a;
 System.out.println(wynik);
 */

        boolean res = a == b;// jest równe
        boolean res2 = a != b;//nie jest równe
        boolean res3 = a > b;// jest większe
        boolean res4 = a < b;//jest mniejsze
        boolean res5 = a >= b;// jest większe lub równe

        System.out.println(res3);
        
/*
boolean flag=(a!=b) && (a>0)&& (a>1); //true
boolean flag2=(a==b) || (b==3) ||(a<10);// true
boolean res=!flag2;// negacja
System.out.println(res);
*/
        a += 2;// prosty zapis a=a+2;
        a -= 2;//prosty zapis a=a-2;
        a *= 2;// prosty zapis a=a*2;
        System.out.println(a);
    }
}
