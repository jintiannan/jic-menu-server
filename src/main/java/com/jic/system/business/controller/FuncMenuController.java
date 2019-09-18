package com.jic.system.business.controller;

import com.jic.system.business.dto.funcmenu.FuncMenuVO;
import com.jic.system.base.Result;
import com.jic.system.business.service.FuncMenuService;
import com.jic.system.utils.ResultUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by lvcn on 2019-7-11.
 */
@RequestMapping("/funcMenu")
@RestController
public class FuncMenuController {
    @Resource
    FuncMenuService funcMenuService;

    @PostMapping(value = "/getFuncMenu")
    public Result getFuncMenu(){
        List<FuncMenuVO> result = funcMenuService.getAllMenu();
        return ResultUtils.successWithData(result);
    }
    @PostMapping(value = "/list")
    public Result list(){
        List<Map> result = funcMenuService.getAllList();
        return ResultUtils.successWithData(result);
    }

    @PostMapping(value = "/save")
    public Result saveFuncMenu(@RequestParam(value = "data") String data) {
        System.out.printf(data);
        return null;
    }


}
