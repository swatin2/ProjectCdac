package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IAdminDao;
import com.app.dto.AdminRequest;
import com.app.dto.ResourceNotFoundException;
import com.app.pojos.Admin;
import com.app.pojos.Student;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService {
	@Autowired
	private IAdminDao admindao;
	
//	@Autowired
//	private PasswordEncoder encoder;

	@Override
	public Admin addOrUpdateAdminDetails(Admin admin) {
		System.out.println("in Service class admin in addOrUpdate method");
		System.out.println( admin.fname  );
//		admin.setActive(true);
//		admin.setPassword(encoder.encode(admin.getPassword()));
		return admindao.save(admin);
	}
	

	@Override
	public Admin getUserNamenPw(AdminRequest request) {
		return admindao.findByUserNameAndPassword(request.getUserName(), request.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException("Admin not found!!!!"));
//		return null;
	}

	@Override
	public Admin fetchAdminDetails(int adminid) {
		System.out.println("in AdminService class fect method admins");
		return admindao.findById(adminid)
				.orElseThrow(() -> new ResourceNotFoundException("Admin not found!!!!"));
	}

	@Override
	public String deleteAdminDetails(int id) {
		admindao.deleteById(id);
		return "Admin Details with ID " + id + " deleted successfuly... ";
	}
	@Override
	public List<Admin> getAllAdmins() {
		System.out.println("in Service class admins");
		// Method of JpaRepository : super i/f dao layer i/f
		// Inherited API : public List<T> findAll();
		return admindao.findAll();// tx over => sesison closed , rets List of detached entities to the caller
	}
}
