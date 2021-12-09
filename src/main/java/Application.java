import animals.Kotik;

public class Application {

    static boolean compareVoice(Kotik a, Kotik b) {
        if(a == null){
           return false;
        }
        else{
            return a.getVoice().equals(b.getVoice());
        }
    }

    public static void main(String[] args){

        Kotik a = new Kotik("Вася", "мяу", 10, 10);
        Kotik b = new Kotik();
        b.setName("Петя");
        b.setSatiety(20);
        b.setVoice("бряу");
        b.setWeight(6);

        a.liveAnotherDay();

        for (String result1:Kotik.result) {
            System.out.println(result1);
        }

        System.out.println(a.getName());
        System.out.println(a.getWeight());

        System.out.println(Application.compareVoice(a,b));

        System.out.println(Kotik.getCount());
    }
}
