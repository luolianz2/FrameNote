package com.luolian.framenote.model;

/**
 * 采集条目实体类
 * 代表框记页中的一个采集区，包含图片路径和关联的文字内容
 */
public class NoteItem {

    private long id;            // 采集条目唯一标识
    private long notebookId;    // 所属笔记本 ID
    private String imagePath;   // 图片本地存储路径
    private String textContent; // 关联的文字内容（后续 OCR 识别或手动输入）
    private long createdAt;     // 创建时间戳（毫秒）

    // 无参构造方法
    public NoteItem() {}

    // 快速创建采集条目（仅指定所属笔记本）
    public NoteItem(long notebookId) {
        this.notebookId = notebookId;
        this.createdAt = System.currentTimeMillis();
    }

    // 完整构造方法
    public NoteItem(long id, long notebookId, String imagePath, String textContent, long createdAt) {
        this.id = id;
        this.notebookId = notebookId;
        this.imagePath = imagePath;
        this.textContent = textContent;
        this.createdAt = createdAt;
    }

    // ===== Getter / Setter =====

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNotebookId() {
        return notebookId;
    }

    public void setNotebookId(long notebookId) {
        this.notebookId = notebookId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}
