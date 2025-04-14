public class Ejercicios {
    
    static int countDuplicate(int[] array, int i) {

        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == i) count++;
        }
        return count;
        
    }

    static String longestString(String[] array) {
        String longest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > longest.length()) {
                longest = array[i];
            }
        }
        return longest;
    }

    static String[] beginsWith(String[] array, char fst) {
        String[] result = new String[array.length];
        int count = 0;
        for (String str : array) { // Igual que en c++
            if (str.charAt(0) == fst) {
                result[count] = str;
                count++;
            }
        }
        String[] finalResult = new String[count];
        System.arraycopy(result, 0, finalResult, 0, count);
        return finalResult;
    }

    static int[] maxFotPosition(int[] array,int[] array2) {
        int result[] = new int[Math.min(array.length, array2.length)];
        int limit = Math.min(array.length, array2.length);
        for (int i = 0; i < limit; i++) {
            if (array[i] > array2[i]) {
                result[i] = array[i];
            }
            else {
                result[i] = array2[i];
            }
        }
        return result;
    }

    public static void main(String args[])  {
        
        int[] array = {1, 2, 3, 4, 1, 6, 7, 1, 9, 10};
        int count = countDuplicate(array, 1);
        System.out.println("Count of duplicates: " + count);

        String[] strings = {"hello", "world", "java", "programming"};
        String longest = longestString(strings);
        System.out.println("Longest string: " + longest);

        String[] beginsWith = beginsWith(strings, 'j');
        System.out.print("Strings that begin with 'j': ");
        for (String str : beginsWith) {
            System.out.print(str + " ");
        }
        System.out.println();

        int[] array2 = {5, 6, 7, 8, 9};
        int[] maxPosition = maxFotPosition(array, array2);
        System.out.print("Max for position: ");
        for (int i : maxPosition) {
            System.out.print(i + " ");
        }
    }
}