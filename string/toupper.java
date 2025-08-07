// package string;

public class toupper {
    public static String toup(String str){
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i< str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i+1)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){

        String str = new String("aaa bb ccc dd");
        
        System.out.println(toup(str));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) { //o(n)
            Integer count = 1;
            while(i< str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count >1 ){
                sb.append(count.toString());
            }
        }
        sb.toString();
        System.out.println(sb);
    }
}
