import java.util.Random;
import java.util.Collections;

public class JuhuslikValik extends Valik implements ValikuLiides{
    Random rand = new Random();

    public void alusta(){
        Collections.shuffle(this.ulesanded);
    }

    
}