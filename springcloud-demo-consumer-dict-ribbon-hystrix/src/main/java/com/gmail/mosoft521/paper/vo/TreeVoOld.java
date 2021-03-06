package com.gmail.mosoft521.paper.vo;

import java.io.Serializable;
import java.util.List;

public class TreeVoOld implements Serializable {
    private static final long serialVersionUID = -3397958943184445930L;
    private Long id;
    private String text;
    private List<TreeVoOld> children;

    public TreeVoOld() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<TreeVoOld> getChildren() {
        return children;
    }

    public void setChildren(List<TreeVoOld> children) {
        this.children = children;
    }
}
