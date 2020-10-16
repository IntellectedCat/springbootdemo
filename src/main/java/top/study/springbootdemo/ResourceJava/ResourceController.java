package top.study.springbootdemo.ResourceJava;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/re")
public class ResourceController {

    @Autowired
    private Resource resource;
    @Autowired
    private HttpServletRequest request;
//    @Autowired
//    private HttpServletResponse response;

    @Value("${website}")
    private String WEBSITE;

    @RequestMapping("/getResource")
    @ResponseBody
    public String getResource(){
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);
        return bean.toString();
    }

    @RequestMapping("/getWebsite")
    @ResponseBody
    public String getWebsite(){
        return WEBSITE;
    }

    @RequestMapping("/index")
    public String showIndex(Model model){
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);
        model.addAttribute("resource",bean);
        return "thymeleaf/index";
    }

    public void getRequest(){

    }

    @RequestMapping("/tokenTest")
    public String getResponse(HttpServletResponse response, HttpSession session){
        response.addHeader("token",session.getId());
        return "thymeleaf/TokenTest";
    }

    @ResponseBody
    @RequestMapping("checkToken")
    public JSONObject checkToken(HttpSession session){
        JSONObject jsonObject = new JSONObject();
        if(request.getHeader("token").equals(session.getAttribute("token"))){
            jsonObject.put("status",0000);
            jsonObject.put("msg","success");
            return jsonObject;
        }
        jsonObject.put("status",0001);
        jsonObject.put("msg","fail");
        return jsonObject;
    }
}
