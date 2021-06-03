// prectice set 3 ; question 4 : wap to delete double and triple space in string

public class cwh15 {
    public static void main(String[] args) {
        String spaced = "   this  is  double  spaced  and  trimed  spaced  string   .";
        String replaced_string = spaced.replace("   "," "); 
        replaced_string = replaced_string.replace("  "," ");
        System.out.println(replaced_string); 
    }
}
