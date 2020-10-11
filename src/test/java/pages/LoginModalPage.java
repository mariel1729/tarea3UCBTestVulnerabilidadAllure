package pages;

            import control.Button;
            import control.TextBox;
            import org.openqa.selenium.By;

public class LoginModalPage {


    public TextBox emailTextBox= new TextBox(By.id("email"),"[email] textbox on Login Modal Page");
    public TextBox passwordTextBox= new TextBox(By.id("password"),"[password] textbox on Login Modal Page");

    public Button signupButton= new Button(By.xpath("//*[@id=\"login_form\"]/button"),"[signup] textbox on Login Modal Page");
    public TextBox verifyText = new TextBox(By.xpath("/html/body/main/div/div[2]/div/div[2]/div"),"mensaje de error");
    public LoginModalPage(){}

}

