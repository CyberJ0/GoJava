package lessons.Other;

public class ByakaReplacedCensored {
    public static void main(String[] args) {
        //Задача:
        //Необходимо слово - бяка, заменить на - censored
        String cens = "Какая то бяка, была настолько бяка, что эту бяка не исправить.";
        System.out.println(cens);

        cens = cens.replace("бяка", "censored");
        System.out.println(cens);
    }
}
