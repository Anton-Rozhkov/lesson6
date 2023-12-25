import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Intel Core i3", 1100,"DDR4", 8,"SSD", 256));
        notebooks.add(new Notebook("Intel Celeron", 1200,"DDR4", 4,"HDD", 1000));
        notebooks.add(new Notebook("Ryzen 5", 2800,"DDR5", 16,"SSD", 512));
        notebooks.add(new Notebook("Intel Core i7", 1200,"DDR4", 16,"SSD", 256));
        notebooks.add(new Notebook("Intel Core i9", 2600,"DDR4", 32,"SSD", 512));
        Scanner scanner = new Scanner(System.in);
        int client_choice;
        Integer client_param;
        while (true){
            System.out.println("Выберите критерии для фильтрации:");
            //(тут надо бы списки показывать, но я их не написал)
            System.out.println("1 - CPU");
            System.out.println("2 - RAM");
            System.out.println("3 - DRIVE");
            System.out.println("0 - Завершить работу");
            client_choice = scanner.nextInt();
            LinkedList<Notebook> list =new LinkedList<>();
            if (client_choice == 1){                
                System.out.println("Укажите минимальные требования по параметру");
                client_param = scanner.nextInt();
                for (var item: notebooks) if (item.cpu_frecuensy >= client_param) list.add(item);
            }
            else if (client_choice == 2){             
                System.out.println("Укажите минимальные требования по параметру");
                client_param = scanner.nextInt();
                for (var item: notebooks) if (item.ram_capacity >= client_param) list.add(item);
            }
            else if (client_choice == 3){            
               System.out.println("Укажите минимальные требования по параметру");
                client_param = scanner.nextInt();
                for (var item: notebooks) if (item.drive_volume >= client_param) list.add(item);
            }
            else break;
            for (var elem: list) System.out.println(elem);
        }
    }
}