package cms.data.user.dao;

import cms.data.user.model.User;

import java.util.List;

/**
 * Created by admin on 2016/1/7.
 */
public interface IUserDao {
    User selectById(String id) throws Exception;
    User insert(User user) throws Exception;
    void delete(User user) throws Exception;
    List<User> selectAll() throws Exception;
}
