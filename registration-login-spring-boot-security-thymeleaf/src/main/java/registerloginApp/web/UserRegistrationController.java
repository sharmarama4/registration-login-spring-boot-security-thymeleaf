package registerloginApp.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import registerloginApp.model.User;
import registerloginApp.service.UserService;
import registerloginApp.web.dto.UserRegistrationDto;

@Controller

public class UserRegistrationController {
    private UserService userService;
    @Autowired
    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }
   /* @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto(){
    return new UserRegistrationDto();
    }*/
  /*  @GetMapping("/registration")
    public String showRegistrationForm(Model model){
        model.addAttribute("user",new UserRegistrationDto());
    return"registration";
    }*/
   @GetMapping("/registration")
   public String showRegistrationForm(Model model) {
       model.addAttribute("user", new User());
       return "registration";
   }
    @PostMapping("/registration")
    public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto){
    userService.save(registrationDto);
    return "redirect:/registration?success";
    }
}
