package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://backend:8080/", String.class);
        return response;
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Integrations says hello!";
    }

}
