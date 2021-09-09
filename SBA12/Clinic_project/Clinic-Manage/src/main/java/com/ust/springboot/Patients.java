package com.ust.springboot;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="newcrud")
	public class Patients {
	
		@Id
		private String id;
	
		private String fname;
	
		private String lname;
	
		private String email;
	
		private String pno;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPno() {
			return pno;
		}
		public void setPno(String pno) {
			this.pno = pno;
		}
		

	}




