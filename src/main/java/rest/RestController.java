package rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/get-message")
    public String getMessage(){
        return "Wellcome to Spring Rest";
    }
}
