package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatfeature.R;

import java.util.ArrayList;

import model.ChatModel;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

    private ArrayList<ChatModel> chatModels;
    private Context context;

    public ChatAdapter(ArrayList<ChatModel>chatModels, Context context){
        this.chatModels = chatModels;
        this.context = context;

    }
        // testing comment dont mind this i dunno what else to do
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInFlaster = LayoutInflater.from((parent.getContext()));
        View listItem = layoutInFlaster.inflate(R.layout.messeger1, parent, false );
        ViewHolder holder = new ViewHolder( listItem);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.message.setText(chatModels.get(position).getMessage());


    }

    @Override
    public int getItemCount() {
        return chatModels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView message;
        public ViewHolder(View itemView){
            super(itemView);
            this.message = itemView.findViewById(R.id.message_body);

        }
    }
}
