public class proLang {
    String languages;

    proLang(){
        this.languages = "Java";
    }
    proLang(String language){
        this.languages = language;
    }
    public void getLanguage(){
        System.out.println("Programming language is : " + this.languages);
    }

    public static void main(String[] args) {
        proLang pl1 = new proLang();
        proLang pl2 = new proLang("Python");
        pl1.getLanguage();
        pl2.getLanguage();
    }
}