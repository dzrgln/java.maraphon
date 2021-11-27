package day8;

public class Task1 {
    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//
//                String result = "";
//        for(int i = 0; i<20001; i++){
//            result = result + i + " ";
//        }
//        System.out.println(result);
//
//        long stopTime = System.currentTimeMillis();
//        System.out.println("Длительность работы, в мс: " + (stopTime - startTime));

        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<20001; i++){
           sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb.toString());

        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс: " + (stopTime - startTime));




    }
}
