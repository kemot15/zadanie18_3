package pl.javastart;

import pl.javastart.service.EulerSixService;

public class Main {
    public static void main(String[] args) {
        EulerSixService eulerSixService = new EulerSixService();
        eulerSixService.getClass();
        System.out.println(eulerSixService.toString());
    }
}
