/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.faces.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    
   @RequestMapping(value = "/set/rollnumber",method = RequestMethod.POST)
    public ModelAndView setRollnumber(HttpServletRequest  request){
        String roll =  request.getParameter("tbRollNumber");
        System.out.println("....................rollNumber = "+roll);
        mav=new ModelAndView("upload");
        return mav;
    }
  
     @RequestMapping(value = "/save/snapshot",method = RequestMethod.POST)
    public ModelAndView saveSnapshot(@RequestParam(value="sam",required = false)String sam){
        System.out.println("....................rollNumber = "+sam);
        mav=new ModelAndView("upload");
        return mav;
    }
}
