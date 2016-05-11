package cn.com.cufs.house;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by say on 5/11/16.
 */
//@Controller
public class IndexContorller {

//    @RequestMapping("/")
    public String index(){
        return "static/index.html";
    }
}
