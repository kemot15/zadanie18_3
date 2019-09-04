package pl.javastart.service;

public class EulerSixService {
    public static int LOOP;

    public static int sumOfSquares (){
        int sum = 0;
        for (int i = 1; i <= LOOP; i++){
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public static int squaresOfSum (){
        int sum = 0;
        for (int i = 1; i <= LOOP; i++){
            sum += i;
        }
        return (int)(Math.pow(sum, 2));
    }

    public static int diff (){
        return squaresOfSum()-sumOfSquares();
    }
}
