package cn.com.cufs.house.service.impl;

import cn.com.cufs.house.dao.TestDao;
import cn.com.cufs.house.entity.User;
import cn.com.cufs.house.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by say on 5/11/16.
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestDao testDao;

    public List<User> list() {
        return this.testDao.list();
    }
}
