public class Animal {
	
	String gender; // 성별 
	
	
	public Animal(String iniGender) {
		gender = iniGender;
	}
	public Animal() {
		gender = "Not init gender";
	}
	
	public void setGender(String iniGender) {
		gender = iniGender;
	}
	
	public String getGender() {
		return gender;
	}

	public String toString() {
		return ("Gender :" +gender);
        }

}