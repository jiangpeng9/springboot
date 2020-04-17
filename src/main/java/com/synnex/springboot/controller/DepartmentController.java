package com.synnex.springboot.controller;

import com.synnex.springboot.domain.Department;
import com.synnex.springboot.query.DepartmentQuery;
import com.synnex.springboot.service.IDepartmentService;
import com.synnex.springboot.util.AjaxResult;
import com.synnex.springboot.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    @Qualifier("departmentService")
    private IDepartmentService departmentService;
    @RequestMapping("/index")
    public String index(){
        return "department/department";
    }
    @RequestMapping("/list")
    @ResponseBody
    public List<Department> list(){
        return departmentService.findAll();
    }
    @RequestMapping("/del")
    @ResponseBody
    public AjaxResult del(Long id){
        try {
            departmentService.delete(id);
            return new AjaxResult();
        }catch (Exception e){
            e.printStackTrace();
            return new AjaxResult(false,e.getMessage());
        }
    }
    @RequestMapping("/addOrUpdate")
    @ResponseBody
    public AjaxResult addOrUpdate(Department department){
        try {
            if(department.getId()==null){
                departmentService.add(department);
            }else {
                departmentService.update(department);
            }
            return new AjaxResult();
        }catch (Exception e){
            e.printStackTrace();
            return new AjaxResult(false,e.getMessage());
        }
    }
    @RequestMapping("/page")
    @ResponseBody
    public PageResult<Department> page(DepartmentQuery query){
        return departmentService.findByQuery(query);
    }
}
