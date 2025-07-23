package com.zsy.member.vo;

import lombok.Data;

/**
 * @Description:
 * @author zsy
 * @email 594983498@qq.com
 * @createTime: 2020-06-27 15:37
 **/

@Data
public class MemberUserRegisterVo {

    private String userName;

    private String password;

    private String phone;

    // 手动添加getter/setter方法以解决编译问题
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
