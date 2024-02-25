import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter_demo {


    @Parameters("name")



    @Test(priority = 2)
    public void first(@Optional("rahul") String name) {
        System.out.println(name);
    }
    @Parameters("putin")
    @Test(priority = 1)
    public void second(@Optional("rahul is parameter") String putin) {
        System.out.println(putin);
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


