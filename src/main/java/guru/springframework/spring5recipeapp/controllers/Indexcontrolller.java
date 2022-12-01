package guru.springframework.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * fileName : Indexcontrolller
 * author :  KimSangHoon
 * date : 2022/12/01
 */
@Controller
public class Indexcontrolller {

    @RequestMapping({"", "/", "'index"})
    public String getIndexPage() {

        System.out.println("Some message to say...5555");

        return "index";
    }
}
