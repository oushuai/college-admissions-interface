package com.ganzhou.controller;

import com.ganzhou.domain.User;
import com.ganzhou.service.IUserService;
import com.ganzhou.utils.AjaxResult;
import com.ganzhou.utils.Md5Utils;
import com.ganzhou.utils.ServletUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.Subject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ouyangjie
 * @createTime 2021-01-07 19:53
 */

/**
 * 登录验证
 *
 * @author ruoyi
 */
@Controller
public class LoginController extends BaseController
{
    @Autowired
    private IUserService userService;


    @GetMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response)
    {
        // 如果是Ajax请求，返回Json字符串。
        if (ServletUtils.isAjaxRequest(request))
        {
            return ServletUtils.renderString(response, "{\"code\":\"1\",\"msg\":\"未登录或登录超时。请重新登录\"}");
        }

        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public AjaxResult ajaxLogin(String username, String password)
    {
        User user = userService.selectUserById(username);
        if(user==null) {
            return AjaxResult.error("用户不存在");
        }else {
            if(Md5Utils.hash(password).equals(user.getPassword())) {
                return AjaxResult.success();
            }else {
                return AjaxResult.error("密码错误");
            }
        }
    }

    @GetMapping("/unauth")
    public String unauth()
    {
        return "error/unauth";
    }
}
