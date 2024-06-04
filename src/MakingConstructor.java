public class MakingConstructor {
    String name;
    int Rollno;

    MakingConstructor(String name, int Rollno)
    {
        this.name=name;
        this.Rollno=Rollno;
    }

    public static void main(String[] args) {
        MakingConstructor m1 = new MakingConstructor("Aryan Bajpai",152);
        MakingConstructor m2 = new MakingConstructor("Ashees",153);

        System.out.println(m1.name +" "+ m1.Rollno );
        System.out.println(m2.name +" "+ m2.Rollno );
    }
}
