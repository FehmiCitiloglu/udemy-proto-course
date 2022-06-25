package oneofs;

import example.oneofs.Onofs;

public class OneofMain {

    public static void main(String[] args) {
        Onofs.Result message = Onofs.Result.newBuilder()
                .setMessage("a message")
                .build();
        System.out.println("hasMessage: " + message.hasMessage());
        System.out.println("hasId: " + message.hasId());
        System.out.println("asdsd "+ message);

        Onofs.Result message2 = Onofs.Result.newBuilder(message)
                .setId(42)
                .build();

        System.out.println("hasMessage2: " + message2.hasMessage());
        System.out.println("hasId2: " + message2.hasId());
        System.out.println("message2 "+ message2);

        Onofs.Result message3 = Onofs.Result.newBuilder(message)
                .setId(465)
                .setMessage("a message 3")
                .build();

        System.out.println("hasMessage3: " + message3.hasMessage());
        System.out.println("hasId3: " + message3.hasId());
        System.out.println("message3 "+ message3);
    }
}
