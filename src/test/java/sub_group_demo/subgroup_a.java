package sub_group_demo;

import org.testng.annotations.Test;

public class subgroup_a {
    @Test(groups = "windows.linux")
    public  void subgroupm1(){
        System.out.println("linux");
    }
    @Test(groups = "windows.ubuntu")
    public  void subgroupm2(){
        System.out.println("ubuntu");
    }
    @Test(groups = "windows.fedora")
    public  void subgroupm3(){
        System.out.println("fedora");
    }

}
