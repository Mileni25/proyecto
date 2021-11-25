package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage {
    public static final Target LOGIN_BUTTON = Target.the("boton que abre el registro")
            .located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/header/div[1]/nav/ul[2]/li/a"));
    public static final Target INPUT_USER = Target.the("ingresar usuario")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("ingresar clave")
            .located(By.id("password"));
    public static final Target ACCESS_BUTTON = Target.the("boton de acceso")
            .located(By.xpath("//*[@id=\"Ingresar\"]/div/div/div[2]/div[2]/form/div[3]/button"));
}
