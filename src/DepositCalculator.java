import java.util.Scanner;

public class DepositCalculator {
    double calculateComplexPercent(double a, double y, int d) {
       double pay = a * Math.pow((1 + y / 12), 12 * d);
          return roundValue(pay, 2);
    }

    double calculateSimplePercent(double amount, double yearRate, int depositPeriod) {
         return roundValue(amount + amount * yearRate * depositPeriod, 2);
    }

    double roundValue(double value, int places) {
        double ScaLe= Math.pow(10, places);

        return Math.round(value*ScaLe) /ScaLe;
    }

    void calculation() {
      int period;
      int action;

      Scanner abcdef = new Scanner(System.in);
      System.out.println("Введите сумму вклада в рублях:") ;

      int amount = abcdef.nextInt();
      System.out.println("Введите срок вклада в годах:");

      period = abcdef.nextInt( );
      System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");

      action = abcdef.nextInt();
      double value = 0;
      if (action ==1) {
          value = calculateSimplePercent(amount, 0.06, period);
      } else if (action == 2) {
          value = calculateComplexPercent(amount, 0.06, period);
      }

      System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + value);
    }

    public static void main(String[] args) {
        new DepositCalculator().calculation();
    }

}
