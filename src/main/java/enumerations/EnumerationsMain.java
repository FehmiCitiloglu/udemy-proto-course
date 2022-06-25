package enumerations;

import example.enumerations.Enumerations;

public class EnumerationsMain {

    public static void main(String[] args) {
        Enumerations.Enumeration enumeration
                = Enumerations.Enumeration
                .newBuilder()
//                .setEyeColor(Enumerations.EyeColor.EYE_COLOR_BLUE)
                .setEyeColorValue(1)
                .build();

        System.out.println(enumeration);
    }

}
