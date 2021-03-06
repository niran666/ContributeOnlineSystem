package com.contribute.demo.pojo;

import javax.persistence.*;

@Entity
@Table(name = "tb_contribution")
public class Contribution {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String url;
    private int wordnumber;
    private String kind;
    private String uploaddate;
    private boolean discussed;
    private String description;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authorId" ,referencedColumnName = "id")
    private Account author;//账户

    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true,mappedBy = "contribution")
    private Comment comment;//评价

    public Contribution() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWordnumber() {
        return wordnumber;
    }

    public void setWordnumber(int wordnumber) {
        this.wordnumber = wordnumber;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getUploaddate() {
        return uploaddate;
    }

    public void setUploaddate(String uploaddate) {
        this.uploaddate = uploaddate;
    }
    public Account getAuthor() {
        return author;
    }
    public void setAuthor(Account author) {
        this.author = author;
    }

    public boolean isDiscussed() {
        return discussed;
    }

    public void setDiscussed(boolean discussed) {
        this.discussed = discussed;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
