package com.jic.system.business.dto.power;

import com.jic.system.business.dto.ref.OrgRefVO;
import com.jic.system.business.dto.ref.UserRefVO;

/**
 * Created by lvcn on 2019-7-16.
 * 机构业务对象
 */
public class OrgVO {
    //主键
    public String pk_org;
    //机构号
    public String org_code;
    //机构简称
    public String short_name;
    //机构名称
    public String org_name;
    //上级机构
    public OrgRefVO parent_pk;
    //建立日期
    public String found_date;
    //状态
    public Short datastatus;
    //操作人
    public UserRefVO pk_operator;
    //操作日期
    public String operate_date;
    //操作时间
    public String operate_time;
    //登陆标识
    public Boolean login_tag;
    //是否锁定
    public Boolean locked_tag;
    //机构级别
    public Short org_level;
    //机构状态
    public Short org_status;
    //一级机构
    public String one_level_org;

    public String getPk_org() {
        return pk_org;
    }

    public void setPk_org(String pk_org) {
        this.pk_org = pk_org;
    }

    public String getOrg_code() {
        return org_code;
    }

    public void setOrg_code(String org_code) {
        this.org_code = org_code;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public OrgRefVO getParent_pk() {
        return parent_pk;
    }

    public void setParent_pk(OrgRefVO parent_pk) {
        this.parent_pk = parent_pk;
    }

    public String getFound_date() {
        return found_date;
    }

    public void setFound_date(String found_date) {
        this.found_date = found_date;
    }

    public Short getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Short datastatus) {
        this.datastatus = datastatus;
    }

    public UserRefVO getPk_operator() {
        return pk_operator;
    }

    public void setPk_operator(UserRefVO pk_operator) {
        this.pk_operator = pk_operator;
    }

    public String getOperate_date() {
        return operate_date;
    }

    public void setOperate_date(String operate_date) {
        this.operate_date = operate_date;
    }

    public String getOperate_time() {
        return operate_time;
    }

    public void setOperate_time(String operate_time) {
        this.operate_time = operate_time;
    }

    public Boolean getLogin_tag() {
        return login_tag;
    }

    public void setLogin_tag(Boolean login_tag) {
        this.login_tag = login_tag;
    }

    public Boolean getLocked_tag() {
        return locked_tag;
    }

    public void setLocked_tag(Boolean locked_tag) {
        this.locked_tag = locked_tag;
    }

    public Short getOrg_level() {
        return org_level;
    }

    public void setOrg_level(Short org_level) {
        this.org_level = org_level;
    }

    public Short getOrg_status() {
        return org_status;
    }

    public void setOrg_status(Short org_status) {
        this.org_status = org_status;
    }

    public String getOne_level_org() {
        return one_level_org;
    }

    public void setOne_level_org(String one_level_org) {
        this.one_level_org = one_level_org;
    }
}
