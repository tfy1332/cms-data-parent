package cms.data.user.dao.impl;

import cms.data.user.dao.IUserDao;
import cms.data.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by admin on 2016/1/7.
 */
@Component("userDao")
public class UserDaoImpl implements IUserDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void delete(User user) throws Exception {
        mongoTemplate.remove(user);
    }

    public User insert(User user) throws Exception {
        mongoTemplate.save(user);
        return user;
    }

    public List<User> selectAll() throws Exception {
        return mongoTemplate.findAll(User.class);
    }

    public User selectById(String id) throws Exception {
        Query query = new Query(Criteria.where("_id").is(id));
        return mongoTemplate.findOne(query, User.class);
    }
}
