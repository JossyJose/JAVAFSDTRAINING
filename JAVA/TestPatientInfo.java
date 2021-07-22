package ust.examples;

class PatientInfo{
		private String patientname;
		private int patientage;
		boolean vaccinated;
		public String getPatientname() {
			return patientname;
		}
		public void setPatientname(String patientname) {
			this.patientname = patientname;
		}
		public int getPatientage() {
			return patientage;
		}
		public void setPatientage(int patientage) {
			this.patientage = patientage;
		}
		public boolean isVaccinated() {
					
			return vaccinated;
		}
		public void setVaccinated(boolean vaccinated) {
			this.vaccinated = vaccinated;
			
			if(vaccinated==true) {
				System.out.println("Vaccinated");
			}
			else {
				System.out.println("Better get vaccinated");
			}
		}
		
		
}


public class TestPatientInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PatientInfo p= new PatientInfo() ;
			p.setPatientname("abhinaya");
			p.setPatientage(22);
			p.setVaccinated(false);
				System.out.println(p.getPatientname()+"  "+p.getPatientage()+"  "+p.isVaccinated());
		
	}

}
