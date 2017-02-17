package com.greenfoxacademy;

public class Main {

    private static Integer[] arrayOne = new Integer[]{1,2,3,4,5};
    private static Integer[] arrayTwo = new Integer[]{1,2,3,4,5};
    private static Integer[] arrayThree = new Integer[]{1,2,3,5,5};
    private static Integer[] arrayFour = new Integer[]{1,2,3,4,5,6};
    private static String[] stringArrayOne = new String[]{"one","two","three","four","five","six"};
    private static String[] stringArrayTwo = new String[]{"one","two","three","four","five","six"};
    private static String[] stringArrayThree = new String[]{"one","two","three","four","five","five"};
    private static String[] stringArrayFour = new String[]{"one","two","three","four","five"};
    private static Object[] metaArrayOne = new Object[]{arrayOne, arrayTwo};
    private static Object[] metaArrayTwo = new Object[]{arrayOne, arrayTwo};
    private static Object[] metaArrayThree = new Object[]{arrayOne, arrayThree};
    private static Object[] metaArrayFour = new Object[]{arrayOne, arrayFour};

    public static void main(String[] args) {
        System.out.println(checkifsame(arrayOne, arrayTwo));
        System.out.println(checkifsame(arrayOne, arrayThree));
        System.out.println(checkifsame(arrayOne, arrayFour));
        System.out.println("\r\nnow come the strings:\r\n");
        System.out.println(checkifsame(stringArrayOne, stringArrayTwo));
        System.out.println(checkifsame(stringArrayOne, stringArrayThree));
        System.out.println(checkifsame(stringArrayOne, stringArrayFour));
        System.out.println("\r\nnow the arrayarrays:\r\n");
        System.out.println(checkifsame(metaArrayOne, metaArrayTwo));
        System.out.println(checkifsame(metaArrayOne, metaArrayThree));
        System.out.println(checkifsame(metaArrayOne, metaArrayFour));


    }

    private static boolean checkifsame(Object[] arrayOne, Object[] arrayTwo) {
        boolean answer = true;
        int i = 0;
        if (arrayOne.length != arrayTwo.length) {
            return false;
        }
        while (i < arrayOne.length && answer) {
            answer = (arrayOne[i].equals(arrayTwo[i]));
            i++;
        }
        return answer;
    }
}
