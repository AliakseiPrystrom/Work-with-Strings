import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    String str = "HelloWorld";                              //№1
    StringBuffer stringBuffer = new StringBuffer(str);
    stringBuffer.delete(0,5);
        System.out.println(stringBuffer.toString());


//        String str1 = "HelloWorld";                               //№2
//        StringBuffer stringBuffer = new StringBuffer(str1);
//        char i3 = stringBuffer.charAt(3);
//        char i0 = stringBuffer.charAt(0);
//        for (int i=0;i<stringBuffer.length();i++) {
//            if(stringBuffer.charAt(i)==i3){
//                stringBuffer.setCharAt(i,i0);
//            }
//        }
//        System.out.println(stringBuffer);


//        String str2 = "один наган два поп три четыре хех пять шесть аса"; //№3
//        StringBuffer stringBuffer = new StringBuffer(str2);
//        stringBuffer.reverse();
//        String str3 = stringBuffer.toString();
//        String[] mass2 = str3.split(" ");
//        String[] mass = str2.split(" ");
//        System.out.println(Arrays.toString(mass));
//        System.out.println(Arrays.toString(mass2));
//        for (int i = 0; i < mass.length; i++) {
//            for (int j=0; j< mass.length; j++){
//                if (mass[i].equals(mass2[j])){
//                    //System.out.println(mass[i]);
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(mass));
//        System.out.println(Arrays.toString(mass2));


    }
}
