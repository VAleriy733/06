public class Main {
    public static void main(String[] args) {
//======================================================================
// (Надеюсь что сделал всё так, как предполагалось в задании - 1.)
//Задание 1.
        System.out.println("\tЗадание 1.");
        String[] stringArray = {"ab", "cd", "ef"};

        // перелаём значение массива "stringArray" в строку "str"
        String str = String.join("", stringArray);
        char[] charArray = str.toCharArray();
        System.out.println(charArray);
//"StringBuilder" -  используются, когда возникает необходимость сделать много изменений в строке символов.
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            result.append("'").append(charArray[i]).append("'");
            if (i < charArray.length - 1) result.append(", ");
        }
        System.out.println(result.toString() + "\n");
//======================================================================
// Задание 2.
        String stroke = "12345";
        char vt = stroke.charAt(0);
        char vi = stroke.charAt(4);
        System.out.println("\tЗадание 2.\n"+ vt + " " + vi + "\n");
//======================================================================
// Задание 3.
        String ks = "1203405";
        int as = ks.indexOf('0');
        System.out.println("\tЗадание 3.\n" + as);
    }
}