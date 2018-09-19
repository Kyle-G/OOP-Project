package shippingstore;

public class testingUser extends User {
	
		private int GPA;
		private String studentID;
		
		
		//default constructor for new variables
		testingUser() {
			this.studentID = "";
			this.GPA = 0;
		}
		
		//default constructor for student (subclass of user)
		testingUser(int id, String firstName, String lastName, String studentID, String GPA) {
			super(id, firstName, lastName);
		}
		

		public String getStudentID() {
			return studentID;
		}



		public void setStudentID(String studentID) {
			this.studentID = studentID;
		}



		public int getGPA() {
			return GPA;
		}



		public void setGPA(int gPA) {
			GPA = gPA;
		}





		
		
		
		
		
		
		
		
		
		
		
		
		@Override
		public String getFormattedText() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
		
}
