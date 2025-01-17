package com.shu.ming.mp.modules.login.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shu.ming.mp.modules.login.bean.UserInfo;
import com.shu.ming.mp.modules.login.dto.LoginDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface LoginService extends IService<UserInfo> {
    boolean isExist(LoginDTO loginDTO);
    UserInfo findUserById(int id );



    UserInfo findOneByNameAndPwd(String userName, String password);
}
