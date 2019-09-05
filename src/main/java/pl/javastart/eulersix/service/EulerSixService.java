package pl.javastart.eulersix.service;

public class EulerSixService {

    public int sumOfSquares (int loop){
        int sum = 0;
        for (int i = 1; i <= loop; i++){
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public int squaresOfSum (int loop){
        int sum = 0;
        for (int i = 1; i <= loop; i++){
            sum += i;
        }
        return (int)(Math.pow(sum, 2));
    }

    public int diff (int loop){
        return squaresOfSum(loop)-sumOfSquares(loop);
    }
}
