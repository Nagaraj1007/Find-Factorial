
public class Main {

    public static int factorialOfANumber(int number){
        if(number == 1){
            return 1;
        }
        return factorialOfANumber(number - 1) * number ;
    }

    public static void main(String[] args) {
        System.out.println(factorialOfANumber(1));
    }
}