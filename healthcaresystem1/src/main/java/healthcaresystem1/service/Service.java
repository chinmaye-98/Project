package healthcaresystem1.service;

import java.util.List;

import healthcaresystem1.Exception.HealthException;
import healthcaresystem1.model.DiagnosticCenter;
import healthcaresystem1.model.User;

public interface Service {
	public	boolean addCenter( DiagnosticCenter center )throws HealthException;

	List<DiagnosticCenter> displaycenter() throws HealthException;
	
}

