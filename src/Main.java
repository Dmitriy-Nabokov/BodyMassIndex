public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        int mass = 120;
        int height = 180;

        double index = service.calculate(mass, height);

        System.out.println();
        System.out.printf("Ваш индекс массы тела: " + "%.1f", index);



        // Дополнение

        System.out.println();
        System.out.println("Диагноз:");

        if (index <= 16) {
            System.out.println("Выраженный дефицит массы тела.");
        } else if(index > 16 && index < 18.5) {
            System.out.println("Недостаточная (дефицит) масса тела.");
        }
        else if(index > 18.5 && index < 25) {
            System.out.println("Норма.");
        }
        else if(index > 25 && index < 30) {
            System.out.println("Избыточная масса тела (предожирение).");
        }
        else if(index > 30 && index < 35) {
            System.out.println("Ожирение 1 степени.");
        }
        else if(index > 35 && index < 40) {
            System.out.println("Ожирение 2 степени.");
        }
        else if(index >= 40) {
            System.out.println("Ожирение 3 степени.");
        }

        System.out.println();
        System.out.println("P.S. Расчет производился по формуле: Индекс=Масса_тела/(Вес_тела)\u00B2");
    }
}
