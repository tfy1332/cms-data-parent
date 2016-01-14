package cms.data.controller.user;

import cms.data.user.model.User;
import cms.data.user.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2016/1/9.
 */
@Controller
@RequestMapping("/user")
public class UserContoller {
    @Autowired
    private IUserService iUserService;
    Logger logger  =  Logger.getLogger(UserContoller. class );

    /**
     * @author tanfy 2016-01-09
     * 跳转到登录页
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        logger.info("==UserContoller==toLogin===");
        return "/login";
    }

    /**
     *
     * 跳转到主页
     *
     *
     *
     * @author tanfy 2016-01-09
     * @return
     */
    @RequestMapping("/toMain")
    public String toMain(){
        logger.info("==UserContoller==toMain===");
        return "/user/main";
    }

    /**
     * 跳转到新增用户页面
     * @author tanfy 2016-01-09
     * @return
     */
    @RequestMapping("/toAddUser")
    public String toAddUser(){
     logger.info("==UserContoller==toAddUser===");
     return "/user/addUser";
    }

    /**
     * 保存用户信息
     *@author tanfy 2016-01-09
     * @param user
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveUser(@ModelAttribute User user,final HttpServletRequest request,
                           final HttpServletResponse response, final Map<String, Object> model){
        try {
            logger.info("==UserContoller==saveUser===");
            iUserService.save(user);
        } catch (Exception e) {
            logger.error("保存用户信息出错:"+e.getMessage());
            logger.info("保存用户信息出错:"+e.getMessage());
        }
        return "redirect:/user/toUserList" ;
    }

    /**
     * 查询所有用户信息
     *@author tanfy 2016-01-09
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping("/toUserList")
    public String toUserList(final HttpServletRequest request,final HttpServletResponse response,
                             final Map<String, Object> model){
        List<User> userList = null;
        try {
             logger.info("==UserContoller==toUserList===");
             userList = iUserService.listAll();
         } catch (Exception e) {
             logger.error("查询用户信息出错:"+e.getMessage());
         }
            model.put("userList",userList);
         return "/user/userList";
    }

    /**
     * 根据用户id 删除用户
     * @author tanfy 2016-01-09
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping("/delete")
    public String deleteUser(final HttpServletRequest request,final HttpServletResponse response,
                             final Map<String, Object> model){

        try {
            logger.info("==UserContoller==delete===");
            String userId = (String)request.getParameter("id");
            User user = iUserService.getById(userId);
            if (user != null){
                iUserService.remove(user);
            }
        } catch (Exception e) {
            logger.error("删除用户出错:"+e.getMessage());
            e.printStackTrace();
        }
        return "redirect:/user/toUserList" ;
    }

    /**
     * 跳转到修改用户信息页面
     * @author tanfy 2016-01-09
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping("/toUpdate")
    public String toUpdate(final HttpServletRequest request,final HttpServletResponse response,
                           final Map<String, Object> model){
        logger.info("==UserContoller==toUpdate===");
        return "/updateUser";
    }
    @RequestMapping("/updateUser")
    public String updateUser(final HttpServletRequest request,final HttpServletResponse response,
                           final Map<String, Object> model){
        logger.info("==UserContoller==updateUser===");
        return "redirect:/user/toUserList" ;
    }

}
