abstract class Language {
    String language;

    abstract void greeting();

    abstract void aboutLanguage();

    abstract void setLanguage();

    String getLanguage() {
        return language;
    }

    void notAnAbstractMethod(){
        
    }
}


class French extends Language{
    
    @Override
    void greeting(){
        System.out.println("Hola");
    }

    @Override
    void aboutLanguage() {
        System.out.println("This is French Language.");
        
    }

    @Override
    void setLanguage() {
        language = "French";
        
    }

}

class English extends Language{
    @Override
    void greeting(){
        System.out.println("Hi");
    }

    @Override
    void aboutLanguage() {
        System.out.println("This is English Language");
        
    }

    @Override
    void setLanguage() {
        language = "English";
        
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        English english = new English();
        english.aboutLanguage();
        english.greeting();
    }
}
