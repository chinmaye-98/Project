package healthcaresystem1.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import healthcaresystem1.Exception.HealthException;
import healthcaresystem1.dao.AdminDao;
import healthcaresystem1.dao.AdminDaoImpl;
import healthcaresystem1.model.DiagnosticCenter;
import healthcaresystem1.model.User;

public class ServiceImpl implements Service{
	private AdminDao admindao;
	public ServiceImpl() 
	{
		admindao= new AdminDaoImpl();
	}
	
	public boolean addCenter(DiagnosticCenter center) throws HealthException {
		String name=center.getCenterName();
		boolean flag=name.matches("[a-zA-Z]+");
		if(!flag) 
		{
			throw new HealthException("center name should contain only alphabets");
		}
		Random random= new Random();
		int id= random.nextInt(100)+1000;
		String s=Integer.toString(id);
		center.setCenterId(s);
		admindao.addCenter(center);
		return true;
	}
	
	public List<DiagnosticCenter>displaycenter() throws HealthException{
		return admindao.displaycenter();
	}
}