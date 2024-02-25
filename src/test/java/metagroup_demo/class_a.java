package metagroup_demo;

import org.testng.annotations.Test;

public class class_a {
    @Test(groups = {"smoke"})
    public void mt1(){
        System.out.println("smoke");
    }
    @Test(groups = {"sanity"})
    public void mt2(){
        System.out.println("sanity");
    }
    @Test(groups = {"regression"})
    public void mt3(){
        System.out.println("regression");
    }

}
