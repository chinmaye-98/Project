package healthcaresystem1.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import healthcaresystem1.Exception.HealthException;
import healthcaresystem1.model.Appointment;
import healthcaresystem1.model.DiagnosticCenter;
import healthcaresystem1.model.Test;

public class AdminDaoImpl implements AdminDao {
	private Map<String,Test>map;
	HashMap<String,DiagnosticCenter>cMap;
	ArrayList<Test>listOfTests=new ArrayList<Test>();
	public AdminDaoImpl() {
		cMap=new HashMap<String,DiagnosticCenter>();
	
	}

public boolean addCenter(DiagnosticCenter center) throws HealthException {
	if(cMap.containsKey(center.getCenterId())) 
	{
		throw new HealthException("center already exist");
	}
	else
	{
		List<Test>list=new ArrayList<Test>();
		Test test=new Test();
		test.setTestName("blood test");
		list.add(test);
		Test test1=new Test();
		test1.setTestName("blood group");
		list.add(test1);
		Test test2=new Test();
		test2.setTestName("blood pressure");
		list.add(test2);
		center.setListOfTests(list);
		cMap.put(center.getCenterId(),center);
		
		
		
	}
		return true;
	}
public List<DiagnosticCenter>displaycenter() throws HealthException{
	Collection<DiagnosticCenter> col=cMap.values();
	List<DiagnosticCenter>list=new ArrayList<DiagnosticCenter>(col);
	return list;
}


}
	

	  
