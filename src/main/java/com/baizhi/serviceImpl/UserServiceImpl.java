package com.baizhi.serviceImpl;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao udao;


    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<User> queryAllUser() {
        return udao.selectAllUser();
    }
}
