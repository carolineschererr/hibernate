package dev.ifrs.model;

import javax.persistence.Entity;
import javax.transaction.Transactional;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;

@Entity
@Getter @Setter @Transactional
public class Message extends PanacheEntity {

    private String text;
    
}
