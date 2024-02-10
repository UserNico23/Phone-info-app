package org.fun;

public class phoneInfo {

    public static void displayPhoneInfo(String phoneName) {


        switch (phoneName.toLowerCase()) {
            case "iphone 15" -> System.out.println("""
                    Chipset          : A16 Bionic\s
                    Refresh rate     : 60Hz\s
                    Ram              : 6Gb\s
                    Battery capacity : 3349mah\s
                    Front camera     : 12mp\s
                    Rear camera      : 48mp\s
                    """);
            case "samsung galaxy s24", "s24" -> System.out.println("""
                    Chipset          : Snapdragon 8 Gen 3/Exynos 2400\s
                    Refresh rate     : 120Hz\s
                    Ram              : 8/12Gb\s
                    Battery capacity : 4000mah\s
                    Front camera     : 12mp\s
                    Rear camera      : 50mp\s
                    """);
            case "xiaomi redmi k60", "k60" -> System.out.println("""
                    Chipset          : Snapdragon 8+ Gen 1\s
                    Refresh rate     : 120Hz\s
                    Ram              : 8/12/16Gb\s
                    Battery capacity : 5500mah\s
                    Front camera     : 16mp\s
                    Rear camera      : 64mp\s
                    """);
            default -> System.out.println("invalid input, try again" + "\n");
        }

    }

}
