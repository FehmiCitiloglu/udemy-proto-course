
import com.example.options.AnotherDummy;
import example.simple.SimpleOuterClass;

import java.util.Arrays;

public class SimpleMain {

    public static void main(String[] args) {

        AnotherDummy message1 = AnotherDummy.newBuilder().setId(2).build();
        System.out.println(message1);

        SimpleOuterClass.Simple message = SimpleOuterClass.Simple.newBuilder()
                .setId(42)
                .setIsSimple(true)
                .setName("My name")
                .addSampleList(1)
                .addSampleList(2)
                .addSampleList(3)
                .addAllSampleList(Arrays.asList(4, 5, 6))
                .build();

        System.out.println(message);
    }
}
