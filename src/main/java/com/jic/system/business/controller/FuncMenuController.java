package com.jic.system.business.controller;

import com.jic.system.business.dto.funcmenu.FuncMenuVO;
import com.jic.system.base.Result;
import com.jic.system.business.service.FuncMenuService;
import com.jic.system.utils.ResultUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lvcn on 2019-7-11.
 */
@RequestMapping("/funcMenu")
@RestController
public class FuncMenuController {
    @Resource
    FuncMenuService funcMenuService;

    @RequestMapping(value = "/getFuncMenu",method = RequestMethod.POST)
    public Result getFuncMenu(){
        List<FuncMenuVO> result = funcMenuService.getAllMenu();
        return ResultUtils.successWithData(result);
    }


}
