package org.xiao.cms.vo;

import java.util.Date;

/**
 * Created by Administrator on 2014/11/7.
 */
public class Article {
    private int id;
    private String name;
    private String summary;
    private String content;
    private Date created;
    private Date edited;
    private Date published;

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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getEdited() {
        return edited;
    }

    public void setEdited(Date edited) {
        this.edited = edited;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (id != article.id) return false;
        if (content != null ? !content.equals(article.content) : article.content != null) return false;
        if (created != null ? !created.equals(article.created) : article.created != null) return false;
        if (edited != null ? !edited.equals(article.edited) : article.edited != null) return false;
        if (name != null ? !name.equals(article.name) : article.name != null) return false;
        if (published != null ? !published.equals(article.published) : article.published != null) return false;
        if (summary != null ? !summary.equals(article.summary) : article.summary != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (edited != null ? edited.hashCode() : 0);
        result = 31 * result + (published != null ? published.hashCode() : 0);
        return result;
    }
}
