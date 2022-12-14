package uz.alikhanov.darslar.ui.Hasanxon;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HasanxonViewModel extends ViewModel {

    private final MutableLiveData<String> mText;



    public HasanxonViewModel(MutableLiveData<String> mText) {
        this.mText = mText;
    }

    public LiveData<String> getText() {
        return mText;
    }
}
