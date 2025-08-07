// package string;

// largerst string based on lecical analysis

public class lagereststr {
    public static String largestr(String[] str){
        String largest = str[0];
        for(int i=1; i < str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest = str[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String str[] = {"apple","banana","mango"};
        System.out.print(largestr(str));

        // String str = new String("sai abhiram");

        // StringBuilder sb = new StringBuilder();
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        //     str.append(ch);
        // }
        // System.out.println(str);

        // sb.toString();
    }
}
