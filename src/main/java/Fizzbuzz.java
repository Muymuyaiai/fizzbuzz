public class Fizzbuzz {

    public static void main(String[] args) {
        System.out.println(fizzbuzz(17));
    }
    public static String fizzbuzz(int i){
        String a;

        if (i % 15 == 0){
            a = "fizzbuzz";
        } else if (i % 3 == 0){
            a = "error";
        } else if (i % 5 == 0){
            a = "buzz";
        } else {
            a = String.valueOf(i);
        }
        return a;
    }
}

