package cn.com.cufs.house.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by say on 5/11/16.
 */
@RestController
public class TestAjaxContorller {

    @RequestMapping("a")
    public String a(){
        return "ajax";
    }
}
