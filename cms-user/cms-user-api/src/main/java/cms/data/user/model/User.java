package cms.data.user.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by admin on 2016/1/7.
 */
@Document(collection = "data_user")
public class User implements java.io.Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 3838120300031725099L;
    @Id
    private String id;

    private String userid;

    private String userName;
    private String userPWD;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPWD() {
        return userPWD;
    }

    public void setUserPWD(String userPWD) {
        this.userPWD = userPWD;
    }
}
