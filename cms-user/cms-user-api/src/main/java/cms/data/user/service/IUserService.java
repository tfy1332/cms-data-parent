package cms.data.user.service;

import cms.data.user.model.User;

import java.util.List;

/**
 * Created by admin on 2016/1/7.
 */
public interface IUserService {
    /**
     * 通过主键ID值获取User对象
     * @param id
     * @return
     * @throws Exception
     */
    User getById(String id) throws Exception;
    /**
     * 保存一个user对象
     * @param User
     * @return User
     * @throws Exception
     */
    User save(User user) throws Exception;
    /**
     * 删除一个user对象
     * @param User
     * @return
     * @throws Exception
     */
    void remove(User user) throws Exception;
    /**
     * 获取全部的User列表
     * @param
     * @return List<User>
     * @throws Exception
     */
    List<User> listAll() throws Exception;
}
