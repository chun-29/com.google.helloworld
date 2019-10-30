package com.google.chapter.six;

/**
 * @program: classprogram
 * @Description: 继承父类Book
 * @author: chun
 * @date: 2019/10/30
 */
public class Dictionary extends Book {
    private int definitions;

    public Dictionary(int definitions) {
        this.definitions = definitions;
    }

    public Dictionary(String bookId, String bookName, int pages, int definitions) {
        super(bookId, bookName, pages);
        this.definitions = definitions;
    }

    public int getDefinitions() {
        return definitions;
    }

    public void setDefinitions(int definitions) {
        this.definitions = definitions;
    }

    //覆盖
    public String getBookId() {
        return  DefaultValue.DICTIONARY_SKU + super.getBookId();
    }
}
