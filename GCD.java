public class GCD {

    static int gcd(int a,int b){
        if (b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
    public static void main(String[] args) {
       int result = gcd(1024, 612);
        System.out.println("The gcd of 1024 and 612 is : " + result);
    }
}
