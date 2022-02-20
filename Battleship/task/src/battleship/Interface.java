package battleship;

public final class Interface {

    public static int[][] formatInput(String input) {
        String[] inputSplit = splitInput(input);


    }

    //function takes coordinates as a string e.g. 'A10' and changes it into the array of the numeric coordinates
    //(so A10 becomes {1, 10}, F6 becomes {6, 6} and so on).
    private static int[] castInt(String input) {
        return new int[] {input.charAt(0) - 16, Integer.parseInt(input.substring(1))};
    }

//    private static boolean hasSpace(String input) {
//        return input.trim().contains(" ");
//    }

    private static String[] splitInput(String input) {
        return input.trim().toUpperCase().split(" ");
    }

}
