public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 20000;                      // цена билета
        int miles = service.calculate(price);   // передаем цену в метод для расчета миль
        System.out.println(miles);

    }
}
