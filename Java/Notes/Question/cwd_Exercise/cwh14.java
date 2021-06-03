// prectice  set 3 ; question 3 : fill the latter template.

public class cwh14 {
    public static void main(String[] args) {
            String template = new String("\nDear _name,\n\t-----------------------------------------\n---------------------------------------------\n---------------------------------------------\n---------------------------------------------\n---------------------------------------------\nyour faithful,\n_name1 ");

            System.out.println(template);
            String new_temp = template.replace("_name","Viral");
            new_temp = new_temp.replace("_name1","Harry");
            System.out.println(new_temp);
    }
}
