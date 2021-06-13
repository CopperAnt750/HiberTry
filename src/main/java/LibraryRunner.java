import com.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class LibraryRunner {
    private static SessionFactory sessionFactory;
    public static void main(String[] args) {

        sessionFactory = new Configuration().configure().buildSessionFactory();
        LibraryRunner libraryRunner = new LibraryRunner();
        System.out.println("adding books to the DB");
//        libraryRunner.addBook("Kolobok", "Ivan Petrov");
//        libraryRunner.addBook("Effective java", "Joshua Bloch");
//        libraryRunner.addBook("Ivasik telesik", "James Bond");

//        List<Book> books = libraryRunner.listBooks();
//        for (Book book : books) {
//            System.out.println(book);
//        }


    }
    public void addBook(String bookName, String author) {
        Session session = sessionFactory.openSession();
        Transaction transaction=null;
        transaction = session.beginTransaction();
        Book book = new Book(bookName, author);
        session.save(book);
        transaction.commit();
        session.close();
    }
    public List<Book> listBooks() {
        Session session = sessionFactory.openSession();
        Transaction transaction  = null;

        transaction = session.beginTransaction();
        List<Book> books = session.createQuery("FROM Book ").list();

        transaction.commit();
        session.close();
        return books;
    }

    /*public List<Developer> listDevelopers() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List<Developer> developers = session.createQuery("FROM Developer").list();

        transaction.commit();
        session.close();
        return developers;
    }*/

/*        public void addBook(String firstName, String lastName, String specialty, int experience) {
            Session session = sessionFactory.openSession();
            Transaction transaction = null;

            transaction = session.beginTransaction();
            Developer developer = new Developer(firstName, lastName, specialty, experience);
            session.save(developer);
            transaction.commit();
            session.close();
        }*/






}
