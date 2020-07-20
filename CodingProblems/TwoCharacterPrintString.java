public class TwoCharacterPrintString {

    public static void main(String[] args) {


        String a = "chowdhuryshawn";

        String ac = null;

        int count = a.length() - 1;

        for (int i = 0; i <= a.length(); i++) {

            if (i == count) {
                break;
            }

            System.out.print("|"+a.substring(i, 2 + i) + "| ");

        }

    }

}
