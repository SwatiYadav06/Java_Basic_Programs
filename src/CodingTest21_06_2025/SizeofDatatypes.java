package CodingTest21_06_2025;

public class SizeofDatatypes {
    public static void main(String[] args) {
        SizeofDatatypes obj = new SizeofDatatypes();
        obj.printDefaults();
    }
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;

    public void printDefaults() {
        System.out.println("Default byte: " + defaultByte);
        System.out.println("Default short: " + defaultShort);
        System.out.println("Default int: " + defaultInt);
        System.out.println("Default long: " + defaultLong);
        System.out.println("Default float: " + defaultFloat);
        System.out.println("Default double: " + defaultDouble);
        System.out.println("Default char:" + defaultChar);
        System.out.println("Default boolean: " + defaultBoolean);
    }
}

