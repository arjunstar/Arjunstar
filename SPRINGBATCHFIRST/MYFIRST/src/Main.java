
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

class Main {

    public static void main(String args[]) {
        try {
            ApplicationContext ac = new 
                    ClassPathXmlApplicationContext("context.xml", Main.class);
            DataSource source = (DataSource) ac.getBean("externalDataSource");
            JdbcTemplate jt = new JdbcTemplate(source);
            jt.batchUpdate(new String[]{"update employee set department = 'Finance#'",
                        "delete from employee where EmployeeId =31"
                    });
            System.out.println("Data updated successfully");
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}