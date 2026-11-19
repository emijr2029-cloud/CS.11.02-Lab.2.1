/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Emi Ruijs
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int call_a = add(7,7);
        System.out.println(call_a);
        int call_b = add(7,7,7,7);
        System.out.println(call_b);
        String call_morningGreeting = morningGreeting("Emi");
        System.out.println(call_morningGreeting);
        String call_afternoonGreeting = afternoonGreeting("Emi");
        System.out.println(call_afternoonGreeting);
        String call_triple = triple("Emi");
        System.out.println(call_triple);
        double call_half = half(8);
        System.out.println(call_half);
        int call_round_positive = roundPositiveValueToNearestInteger(7.5);
        System.out.println(call_round_positive);
        int call_round_negative = roundNegativeValueToNearestInteger(-7.5);
        System.out.println(call_round_negative);
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static int add(int w, int x, int y, int z){
        return add(add(w,x),add(y,z));
    }
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }
    public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }
    public static String triple(String text){
        return text + text + text;
    }
    public static double half(int h){
        return h/2.0;
    }
    public static int roundPositiveValueToNearestInteger(double a){
        return (int) (a+ 0.5);
    }
    public static int roundNegativeValueToNearestInteger(double negative){
        return (int) (negative -0.5);
    }

}