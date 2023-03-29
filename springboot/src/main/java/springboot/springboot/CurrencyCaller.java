package springboot.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyCaller {

    @Autowired
    private Currency currency;
    @RequestMapping("/currencies")
    public Currency getCurrency(){
        return currency;
    }


}
