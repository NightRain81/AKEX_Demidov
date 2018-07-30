package brains.lesson_1.hello;

public class Main {

    public static float StringToArray(String s) throws RuntimeException{
        String [][] arrString = new String [4][4];
        float result = 0;
        String YRegex = "\n";
        String XRegex = " ";

        String[] strArr = s.split(YRegex);
        if (strArr.length != 4) {
            throw new RuntimeException("Error length of array");
        }
        for (int i=0; i < strArr.length; i++){
            String[] strArr2 = strArr[i].split(XRegex);
            if (strArr2.length != 4) throw new RuntimeException("Error length of array");
            arrString[i] = strArr2;
        }

        for (int i=0; i < arrString.length; i++){
            for (int j=0; j < arrString[i].length; j++){
                try {
                    result += Integer.parseInt(arrString[i][j]);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Array value is not a number");
                } catch (NullPointerException e){
                    throw new NullPointerException("Empty array value");
                }
            }
        }
        return result/2;
    }

    public static void main(String[] args) {
        String s = "1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0";

        try {
            System.out.println(StringToArray(s));
        } catch (RuntimeException  e) {
            System.out.println(e);
            }
    }

}
