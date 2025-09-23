package br.com.wsoubar.earth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller()
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping({"/", "/home"})
    public ModelAndView home() {
        logger.info("--- home ---");
        String titulo = "Desafios";
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("titulo", titulo);
        return mv;
    }

}
