import java.util.*;

import br.com.jessesousa.UserList;
import br.com.jessesousa.Tabela;

public class App {
    public static void main(String[] args) throws Exception {
        List<String[]> usersData = new ArrayList<>();
        usersData.add(new String[] { "Jesse", "jesse@email.com", "13423432" });
        usersData.add(new String[] { "John", "john@email.com", "23423423" });
        usersData.add(new String[] { "Maria", "maria@email.com", "87989798789" });

        UserList userList = new UserList(usersData);

        try {
            String tableName = UserList.class.getAnnotation(Tabela.class).nome();

            System.out.println("TABLE: " + tableName + "\n");
            userList.printUsers();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
