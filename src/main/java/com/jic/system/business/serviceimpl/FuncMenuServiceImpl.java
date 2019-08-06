package com.jic.system.business.serviceimpl;

import com.jic.system.business.dto.funcmenu.FuncMenuVO;
import com.jic.system.business.service.FuncMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lvcn on 2019-7-16.
 */
@Service("jic.menu.FuncMenuServiceImpl")
public class FuncMenuServiceImpl implements FuncMenuService {

    @Autowired
    MongoTemplate mongotemplate;

    @Override
    public List<FuncMenuVO> getAllMenu() {
        Query query = new Query();
        query.addCriteria(Criteria.where("target").is("jic-leasing"));
        List<FuncMenuVO> menuVOS = mongotemplate.find(query, FuncMenuVO.class,"func-menu");
        return menuVOS;
    }

    @Override
    public List<FuncMenuVO> getMenuByRole() {
        return null;
    }

    @Override
    public List<FuncMenuVO> getMenuByUser() {
        return null;
    }
}
