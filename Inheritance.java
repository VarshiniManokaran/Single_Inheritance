public class Inheritance {
    public static void main(String[] args) {
        
    
    son p=new son();
    System.out.println(p.gender);
    System.out.println(p.Name);
    p.display();
    }
    

    
}
class parent{
    char gender='M';
    void display(){
        System.out.println("print parent class");
    }
}
class son extends parent{
    String Name="varshini";

}
