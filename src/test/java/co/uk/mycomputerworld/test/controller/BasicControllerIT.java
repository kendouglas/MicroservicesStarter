package co.uk.mycomputerworld.test.controller;

import co.uk.mycomputerworld.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BasicControllerIT {

    private static final String LOCAL_HOST = "http://localhost:";
    @LocalServerPort
    private int port;
    private TestRestTemplate template = new TestRestTemplate();

    @Test
    public void welcome() throws Exception {
        ResponseEntity<String> response = template.getForEntity(createURL("/welcome"), String.class);
        assertThat(response.getBody(), equalTo("Hello World"));
    }

    private String createURL(String uri) {
        return LOCAL_HOST + port + uri;
    }


}
