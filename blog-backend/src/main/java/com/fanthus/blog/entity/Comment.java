package com.fanthus.blog.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "t_comment")
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue
    private Long id;

    private String nickname;
    private String name;
    private String content;
    private String avatar;

    @Temporal(TemporalType.TIMESTAMP)
    private Date crateTime;
    @ManyToOne
    private Blog blog;
    @OneToMany(mappedBy = "parentComment")
    private List<Comment> replyComments = new ArrayList<>();
    @ManyToOne
    private Comment parentComment;


}
