public class Operatots_Soal5 {
    static short methodOne(long l)
    {   
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args)
    {
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(f);
    }
 }

