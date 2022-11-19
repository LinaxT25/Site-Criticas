package EJB;

import entities.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.InvocationTargetException;

@Stateless
public class UserRepository {
    @PersistenceContext(unitName = "pu-sqlite")
    private EntityManager em;

    public User findById(String user) {
        return this.em.find(User.class, user);
    }

    public boolean hasLogin(String user) {
        Long count = (Long) this.em.createQuery("SELECT COUNT(j) FROM User j WHERE j.login = :user")
                .setParameter("user", user)
                .getSingleResult();

        return count > 0;
    }

    public User save(User instance) {
        User user = this.findById(instance.getLogin());

        if (user != null) {
            try {
                BeanUtils.copyProperties(user, instance);
                this.em.merge(user);
                return user;
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            this.em.persist(instance);
            return instance;
        }
    }
}
