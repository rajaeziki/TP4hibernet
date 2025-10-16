package org.example.metier;
import org.example.dao.ICategoryDao;
import org.example.entities.Category;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class CategoryDaoImpl  implements ICategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override

    public boolean create(Category category) {
        try {
            sessionFactory.getCurrentSession().save(category);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public boolean delete(Category o) {
        return false;
    }

    @Override
    public boolean update(Category o) {
        return false;
    }

    @Override
    public Category findById(int id) {
        return sessionFactory.getCurrentSession().get(Category.class, id);
    }

    @Override
    public List<Category> findAll() {
        return List.of();
    }
}