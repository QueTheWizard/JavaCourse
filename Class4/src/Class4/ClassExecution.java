package Class4;

public class ClassExecution {
    public static void main(String[] args)
    {
        Sub_class obj = new Sub_class();
        obj.test_method();
    }

    //---------------------------

    // Constructor calls during inheritance.
    class Art
    {
        Art()
        {
            System.out.println("Art constructor");
        }
    }

    class Drawing extends Art
    {
        Drawing()
        {
            System.out.println("Drawing constructor");
        }
    }
}

