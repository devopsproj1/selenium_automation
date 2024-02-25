package group_attribute;

import org.testng.annotations.Test;

public class groupAttrDemo2 {
    @Test(groups = {"smoke"})
    public  void demo2(){
        System.out.println("demo2");
    }
    @Test(groups = {"smoke","regression"})
    public  void demo3(){
        System.out.println("demo3");
    }
    @Test(groups = {"smoke"})
    public  void demo4(){
        System.out.println("demo4");
    }
}
