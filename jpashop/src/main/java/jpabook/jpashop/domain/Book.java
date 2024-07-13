package jpabook.jpashop.domain;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("B") //싱글테이블이라 저장될 때 구분이 되어야 한다?
@Getter @Setter
public class Book extends Item {

   private String author;
   private String isbn;
}
