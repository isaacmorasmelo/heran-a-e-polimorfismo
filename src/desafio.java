import entities.desafio_Lesson;
import entities.desafio_Task;
import entities.desafio_Video;

import java.util.*;

public class desafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<desafio_Lesson> list = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int quantity = sc.nextInt();

        System.out.println();
        for (int i = 0; i < quantity; i++) {
            System.out.println("Dados da " + (i+1) + "a aula:");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char ct = sc.next().charAt(0);

            System.out.print("Título: ");
            sc.nextLine();
            String name = sc.nextLine();


            if (ct == 'c'){
                System.out.print("URL do vídeo: ");
                String Url = sc.nextLine();

                System.out.print("Duração em segundos: ");
                int seconds = sc.nextInt();
                list.add(new desafio_Video(name,Url,seconds));
            }
            else if(ct == 't'){
                System.out.print("Descrição: ");
                String description = sc.nextLine();

                System.out.print("Quantidade de questões: ");
                int quantityQuestions = sc.nextInt();
                list.add(new desafio_Task(name,description,quantityQuestions));
            }
            System.out.println();
        }

        int sum = 0;
        for (desafio_Lesson e : list) {
            sum += e.duration();
        }

        System.out.println("DURAÇÃO TOTAL DO CURSO = " + sum + " segundos");
    }
}
