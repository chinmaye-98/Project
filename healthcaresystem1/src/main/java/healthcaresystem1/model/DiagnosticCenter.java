package healthcaresystem1.model;

import java.util.List;
	public class DiagnosticCenter {
		 String centerName;
		  public DiagnosticCenter() {
			super();
		}
		public DiagnosticCenter(String centerName, String centerId, List<Test> listOfTests) {
			super();
		this.centerName = centerName;
			this.centerId = centerId;
			this.listOfTests = listOfTests;
			
		}
		String centerId;
		  List<Test> listOfTests;
		  
		public String getCenterName() {
			return centerName;
		}
		public void setCenterName(String centerName) {
			this.centerName = centerName;
		}
		public String getCenterId() {
			return centerId;
		}
		public void setCenterId(String centerId) {
			this.centerId = centerId;
		}
		public List<Test> getListOfTests() {
			return listOfTests;
		}
		public void setListOfTests(List<Test> listOfTests) {
			this.listOfTests = listOfTests;
		}
		
	}


