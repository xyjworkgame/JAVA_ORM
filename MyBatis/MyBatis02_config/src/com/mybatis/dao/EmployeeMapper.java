package com.mybatis.dao;

import com.mybatis.bean.Employee;

/**
 * @version : 1.0
 * @auther : Firewine
 * @email : 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2018-11-18-16:06
 */
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);
}
