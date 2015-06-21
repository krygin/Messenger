package park.mail.ru.messenger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ivan on 20.06.2015.
 */
public class ChangeUserDataFragment extends Fragment {

    public static Fragment newInstance() {
        return new ChangeUserDataFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.change_user_data_form, container, false);

        return rootView;
    }
}
