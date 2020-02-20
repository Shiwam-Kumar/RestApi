package login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class LoginControl {
    @Autowired
    services service;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLogin()
    {
        return "login here";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcome( @RequestParam String id, @RequestParam String password )
    {
        boolean validation = service.validate(id,password);
        if(!validation)
        {
            return "Invalid input";
        }
        else
        {
            return "login successful, Shiwam Karn welcomes you";
        }
    }
}
