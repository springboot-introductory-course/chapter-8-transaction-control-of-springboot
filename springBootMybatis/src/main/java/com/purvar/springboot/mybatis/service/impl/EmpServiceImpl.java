package com.purvar.springboot.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purvar.springboot.mybatis.mapper.EmpMapper;
import com.purvar.springboot.mybatis.dto.Emp;
import com.purvar.springboot.mybatis.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpMapper mapper;
	
	@Override
	public Emp getEmpById(String empId) {
		return mapper.getEmpById(empId);
	}
	
	@Override
	public int updateEmp() {
		return mapper.updateEmp();
	}
	
	@Override
	public int insertDept() {
		return mapper.insertDept();
	}
	
	@Override
	public int update2() {
		int cnt1 = updateEmp();
		int cnt2 = insertDept();
		
		return cnt1 + cnt2;
	}
}
