package task13;

import task12.Book;

/**
 * Created by Anastasia_Paramonova on 03.10.2016.
 */

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    @Override
    public boolean equals(Object object) {
        if(this == object){
            return true;
        }
        if(object == null || this.getClass() != object.getClass()){
            return false;
        }

        if(!super.equals(object)){
            return false;
        }

        ProgrammerBook book = (ProgrammerBook) object;
        if(level != book.level){
            return false;
        }
        if(book.language == null){
            if(language != null){
                return false;
            }
        }else {
            if(!book.language.equals(language)){
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = (615479 * level) << 9 & (level * 20147) >> level;

        if(language != null){
            hash *= language.hashCode();
        }else{
            hash *= 430783;
        }

        return hash;
    }

    @Override
    public String toString() {
        return super.toString() + "\nlanguage=" + language+", level=" + level;
    }
}
