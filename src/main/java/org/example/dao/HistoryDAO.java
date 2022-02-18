package org.example.dao;

import org.example.hibernate.HibernateUtil;
import org.example.hibernate.model.History;
import org.hibernate.Session;

import java.util.List;

public class HistoryDAO {

    public static int saveHistory(String dateTime, String user, String action, String detail) {
        History history = new History();
        history.setDateTime(dateTime);
        history.setUser(user);
        history.setAction(action);
        history.setDetail(detail);

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        int id = (Integer) session.save(history);
        session.getTransaction().commit();
        session.close();
        return id;
    }

    public static List<History> getAllHistory() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        @SuppressWarnings("unchecked")
        List<History> historyList = (List<History>) session.createQuery(
                "FROM History").list();
        session.getTransaction().commit();
        session.close();
        return historyList;
    }
}
