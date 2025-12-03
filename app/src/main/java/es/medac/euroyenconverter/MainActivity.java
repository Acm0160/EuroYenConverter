package es.medac.euroyenconverter; // ¡TU PAQUETE REAL!

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

// 🔑 Imports CRÍTICOS: Asegúrate de que las rutas son correctas
import es.medac.euroyenconverter.ConverterViewModel;
import es.medac.euroyenconverter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ConverterViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 1. Inicializa el ViewModel
        viewModel = new ViewModelProvider(this).get(ConverterViewModel.class);

        // 2. Infla la interfaz usando DataBindingUtil (Método de Java)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // 3. Conecta el ViewModel al XML
        binding.setVm(viewModel);

        // 4. Establecer el LifecycleOwner
        binding.setLifecycleOwner(this);
    }
}
