package guru.springframework;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthorIntegrationIT {

    @Test
    void testAppIsReachableAndDatabaseIsPopulated() {
        // 1. Hol den dynamischen Port, den Maven uns gegeben hat
        String port = System.getProperty("it.app.port", "8080");
        String url = "http://localhost:" + port + "/";

        // 2. Rufe die Startseite der App im Container auf
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        // 3. Prüfen, ob die Seite geladen wurde und (z.B.) ein Autor aus deinem SQL-Skript drinsteht
        assertTrue(response.contains("Spring Framework Guru"));
        System.out.println("Integration Test erfolgreich auf Port: " + port);
    }
}