package mymodapp.appsrc.appstart.appstart.mymodappdemo;

import mymodapp.appsrc.appfunc.appfunc.simplefunce.SimpleMath;

public class MyModApp {
    public static void main(String[] args) {
        if (SimpleMath.isFactor(2, 10))
            System.out.println("2 is a factor 10");
        System.out.println("Smallest common factor 35 and 105 will be " +SimpleMath.lcf(35, 105));
        System.out.println("Largest common factor 35 and 105 will be " + SimpleMath.gcf(35, 105));
    }
}
