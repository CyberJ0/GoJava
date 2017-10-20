package lessons.Other;

public class EnumCoffe {
    enum CoffeSize {
        SMALL(80), MEDIUM(110), BIG(200) {
            String getCoffeClass() {
                return "S";
            }
        };
        String coffeClass = "D";
        int milliliters;

        CoffeSize(int milliliters) {
            this.milliliters = milliliters;
        }

        int getMilliliters() {
            return milliliters;
        }

        String getCoffeClass() {
            return coffeClass;
        }
    }

    public static void main(String[] args) {
        EnumCoffe.CoffeSize coffeSize1 = EnumCoffe.CoffeSize.SMALL;
        EnumCoffe.CoffeSize coffeSize2 = EnumCoffe.CoffeSize.MEDIUM;
        EnumCoffe.CoffeSize coffeSize3 = EnumCoffe.CoffeSize.BIG;
            System.out.println("Small " + coffeSize1.milliliters);
            System.out.println("Medium " + coffeSize2.milliliters);
            System.out.println("Big " + coffeSize3.milliliters);
    }
}
