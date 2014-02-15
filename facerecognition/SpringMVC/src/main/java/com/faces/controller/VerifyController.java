/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.faces.controller;

import java.io.FileOutputStream;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Dangling
 */
@Controller
@RequestMapping("/verify")
public class VerifyController {
    
    private ModelAndView mav;
    
    @Value("${file.store.path}")
    private String fileStoreURL;
    
    @RequestMapping(value = "/snapshot")
    public ModelAndView verifySnapshot(HttpServletRequest request,HttpServletResponse response)
    {
        mav=new ModelAndView();
        try {
			long time = new Date().getTime();

			FileOutputStream fileOutputStream = new FileOutputStream(
					fileStoreURL + "/" + time + ".jpg");
			int res;
			while ((res = request.getInputStream().read()) != -1) {
				fileOutputStream.write(res);
			}
			fileOutputStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}        
        return mav;
    }
    
}
