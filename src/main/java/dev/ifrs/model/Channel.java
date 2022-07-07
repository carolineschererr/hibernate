package dev.ifrs.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.transaction.Transactional;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;

@Entity
@Getter @Setter @Transactional
public class Channel extends PanacheEntity {

    private String hash;
    @ManyToMany(mappedBy = "channels", fetch = FetchType.EAGER)
    private List<User> users;

    public void addUser(User user){
        this.users.add(user);
    }
    
}
