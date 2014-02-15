/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.faces.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Dangling
 */
@Controller
@RequestMapping("/capture")
public class CaptureController {
    
    private ModelAndView mav;
    
    @RequestMapping(value = "/snapshot")
    public ModelAndView saveSnapshot(@RequestParam String rollNumber)
    {
        mav=new ModelAndView();
        
        return mav;
    }
}
