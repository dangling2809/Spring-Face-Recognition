package com.faces.controller;

import com.faces.controller.util.FaceRecognition;
import com.googlecode.javacv.cpp.opencv_core;
import static com.googlecode.javacv.cpp.opencv_core.CV_AA;
import static com.googlecode.javacv.cpp.opencv_core.IPL_DEPTH_8U;
import static com.googlecode.javacv.cpp.opencv_core.cvGetSeqElem;
import static com.googlecode.javacv.cpp.opencv_core.cvLoad;
import static com.googlecode.javacv.cpp.opencv_core.cvPoint;
import static com.googlecode.javacv.cpp.opencv_core.cvRectangle;
import static com.googlecode.javacv.cpp.opencv_highgui.cvLoadImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvSaveImage;
import static com.googlecode.javacv.cpp.opencv_imgproc.CV_BGR2GRAY;
import static com.googlecode.javacv.cpp.opencv_imgproc.cvCvtColor;
import com.googlecode.javacv.cpp.opencv_objdetect;
import static com.googlecode.javacv.cpp.opencv_objdetect.cvHaarDetectObjects;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class HelloController {

    private static final String CASCADE_FILE = "C:\\opencv\\sources\\data\\haarcascades/haarcascade_frontalface_alt.xml";

    @RequestMapping(value="/{what}",method = RequestMethod.GET)
    public String printWelcome(@PathVariable String what,ModelMap model) {
        return what;
    }

    @RequestMapping(value = "/recognize")
    public ModelAndView recognize() {
        ModelAndView mav = new ModelAndView("hello");
        FaceRecognition recognition=new FaceRecognition();
        recognition.startRecognition();
        return mav;
    }

}
