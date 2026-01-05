public class Constructor {
    int x;
    float y;

    public Constructor(){
        System.out.println("constructor called");
        x = 10;
        y = 5.0f;
    }
    public void show() {
        System.out.println(x+" "+y);
    }
    public static void main(String[] args)
    {
        Constructor s1 = new Constructor();
        s1.show();
    }
    
}
