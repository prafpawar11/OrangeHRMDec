package Tutorial1;

import PageLayer.PIMPage;

public class PIMPageTest {

	public static void main(String[] args) {

		PIMPage pimpage = new PIMPage();
		pimpage.addnewuser();

		pimpage.addMorePersonalDetails();
		
		pimpage.searchEmployee();
	}
}
