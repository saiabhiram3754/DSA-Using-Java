// package string;

public class shortestpath {
    public static float shortpath(String path){
        int x = 0, y = 0;

        for(int i=0;i<path.length(); i++){
            char dir = path.charAt(i);
            //north
            if(dir == 'n'){
                y++;
            }
            //south
            else if( dir == 's'){
                y--;
            }
            //east
            else if( dir == 'e'){
                x++;
            }
            //west
            else{
                x--;
            }
        }

        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);

    }
    public static void main(String args[]){
        String path = "wneenesennn";
        System.out.println(shortpath(path));
    }
}
