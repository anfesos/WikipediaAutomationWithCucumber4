package org.test.basicconcept.modules;

public class SearchToDo {

    private String word;
    private String resultWord;

    public SearchToDo(String word, String resultWord) {
        this.word = word;
        this.resultWord = resultWord;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getResultWord() {
        return resultWord;
    }

    public void setResultWord(String resultWord) {
        this.resultWord = resultWord;
    }
}
