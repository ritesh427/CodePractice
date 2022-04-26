public class Arraray {

    public static void main(String[] args) {
       int x=5;
       String s="0";
       while (x>0) {
        int t = x%2;
        s = Integer.toString(t)+s;
        x=x/2;
       }
       StringBuilder s3 = new StringBuilder();
       s3.append(s);
       s3.reverse();
       System.out.println(s3);
    }
}
// }
// class Person{
//     String name;
//     int age;
//     public Person(String name,int age) {
//         this.name=name;
//         this.age = age;
//     }
//     public void sayMyName(String name, int age){
//         System.out.println("My Name is "+name+" and I'm "+age+" old.");
//     }
// }