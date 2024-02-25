import entities.desafio_Lesson;
import entities.desafio_Task;
import entities.desafio_Video;

import java.util.*;

public class desafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<desafio_Lesson> list = new ArrayList<>();
        desafio_Task desafio_task = new desafio_Task();

        System.out.print("Quantas aulas tem o curso? "); int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Dados da" + (i+1) + "a aula:");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char ct = sc.next().charAt(0);

            System.out.print("Título: ");
            sc.nextLine();
            String name = sc.nextLine();


            if (ct == 'c'){
                System.out.print("URL do vídeo: ");
                sc.nextLine();
                String Url = sc.nextLine();

                System.out.println("Duração em segundos: ");
                int seconds = sc.nextInt();
                list.add(new desafio_Task(name,Url,seconds));
            }
            else if(ct == 't'){
                System.out.println("Descrição: ");
                sc.nextLine();
                String description = sc.nextLine();

                System.out.println("Quantidade de questões: ");
                int quantityQuestions = sc.nextInt();
                list.add(new desafio_Video(name,description,quantityQuestions));
            }
        }
    }
}
