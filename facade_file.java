/**
 * Created by ZAISMIT - EVYNET
 **/
public class facade_file {
    public static void main(String[] args) {
        cat cat = new cat();

        lion lion = new lion();

        System.out.println("cat have: ");

        cat.show_info();

        System.out.println("lion have: ");

        lion.show_info();

    }
}
