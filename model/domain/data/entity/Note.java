package OOP7.model.domain.entity;

import .annotation.NonNull;

public class  {
    private  Stringid = "";
    private  Stringheader;
    private String text;

    public Note( Stringheader , Stringtext) {
        this.header = header;
        this.text = text;
    }

    public Note(String id, String header, String text) {
        this(header, text);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @NonNull
    @Override
    public String toString() {
        return "Идентификатор: "+ id +" Заголовок: " + header + " Текст: " + text;
    }
}