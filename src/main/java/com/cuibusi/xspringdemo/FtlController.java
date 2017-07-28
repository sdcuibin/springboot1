package com.cuibusi.xspringdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author cuibusi
 * @create 2017-07-28 9:59
 **/
@Controller
public class FtlController {

    @RequestMapping("helloFtl")
    public String helloFtl(Map<String,Object> map){
        map.put("name","cuibin");
        return "helloFtl";
    }
}
