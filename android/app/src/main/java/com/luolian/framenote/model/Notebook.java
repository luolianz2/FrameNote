package com.luolian.framenote.model;

/**
 * 笔记本实体类
 * 代表一个课程笔记本，包含多条笔记采集记录
 */
public class Notebook {

    private long id;            // 笔记本唯一标识
    private String title;       // 笔记本标题（如"高等数学"）
    private long createdAt;     // 创建时间戳（毫秒）

    // 无参构造方法
    public Notebook() {}

    // 快速创建笔记本
    public Notebook(String title) {
        this.title = title;
        this.createdAt = System.currentTimeMillis();
    }

    // 完整构造方法
    public Notebook(long id, String title, long createdAt) {
        this.id = id;
        this.title = title;
        this.createdAt = createdAt;
    }

    // ===== Getter / Setter =====

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}
