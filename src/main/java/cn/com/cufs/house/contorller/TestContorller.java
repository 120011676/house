package cn.com.cufs.house.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by say on 5/11/16.
 */
@Controller
public class TestContorller {

    @RequestMapping("test")
    public ModelAndView t(){
        return new ModelAndView("t.html");
    }
}
