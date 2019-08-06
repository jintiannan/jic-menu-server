package com.jic.system.business.dto.power;

/**
 * Created by lvcn on 2019-7-16.
 * 用户管理业务对象
 */
public class UserVO {
    //主键
    public String pk_user;
    //用户名称
    public String user_name;
    //用户编码
    public String user_code;
    //密码
    public String password;
    //开始时间
    public String begin_date;
    //结束时间
    public String end_date;
    //是否锁定
    public Boolean locked_tag;
    //机构
    public String pk_org;
    //是否管理员
    public Boolean is_admin;
    //用户角色
    public Short user_role;
    //电话号码
    public String tel_no;
    //用户名
    public String psnname;
    //部门名称
    public String psndeptname;


    public String getPk_user() {
        return pk_user;
    }

    public void setPk_user(String pk_user) {
        this.pk_user = pk_user;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBegin_date() {
        return begin_date;
    }

    public void setBegin_date(String begin_date) {
        this.begin_date = begin_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public Boolean getLocked_tag() {
        return locked_tag;
    }

    public void setLocked_tag(Boolean locked_tag) {
        this.locked_tag = locked_tag;
    }

    public String getPk_org() {
        return pk_org;
    }

    public void setPk_org(String pk_org) {
        this.pk_org = pk_org;
    }

    public Boolean getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(Boolean is_admin) {
        this.is_admin = is_admin;
    }

    public Short getUser_role() {
        return user_role;
    }

    public void setUser_role(Short user_role) {
        this.user_role = user_role;
    }

    public String getTel_no() {
        return tel_no;
    }

    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }

    public String getPsnname() {
        return psnname;
    }

    public void setPsnname(String psnname) {
        this.psnname = psnname;
    }

    public String getPsndeptname() {
        return psndeptname;
    }

    public void setPsndeptname(String psndeptname) {
        this.psndeptname = psndeptname;
    }
}
