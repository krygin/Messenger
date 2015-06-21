package park.mail.ru.messenger;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 20.06.2015.
 */
public class ContactListAdapter extends RecyclerView.Adapter<ContactListAdapter.ViewHolder> {

    private List<Contact> mContacts = new ArrayList<>();


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Contact contact = mContacts.get(i);
        viewHolder.bindContact(contact);
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mAvatarImageView;
        private TextView mNicknameTextView;
        private TextView mStatusTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            mAvatarImageView = (ImageView) itemView.findViewById(R.id.avatar_image_view);
            mNicknameTextView = (TextView) itemView.findViewById(R.id.nickname_text_view);
            mStatusTextView = (TextView) itemView.findViewById(R.id.status_text_view);
        }

        public void bindContact(Contact contact) {
            mNicknameTextView.setText(contact.getNickname());
            mStatusTextView.setText(contact.getStatus());
        }
    }
}
