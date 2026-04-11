
/**
 * Escreva uma descrição da classe treinoCorrida aqui.
 * 
 * @author Lucas Neves
 * @version 1.0 18/03/2026
 */
import java.util.Scanner;
import java.lang.Math;
import java.lang.Package;
public class treinoCorrida
{
    public static void main(String args[]){
        System.out.print('\u000C');
        Scanner in = new Scanner(System.in);
        String nome;
        double time, dist, peso;
        int idade;

        System.out.println("\f Qual seu nome?");
        nome = in.nextLine();
        System.out.println("Qual o tempo gasto em min?");
        time = in.nextDouble();
        System.out.println("Qual distancia percorrida em km?");
        dist = in.nextDouble();
        System.out.println("Qual sua idade?");
        idade = in.nextInt();
        System.out.println("Qual seu peso em Kg?");
        peso = in.nextDouble();

        double pace, velMed, meter, tenKm, cal; // Declara variaves p/ pace, velocidade media, metros, tempo p/ 10km e calorias gastas
        int ano; // Declara variaves p/ pace

        pace = paceCalc(time,dist); // Calculo de pace (Tempo (min) / Distancia total(Km))
        velMed = midSpeed(dist,time);// Calculo de velocidade media (distnacia(Km)/Tempo(Horas))
        ano = age(idade);// Calculo de ano de nascimento ano atual - 2026
        meter = distance(dist); // Calculo de quantos metros foram percorridos distancia informada em KM * 1000
        tenKm = pcTen(pace); // Calculo de tempo em min necessario para percorrer 10km  (Pace(min/km)* 10)
        cal = calories(velMed, peso, time); //calculo de quantas calorias foram queimadas ((velocidade Media * peso em kg * Constante) * tempo gasto)
        int c = (int)cal; // passa a variavel calorias p/ int

        System.out.println("Resumo do treino");
        System.out.println();
        System.out.println("Nome do Atleta " + nome);
        System.out.println("Ano de nascimento aproximado: " + ano);
        System.out.println("Pace em min/km: " + pace);
        System.out.println("Velocidade media: " + velMed);
        System.out.println("Quanto tempo leva para correr 10km em min: " + tenKm);
        System.out.println("Metros percorridos: " + meter);
        System.out.println("Calorias queimadas: " + c);
    }

    public static double paceCalc(double dist, double time){
        double speed;
        speed = dist/(time*60);
        return speed;
    }
    
    public static double midSpeed(double time, double dist){
        double pace;
        pace = time/dist;
        return pace;
    }
    
    public static int age(int yB){
        int year;
        year = 2026 - yB;
        return year;
    }
    
    public static double distance(double km){
        double mt;
        mt = km*1000;
        return mt;
    }
    
    public static double pcTen(double pc){
        double pace;
        pace = pc * 10;
        return pace;
    }
    
    public static double calories(double mS, double wg, double tm){
        double cal;
        cal = (mS * wg * 0.0175) * tm;
        return cal;
    }
}
/*
  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⢾⣿⡷⣦⣄⡀⠀⢀⣠⡴⠒⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀
  ⠀⠀⠀⠀⠀⠀⣶⠶⣦⣤⣀⣀⣠⡾⠋⠀⠸⡇⠀⠀⣈⡽⠞⠉⠀⠀⢠⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
  ⠀⠀⠀⠀⠀⠀⢻⡆⠀⠀⠉⠛⠻⠶⣦⣤⣄⣀⣠⡾⠟⠀⠀⠀⠀⢀⡾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
  ⠀⠀⠀⢀⣀⣀⣀⣻⣆⠀⠀⠀⠀⠀⠀⠀⠉⠉⠁⠀⠀⠀⠀⠀⣠⣿⡿⠟⠛⠛⠛⠛⠓⠒⢫⣿⡿⠃
  ⣶⡾⠛⠛⠛⠛⠛⠛⠛⠛⢽⣶⣄⣀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣟⣋⣁⠀⠀⠀⠀⠀⢀⣠⡶⠟⠁⠀⠀
  ⠀⠉⠛⠶⣄⡀⠀⠀⣀⠀⢀⡖⠛⠛⢿⣿⣶⣤⣤⣴⣾⣿⠟⢉⠉⠙⣿⢧⢶⣺⠟⠋⠉⠀⠀⠀⠀⠀
  ⠀⠀⠀⣀⣤⠽⠿⠛⡟⠀⣿⠀⠿⠇⠀⣿⡇⠉⠉⠁⠙⡇⠸⠿⠇⠀⣽⡎⡇⢈⣻⡆⠀⠀⠀⠀⠀⠀
  ⠀⠀⠀⠛⠶⠤⣄⣀⡇⠀⢿⣄⣀⣀⣠⣷⠃⣀⠀⠀⡤⠙⣦⣄⣀⣴⠟⠁⣿⠋⠉⠁⠀⠀⠀⠀⠀⠀
  ⠀⠀⠀⠀⠀⠀⠀⠀⢻⡄⠀⠉⠉⠉⠉⠁⠀⠙⡦⠞⠁⠀⠈⠉⠉⠁⢀⣴⠃⠀⠀⠀⠀⣠⣾⠀⠀⠀
  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢙⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⠿⠟⠋⠁⠀⠀
  ⠀⠀⢿⠳⣦⠤⠤⠴⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢣⡟⡽⠋⠁⠀⠀⠀⠀⠀⠀
  ⣀⣤⣜⡒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀
  ⠈⠻⣦⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢺⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀
  ⠀⠀⠀⠙⠿⣦⡀⠀⠀⢸⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀
  ⠀⠀⠀⠀⠀⠀⠉⠛⢶⣚⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀
  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣷⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⣾⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀
  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣯⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣯⣿⣷⠇⠀⠀⠀⠀⠀⠀⠀⠀
  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⡟⠉⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⢿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀
  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣧⠇⠀⠀⠀⠀⠀⣠⣶⣦⣀⠀⠀⠀⠀⠈⣻⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀
  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠃⠀⠀⠀⣀⣴⣫⠟⠁⠉⠻⢷⣆⡀⠀⠀⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀
  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣦⣖⠖⠋⠉⠁⠀⠀⠀⠀⠀⠀⠈⠻⢶⣾⡿⢯⠭⠗⠀⠀⠀⠀⠀⠀⠀
  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠿⠟⠏⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠄⠀⠀⠀
  Code by Guma ⠀⠀⠀⠀
 */
