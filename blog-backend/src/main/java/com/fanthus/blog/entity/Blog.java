package com.fanthus.blog.entity;

import lombok.Data;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity                 //和数据库关联
@Table(name="t_blog")   //重新命名表名
public class Blog {
    @Id                 //标识是主键
    @GeneratedValue     //标识自动生成
    private Long id;

    private String title;
    private String content;
    private String firstPicture;
    private String flag;
    private Integer views;
    private boolean appreciation;
    private boolean shareStatement; //转载声明是否开启
    private boolean commentabled;   //评论是否开启
    private boolean published;      //是否已发布
    private boolean recommend;      //推荐
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;        //播客创建时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;        //播客更新时间

    @ManyToOne
    private Type type;
    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Tag> tags = new ArrayList<>();
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "blog")
    private List<Comment> comments = new ArrayList<>();

    public Blog() {

    }

}

