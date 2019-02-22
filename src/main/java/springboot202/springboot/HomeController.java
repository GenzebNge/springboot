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
        model.addAttribute("song", new Song());
//        model.addAttribute("song", new Song(145,"Teddy", 50, 2018,new Album().setName("Ethiopian")));
//       model.addAttribute("song", new Song(43,  "Fasil", "98",  "2018", 200, 2017));
      return "addsong";
    }

    @PostMapping("/songform")
    public String loadFromPage(@ModelAttribute Song song, Model model){
        model.addAttribute("song", song);
        return  "confirmsong";
    }
}
