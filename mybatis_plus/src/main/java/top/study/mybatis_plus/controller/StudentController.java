package top.study.mybatis_plus.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.study.mybatis_plus.service.StudentService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jjhe
 * @since 2020-08-10
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/index")
    public String getStudentList(Model model){
        model.addAttribute("students",studentService.findAllStudent());
        return "index";
    }

    @GetMapping("/findAllStudent")
    @ResponseBody
    public JSONObject getStudentList(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("students",studentService.findAllStudent());
        return jsonObject;
    }

    @GetMapping("/findStudentTeacher")
    @ResponseBody
    public JSONObject findStudentTeacher(Integer teacId){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("students",studentService.findStudentTeacher(teacId));
        return jsonObject;
    }

    @GetMapping("/findStudentTeacherByVO")
    @ResponseBody
    public JSONObject findStudentTeacherByVO(Integer teacId){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("students",studentService.findStudentTeacherByVO(teacId));
        return jsonObject;
    }
}
