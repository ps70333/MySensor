package tw.com.ei.mysensor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SensorManager smgr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        smgr = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> list=smgr.getSensorList(Sensor.TYPE_ALL);
        for(Sensor sensor:list){
            String name=sensor.getName();
            int type=sensor.getType();
            String vendor=sensor.getVendor();
            Log.i("simon",name+" : "+type+" : "+vendor);
        }

    }
    public class MySensorListener implements SensorEventListener{
        @Override
        public void onSensorChanged(SensorEvent event) {

        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {

        }
    }

}
