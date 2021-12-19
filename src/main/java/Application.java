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
    }
}
