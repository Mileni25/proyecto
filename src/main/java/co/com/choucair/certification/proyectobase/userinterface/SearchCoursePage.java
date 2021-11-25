package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage {
    public static final Target BUTTON_CC = Target.the("selecciona cursos y certificaciones")
            .located(By.xpath("//*[@id=\"certificaciones\"]/div[1]/a/h4/strong"));
    public static final Target SELECT_COURSE = Target.the("Dar click para buscar el curso")
            .located(By.xpath("//*[@id=\"category-course-list\"]/div/div[2]/div/div[3]/div/div/a/div[2]/h4"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//*[@id=\"page-header\"]/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));
}
