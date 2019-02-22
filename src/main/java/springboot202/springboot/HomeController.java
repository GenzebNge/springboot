package springboot202.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage()
    {
        return "index";
    }
    @GetMapping("/songform")
    public String loadFormPage(Model model){
        model.addAttribute("song", new Song(43,  "Traditional", "Tedy",  "twelve", 200, 2017));
        return "songform";
    }

    @PostMapping("/songform")
    public String loadFromPage(@ModelAttribute Song song, Model model){
        model.addAttribute("song", song);
        return  "confirmsong";
    }
}
