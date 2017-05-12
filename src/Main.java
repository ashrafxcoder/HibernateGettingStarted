import org.hibernate.*;
import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

/**
 * Created by Ashraf-XCODER on 5/12/2017.
 */
public class Main {

    public static void main(final String[] args) throws Exception {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();


        Person person = new Person("shafiq 2", 44);
        Integer id = (Integer) session.save(person);


        System.out.println(id);

        transaction.commit();
        session.close();
    }
}
