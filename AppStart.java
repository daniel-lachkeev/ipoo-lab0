public class AppStart {
    public static void main(String[] args) {
        Size size = Size.MEDIUM;
        System.out.println("Name:\t\t" + " " + size.name());
        System.out.println("toString():\t" + " " + size.toString());
        System.out.println("Ordem:\t\t" + " " + 1);
        System.out.println("Valor mínimo:\t" + " " + size.getMinValue());
        System.out.println("Valor máximo:\t" + " " + size.getMaxValue());
        System.out.println("Código:\t\t" + " " + size.getCode());
    }
}