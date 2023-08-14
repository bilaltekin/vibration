package mobil.tekin.com.vibration;

import android.content.Context;
import android.os.Vibrator;

/**
 * Created by VAIO on 29.01.2019.
 */

public class Vibrasyon {

    private Context c;

    public Vibrasyon(Context c) {
        this.c = c;
    }

    public void Titrestir()
    {
        Vibrator v= (Vibrator) c.getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(2000);
    }

    public void Titrestir2()
    {
        Vibrator v = ( Vibrator )c.getSystemService(Context.VIBRATOR_SERVICE);
        long patern[] = {1000, 1000, 300, 100};
        v.vibrate(patern,3);
    }
}
