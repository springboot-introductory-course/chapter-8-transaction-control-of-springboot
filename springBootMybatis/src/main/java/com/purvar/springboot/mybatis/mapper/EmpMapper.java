package com.purvar.springboot.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.purvar.springboot.mybatis.dto.Emp;
@Mapper
public interface EmpMapper {
	Emp getEmpById(String empId);
	
	int updateEmp();
	
	int insertDept();
}
