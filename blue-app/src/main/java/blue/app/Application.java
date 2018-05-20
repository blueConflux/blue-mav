package blue.app;

import blue.core.client.SpicerApi;
import blue.io.events.Eventr;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("**************");
		System.out.println("Blue Application");
		
		Eventr event = new Eventr("123", "sms"); 
		System.out.println(event.getDescription());
		SpicerApi api = new SpicerApi();
		api.process("send to the message queue");

	}

}
