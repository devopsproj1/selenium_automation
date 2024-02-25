import org.testng.annotations.Test;

public class prioritydemo {


    @Test(priority = 2)
    public void first() {
        System.out.println("first");
    }

    @Test(priority = 1)
    public void second() {
        System.out.println("second");
    }

    @Test(priority = 4)
    public void third() {
        System.out.println("third");
    }

    @Test(priority = 3)
    public void four() {
        System.out.println("four");
    }

}
