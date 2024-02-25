package partial_group_class_level;

import org.testng.annotations.Test;
@Test(groups = "all")
public class class_a {

        @Test(groups = {"smoke","all"})
        public void mt1(){
            System.out.println("smoke");
        }
        @Test(groups = {"sanity","all"})
        public void mt2(){
            System.out.println("sanity");
        }
        @Test(groups = {"regression","all"})
        public void mt3(){
            System.out.println("regression");
        }}



