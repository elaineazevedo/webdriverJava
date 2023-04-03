package tests;

//Para importar todos os métodos estáticos de assert, fazer no formato abaixo
import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InformacoesUsuarioTest {
    @Test
    //classes de teste sempre sao publicas e nao retornam valor (void). O método de teste tbm se inicia com o prefixo Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){
        //Abrindo o navegador
        String setProperty = System.setProperty("webdriver.chrome.driver", "C:\\Users\\elain\\Drivers\\chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver navegador = new ChromeDriver();

        //Navegando para a página do Taskit!
        navegador.get("http://www.juliodelima.com.br/taskit");

        //Validação - classe de validação
        assertEquals(1,1);

    }

}
