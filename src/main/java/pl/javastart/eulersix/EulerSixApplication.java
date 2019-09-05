package pl.javastart.eulersix;

import pl.javastart.eulersix.service.EulerSixService;

public class EulerSixApplication {
    public static void main(String[] args) {
        int value = 3;
        EulerSixService eulerSixService = new EulerSixService();
        System.out.println(eulerSixService.sumOfSquares(value));
        System.out.println(eulerSixService.squaresOfSum(value));
        System.out.println(eulerSixService.diff(value));
    }
}
