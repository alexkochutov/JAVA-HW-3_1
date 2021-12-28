public class BonusMilesService {
    public int calculate(int cost){

        int oneMileCost = 20;                   // рублей за одну милю
        int milesCount = cost / oneMileCost;    // целое количество миль за потраченную сумму
        return milesCount;                      // возвращаем в main количество миль

    }
}
