package DivideAndConquer;

public class Merge_string {
    public static String[] Mergestring(String arr[],int si,int ei){
        if( si == ei){
            String [] a = { arr[si] };
            return a;
        }
        int mid = si + (ei -si ) /2;
        
        // left part
        String strleft[] = Mergestring(arr,si,mid);
        String strRigth[] = Mergestring(arr, mid+1, ei);

        String totalString[] = merge(strRigth, strleft);
        return totalString;
    }

    public static String [] merge(String strLeft[],String strRight[]){
        int m = strLeft.length;
        int n = strRight.length;
        String totalString[] = new String[m+n];

        int index =0;
        int i = 0;
        int j =0;

        while(i < m && j<n){
            if( isAlphabeticallySmaller(strLeft[i]  ,strRight[i])){
                totalString[index] = strLeft[i];
                i++;
                index++;
            }
            else{
                totalString[index] = strRight[j];
                j++;
                index++;
            }
        }
        while ( i < m){
            totalString[index] = strLeft[i];
            i++;
            index++;
        }
        while( j <n){
            totalString[index] = strRight[j];
            j++;
            index++;
        }
        return totalString;
    }
    public static boolean isAlphabeticallySmaller(String str1 ,String str2){
        if(str1.compareTo(str2) < 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury"}; 
        String a[] = Mergestring(arr,0,arr.length -1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
