package steps;


import org.apache.commons.math3.analysis.function.Add;
import pages.*;

public class PageInitializer {

    public static LoginPage loginPage;



   public static void initializePageObjects(){
       loginPage = new LoginPage();

   }
}
