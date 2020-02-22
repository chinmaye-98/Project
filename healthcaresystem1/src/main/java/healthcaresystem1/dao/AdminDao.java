package healthcaresystem1.dao;

import java.util.List;


import healthcaresystem1.Exception.HealthException;
import healthcaresystem1.model.DiagnosticCenter;
import healthcaresystem1.model.User;

public interface AdminDao {
	public boolean addCenter(DiagnosticCenter center ) throws HealthException;

	public List<DiagnosticCenter> displaycenter() throws HealthException;
	
}
