package es.medac.euroyenconverter; // ¡TU PAQUETE REAL!

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.Locale;

public class ConverterViewModel extends ViewModel {

    // LiveData para la entrada de texto (Two-Way Binding)
    public final MutableLiveData<String> eurosInput = new MutableLiveData<>("");

    // LiveData para el resultado (One-Way Binding)
    public final MutableLiveData<String> resultadoYenes = new MutableLiveData<>();

    private static final double TASA_CAMBIO = 181.25;

    public ConverterViewModel() {
        resultadoYenes.setValue("El resultado en yenes aparecerá aquí.");
    }

    /**
     * Nuevo método de conversión sin argumentos.
     * Obtiene el valor directamente de 'eurosInput' (que es actualizado por el EditText).
     */
    public void convertir() {
        // 1. Obtiene el texto de la variable de LiveData
        String eurosStr = eurosInput.getValue();

        if (eurosStr == null || eurosStr.trim().isEmpty()) {
            resultadoYenes.setValue("Por favor, introduce una cantidad válida.");
            return;
        }

        try {
            double euros = Double.parseDouble(eurosStr);
            double yenes = euros * TASA_CAMBIO;

            String resultado = String.format(Locale.US, "Resultado: %.2f Yenes (¥)", yenes);
            resultadoYenes.setValue(resultado);

        } catch (NumberFormatException e) {
            resultadoYenes.setValue("Por favor, introduce una cantidad válida.");
        }
    }
}

