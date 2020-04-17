package com.synnex.springboot.service.impl;

import com.synnex.springboot.domain.Department;
import com.synnex.springboot.service.IDepartmentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("departmentService")
@Primary
public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements IDepartmentService {

}
