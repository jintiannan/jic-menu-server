package com.jic.system.business.controller;

import com.jic.system.base.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lvcn on 2019-7-15.
 */
@RestController
@RequestMapping("/remindMsg")
public class RemindMsgController {

    @RequestMapping(value = "unReadMsg",method = RequestMethod.POST)
    public Result unReadMsg(){
        Result vo = new Result();

        return vo;
    }
}
