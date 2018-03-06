package objectholder;

public class Coach extends People {

		private String coachname;
		private int coachage;
		
		public Coach(String coachname, int coachage) {
			this.coachname = coachname;
			this.coachage = coachage;
			
		}
		
		public void setCoachAge(int coachage) {
			this.coachage = coachage;
		}

		public String getCoachName() {
			return coachname;
		}
		
		public void setCoachName(String coachname) {
			this.coachname = coachname;
		}
		
		public int getCoachAge() {
			return coachage;
		}
		
		public void sportInv(){
			System.out.println("sport is lacrosse1");
			
			
		}
	}
