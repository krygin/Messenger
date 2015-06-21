package park.mail.ru.messenger;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/**
 * Created by Ivan on 13.06.2015.
 */
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private NavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mNavigationView = (NavigationView) findViewById(R.id.navigation_view);
        mNavigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        switch (menuItem.getItemId()) {
            case R.id.contact_list:
                fragmentTransaction.replace(R.id.content, ContactListFragment.newInstance());
                break;
            case R.id.change_user_data:
                fragmentTransaction.replace(R.id.content, ChangeUserDataFragment.newInstance());
                break;
            case R.id.import_contacts:
                fragmentTransaction.replace(R.id.content, ImportContactListFragment.newInstance());
                break;
        }
        fragmentTransaction.commit();
        return true;
    }
}
