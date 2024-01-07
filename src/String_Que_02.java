public class String_Que_02 {
    public static float get_short_dist(String Path){
        int x=0,y=0;
       for(int i=0;i<Path.length();i++){
           char dir=Path.charAt(i);
           if(dir == 's'){
               y--;
           }
           else if(dir == 'n'){
               y++;
           }
           else if(dir == 'w'){
               x--;
           }
           else{
               x++;
           }

       }
       int X2 = x*x;
       int Y2 = y*y;
       return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path ="wneenesennn";
        System.out.println(get_short_dist(path));
        String path2 ="ns";
        System.out.println(get_short_dist(path2));
    }
}
