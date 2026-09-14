package Observer_Design;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        Subject channel = new Channel();
//        Observer subscriber1 = new Subscriber("subscriber1");
//        Observer subscriber2 = new Subscriber("subscriber2");

//        channel.subscribe(subscriber1);
//        channel.subscribe(subscriber2);
//
//        channel.update("Java Tutorial");
//        channel.update("Python Tutorial");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Press 1 to upload video");
            System.out.println("Press 2 to create new Subscriber");
            System.out.println("Press 3 to unsubscribe a subscriber");
            System.out.println("Press 4 to exit");

            int c= Integer.parseInt(br.readLine());
            if (c == 1) {
                // Upload Video;

                System.out.println("Enter Video title");
                String title = br.readLine();
                channel.update(title);
//                System.out.println("New Video title has been uploaded");
            }
            else if (c == 2) {
                // Create new Subscriber
                System.out.println("Enter the name of the Subscriber");
                String name = br.readLine();
                Observer subscriber3 = new Subscriber(name);
                channel.subscribe(subscriber3);
                System.out.println("New Subscriber has been created");
            }
            else if (c == 3) {
                // Unsubscribe a subscriber
                System.out.println("Enter the name of the Subscriber to unsubscribe");
                String name = br.readLine();
                Observer subscriber4 = new Subscriber(name);
                channel.unsubscribe(subscriber4);
                System.out.println( name +  " has been unsubscribed");
            }
            else if (c == 4) {
                // Exit
                System.out.println("Exiting...");
                break;
            }
            else {
                // Wrong Input Code
                System.out.println("Wrong Code");
            }

    }

    }

}

