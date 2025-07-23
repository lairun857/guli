package com.zsy.member.vo;

import lombok.Data;

/**
 * @Description:
 * @author zsy
 * @email 594983498@qq.com
 * @createTime: 2020-06-27 19:29
 **/

@Data
public class MemberUserLoginVo {

    private String loginacct;

    private String password;

    // 手动添加getter/setter方法以解决编译问题
    public String getLoginacct() {
        return loginacct;
    }

    public void setLoginacct(String loginacct) {
        this.loginacct = loginacct;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
