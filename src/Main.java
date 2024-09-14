//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

int variable1 = 5;
double variable2 = 2.5;
long variable3 =  2500L;
byte variable4 = 1;
float variable5 = 24.23f;
short variable6 = 3056;

//Задача №1

        System.out.println(
        " Значение переменной variable1" + " с типом int равно " + variable1 +
        "\n Значение переменной variable2" + " с типом double равно " + variable2 +
        "\n Значение переменной variable3" + " с типом long равно " + variable3 +
        "\n Значение переменной variable4" + " с типом byte равно " + variable4 +
        "\n Значение переменной variable5" + " с типом float равно " + variable5 +
        "\n Значение переменной variable6" + " с типом short равно " + variable6
        );

//Задача №2
double var1 = 27.12;
long var2 = 987678965549L;
float var3 = 2.786f;
int var4 = 569;
int var5 = -159;
short var6 = 27897;
short var7 = 67;

//Задача №3

int studentsLP = 23, studentsAS = 27, studentsEA = 30, paperQTY = 480;
        System.out.println("\n На каждого ученика рассчитано " + (paperQTY/(studentsLP+studentsAS+studentsEA)) + " листов бумаги");

//Задача №4

int productivity = 16/2, workTime = 0;
        System.out.println(
         "\n За " + (workTime = 20) + " минут машина произвела " + (productivity*workTime) +" штук бутылок" +
         "\n За " + (workTime = 24*60) + " минут машина произвела " + (productivity*workTime) +" штук бутылок" +
         "\n За " + (workTime = 24*3*60) + " минут машина произвела " + (productivity*workTime) +" штук бутылок" +
         "\n За " + (workTime = 24*30*60) + " минут машина произвела " + (productivity*workTime) +" штук бутылок" );

//Задача №5

int whiteJars = 2, brownJars = 4, classes = 0;
        System.out.println("\n В школе, где " + (classes = 120/(whiteJars+brownJars)) + " классов, нужно " +
                classes*whiteJars + " банок белой краски и " + classes*brownJars + " банок коричневой краски");



//Задача №6
int bananas = 5, milk = 200, iceCream = 2, eggs = 4;
double bananasWeigth = 80, milkWeigth = 105, iceCreamWeigth = 100, eggsWeigth = 70;
        System.out.println("\n Вес спортзавтрака равен " + ((milk*milkWeigth)+(bananas*bananasWeigth)+(iceCream*iceCreamWeigth)+(eggs*eggsWeigth))/1000);

//Задача №7
int targetWeigth = 7*1000, UpperLimitPerDay = 500, LowerLimitPerDay = 250;
        System.out.println("\n Количество необходимых дней если худеть по 500 грамм в день - " + targetWeigth/UpperLimitPerDay
         + "\n Количество необходимый дней если худеть по 250 грамм в день - " + targetWeigth/LowerLimitPerDay +
        "\n В среднем количество дней для похудения -  " + ((targetWeigth/UpperLimitPerDay) + (targetWeigth/UpperLimitPerDay)/2));

//Задача №8
int salaryM = 67760, salaryD = 83690, salaryK = 76230;
        System.out.println(
                "\n Маша теперь получает " + salaryM*1.1 + ". Годовой доход вырос на " + (salaryM*1.1 - salaryM)*12 + " рублей" +
                "\n Денис теперь получает " + salaryD*1.1 + ". Годовой доход вырос на " + (salaryD*1.1 - salaryD)*12 + " рублей" +
                "\n Кристина теперь получает " + salaryK*1.1 + ". Годовой доход вырос на " + (salaryK*1.1 - salaryK)*12 + " рублей"
        );
    }
}