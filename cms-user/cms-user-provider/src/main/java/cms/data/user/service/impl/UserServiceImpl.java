package cms.data.user.service.impl;

import cms.data.user.dao.IUserDao;
import cms.data.user.model.User;
import cms.data.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2016/1/7.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    public User getById(String id) throws Exception {
        return userDao.selectById(id);
    }

    public List<User> listAll() throws Exception {
        return userDao.selectAll();
    }

    public void remove(User user) throws Exception {
        userDao.delete(user);
    }

    public User save(User user) throws Exception {
        return userDao.insert(user);
    }

}
