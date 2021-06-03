// prectice  set 3 ; question 3 : fill the latter template.

public class cwh14 {
    public static void main(String[] args) {
            String template = new String("\nDear _name1,\n\t-------------------------------------\n---------------------------------------------\n---------------------------------------------\n---------------------------------------------\n---------------------------------------------\n\nyour faithful,\n  _name2 ");

            System.out.println(template);
            String new_temp = template.replace("_name1","Viral");
            new_temp = new_temp.replace("_name2","Harry");
            System.out.println(new_temp);
    }
}
