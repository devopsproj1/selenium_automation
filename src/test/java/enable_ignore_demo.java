import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class enable_ignore_demo {

@Ignore
    @Test
    public void ignore(){
        System.out.println("this is ignore method");
    }

    @Test
    public void enable(){
        System.out.println("this is not ignore method");
    }

    @Test(enabled = false)
    public void enable_false(){
        System.out.println("this is enable_false method");
    }

    @Test(enabled = true)
    public void enable_true(){
        System.out.println("this is enable_true method");
    }

}
