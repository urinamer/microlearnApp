package com.example.microlearn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {

    private Context context;
    private ArrayList<ChatBubble> chatBubbles;

    public ChatAdapter(Context context, ArrayList<ChatBubble> chatBubbles) {
        this.context = context;
        this.chatBubbles = chatBubbles;
    }


    @NonNull
    @Override
    public ChatAdapter.ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if(viewType == 0){

            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bubble_item, parent, false);
        }
        else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bubble_ai_item, parent, false);
        }
        return new ChatViewHolder(view);

    }
    //0 = user, 1 = ai
    @Override
    public int getItemViewType(int position){
        if(chatBubbles.get(position).isUser()){
            return 0;
        }
        else {
            return 1;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.ChatViewHolder holder, int position) {
        ChatBubble chatBubble = chatBubbles.get(position);
        holder.message.setText(chatBubble.getMessage());

    }

    @Override
    public int getItemCount() {
        return chatBubbles.size();
    }

    public static class ChatViewHolder extends RecyclerView.ViewHolder{

        TextView message;

        public ChatViewHolder(@NonNull View itemView) {
            super(itemView);
            message = itemView.findViewById(R.id.tvMessage);
        }
    }
}