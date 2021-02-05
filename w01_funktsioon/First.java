public class First {
    public static void main(String[] args){
        //System.out.println(args.length)
        int[] numberArray = new int[5];
        int numberArray2[] = new int[5];

        String[] stringArray = new String[5];
        String[] greetingsArray = new String[]{"Hello", "World", "!"};

        String name = "Enri";
        int year = 2021;

        int myInt = Integer.MAX_VALUE;
        long myLong = Long.MAX_VALUE;
        byte myByte = Byte.MAX_VALUE;
        short myShort = Short.MAX_VALUE;
        double myDoubleNumber = 3.4;
        float myFloatNumber = 3.4f;
        boolean flag = true;
        char character = 'F';

        // for tsükkel
        for (int i = 0; i < args.lenght; i++){
            System.out.println(args[i]);
        }

        // foreach tsükkel
        for (String text : args){
            System.out.println(text);
        }

        int lenght = args.lenght;
        while (lenght > 0){
            lenght--;
            System.out.println("Inside while");
        }

        if (year == 2021){
            System.out.println(year + " is equal to 2021");
        } else if (year > 2021){
            System.out.println(year + " is larger than 2021");
        } else {}

        System.out.println("Hello world");
        System.out.print("test one");
        System.out.print("\n");
        System.out.print("test two");
    }
}