public class PracticeLamada{
    public static void main(String[] args) {
   LamadaInterface.calculateMath obj=(a,b)->a%b;
   System.out.println(obj.calculate(11,5));
    }

}