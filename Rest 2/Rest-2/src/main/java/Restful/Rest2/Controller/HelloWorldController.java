package Restful.Rest2.Controller;


import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
public class HelloWorldController {
    private MessageSource messageSource;


    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;

    }

    @GetMapping("/HelloWorld")
    public String helloWorld(){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("hello.world.message",null,
                "Default Message",locale);
    }

    @GetMapping("/Hello1/{user}")
    public String helloUser(@PathVariable String user){
        return "Hello "+user;
    }


}

