package com.fanthus.blog.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "t_user")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String nickname;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private Integer type;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTme;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;
    @OneToMany(mappedBy = "user")
    private List<Blog> blogs = new ArrayList<>();
}
