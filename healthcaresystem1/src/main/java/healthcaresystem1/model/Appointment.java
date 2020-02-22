package healthcaresystem1.model;
import java.util.Date;
	public class Appointment {
		User user; 
		int appointmentId;
		 public Appointment() {
			super();
		}
		public Appointment(User user, int appointmentId, Test test, Date datetime, boolean approved) {
			super();
			this.user = user;
			this.appointmentId = appointmentId;
			this.test = test;
			this.datetime = datetime;
			this.approved = approved;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public int getAppointmentId() {
			return appointmentId;
		}
		public void setAppointmentId(int appointmentId) {
			this.appointmentId = appointmentId;
		}
		public Test getTest() {
			return test;
		}
		public void setTest(Test test) {
			this.test = test;
		}
		public Date getDatetime() {
			return datetime;
		}
		public void setDatetime(Date datetime) {
			this.datetime = datetime;
		}
		public boolean isApproved() {
			return approved;
		}
		public void setApproved(boolean approved) {
			this.approved = approved;
		}
		Test test;
		Date datetime;
		boolean approved ; 

}
