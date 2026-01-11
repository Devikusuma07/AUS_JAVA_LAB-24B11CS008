public class LogicalOperators {
    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        int x = 7;
        int y = 3;

        boolean r = a > b;
        boolean re = a < b;
        boolean res = a == b;
        boolean resu = a != b;
        boolean resul = a >= b;
        boolean result = a <= b;
        boolean result1 = (a > b) && ( x > y);
        boolean result2 = (a > b) || ( x > y);
        boolean result3 = (a > b) != ( x > y);

        System.out.println("a > b:" + r);
        System.out.println("a < b:" + re);
        System.out.println("a == b:" + res);
        System.out.println("a != b:" + resu);
        System.out.println("a >= b:" + resul);
        System.out.println("a <= b:" + result);
        System.out.println("(a > b) && (x > y):" + result1);
        System.out.println("(a > b) || (x > y):" + result2);
        System.out.println("(a > b) != (x > y):" + result3);

    }
    
}
