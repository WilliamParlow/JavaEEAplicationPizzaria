package br.org.catolicasc.rolingo.daos.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-13T01:49:10")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Boolean> blocked;
    public static volatile SingularAttribute<User, String> passwd;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, Boolean> admin;
    public static volatile SingularAttribute<User, Long> id;
    public static volatile SingularAttribute<User, String> login;

}