package com.company.online.compiler.controller;

import com.company.online.compiler.service.api.CompileService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Unsecured controller for all users(means guests, admins and super-admins) while them unauthorised.
 */
@Controller
public class CommonController {

    @Autowired
    private CompileService compileService;

    /**
     * Apache log4j object is used to logging all important info.
     */
    private static final Logger log = Logger.getLogger(CommonController.class);

    @RequestMapping(value = "/")
    public String redirectToMainPage() {
        return "redirect:/home";
    }

    @RequestMapping(value = "/home")
    public String getMainPage() {
        return "main";
    }

    @RequestMapping(value = "/compile", method = RequestMethod.POST)
    public ModelAndView compileCodeAndGetResultPage(@RequestParam(name = "code") String code) {
        ModelAndView result = new ModelAndView("result");
        result.addObject("compilationResult", compileService.compileCode(code));

        return result;
    }
}
