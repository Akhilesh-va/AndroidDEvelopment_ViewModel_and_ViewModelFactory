import android.view.View
import androidx.lifecycle.ViewModel

class MyViewModel(val IntialValue:Int) : ViewModel() {
    var count =IntialValue;
    fun increment() {
        count++


    }
}