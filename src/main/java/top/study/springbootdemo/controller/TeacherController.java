package top.study.springbootdemo.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import top.study.springbootdemo.entity.Teacher;
import top.study.springbootdemo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jjhe
 * @since 2020-08-11
 */
@Controller
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/findTeacherStudent")
    @ResponseBody
    public JSONArray findTeacherStudent(){
        List<Teacher> list = teacherService.findTeacherStudent();
//        System.out.println(list);
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(list));
        return jsonArray;
    }
}

