
package healthcaresystem1.healthUi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import healthcaresystem1.Exception.HealthException;
import healthcaresystem1.dao.AdminDaoImpl;
import healthcaresystem1.model.DiagnosticCenter;
import healthcaresystem1.model.Test;
import healthcaresystem1.model.User;
import healthcaresystem1.service.Service;
import healthcaresystem1.service.ServiceImpl;
	public class HealthUI {
			public static void main(String[] args) throws HealthException   {
				Service s=new ServiceImpl();
				ArrayList<Test>listsOfTests= new ArrayList<Test>();
				int choice=0;
				Test test=new Test();
			Scanner sc=new Scanner(System.in);
					
					
					while(choice!=4) {
						System.out.println("   Admin ");
			    		System.out.println("1. addCenter");
			    		System.out.println("2. displayCenter");
			    		System.out.println("3. addTest");
			    		System.out.println("4. removeTest");
			        System.out.println("Enter your choose :");
			        choice=sc.nextInt();
						switch(choice) {
						case 1:
							try 
							{
								
								DiagnosticCenter dc=new DiagnosticCenter();
								System.out.println("Enter center name:");
								sc.nextLine();
								String centerName=sc.nextLine();
								dc.setCenterName(centerName);
								s.addCenter(dc);
								String centerId=dc.getCenterId();
								System.out.println("id="+centerId);
								System.out.println("Center added successfully");
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
						case 2:
							try
						{
							List<DiagnosticCenter>l=s.displaycenter();
							for(DiagnosticCenter d:l) {
								String ci=d.getCenterId()+" "+d.getCenterName();	
								System.out.println(ci);
								List<Test>t=d.getListOfTests();
								
								for(Test y:t) 
								{
									String tname=y.getTestName();
									System.out.println(tname);
								}
								}
							
						}
						catch(Exception e)
							{
							System.out.println(e.getMessage());
							}
							}
		
					
		}}}
	


