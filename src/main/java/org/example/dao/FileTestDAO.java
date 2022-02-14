package org.example.dao;

import org.example.hibernate.HibernateUtil;
import org.example.hibernate.model.FileTest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FileTestDAO {

    public static int saveFilePath(String filePath) {
        FileTest fileTest = new FileTest();
        fileTest.setFilePath(filePath);

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        int id = (Integer) session.save(fileTest);
        session.getTransaction().commit();
        session.close();
        return id;
    }
}
