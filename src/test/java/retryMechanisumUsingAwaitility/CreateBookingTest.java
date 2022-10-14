package retryMechanisumUsingAwaitility;

public class CreateBookingTest {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			if(CreateBooking.createbooking() == 200) {
				break;
			}
		}

			}

}
