final public class MakingImmutable {
    final private int a;

    public MakingImmutable(int a)
    {
        this.a=a;
    }
    public int getA()
    {
        return this.a;
    }

    public static void main(String[] args) {
        MakingImmutable d = new MakingImmutable(6);
        System.out.println(d.a);
    }
}

