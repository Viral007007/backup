// practice set 2 ; Question 2 : encrypt a grade by adding 8 to it. decrypy it to show the correct grade


public class cwh8 {
    public static void main(String[] args) {
        //encypt grade
        char grade = 'A';
        grade = (char)(grade + 8);
        System.out.println(grade); 

        grade = (char)(grade - 8);
        System.out.println(grade); 

    }    
}
