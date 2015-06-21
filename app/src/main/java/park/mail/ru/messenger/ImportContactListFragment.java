package park.mail.ru.messenger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ivan on 20.06.2015.
 */
public class ImportContactListFragment extends Fragment {
    private RecyclerView mContactList;

    public static Fragment newInstance() {
        return new ContactListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.contact_list, container, false);
        mContactList = (RecyclerView) rootView.findViewById(R.id.list);
        mContactList.setLayoutManager(new LinearLayoutManager(getActivity()));
        mContactList.setAdapter(new ContactListAdapter());
        return rootView;
    }
}
