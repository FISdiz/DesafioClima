package cl.desafiolatam.desafioclima;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import cl.desafiolatam.desafioclima.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // DataBindingUtil, infla la vista activity_main para ser utilizanda en binding.
        //si mi layout se llama "activity_main", debo hacer binding con "ActivityMainBinding", si el layout se llamase layout_principal, el binding sería LayoutPrincipalBinding
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Reemplazo y asigno un nuevo texto al componente de id "textView" (borrado)
        // binding.textView.setText("Welcome again!");

        R.drawable.ic_wb_sunny_black_24dp;
        DailyWeather dailyWeather = new DailyWeather("Santiago", "03/03/2020", "@drawable/ic_wb_sunny_black_24dp", "30", "°C" );

        binding.setWeather(dailyWeather);

    }
}
