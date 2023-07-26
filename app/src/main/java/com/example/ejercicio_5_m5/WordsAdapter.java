package com.example.ejercicio_5_m5;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class WordsAdapter extends RecyclerView.Adapter <WordsAdapter.ViewHolder>{

    private List<String> words;
    @NonNull
    @Override
    public WordsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull WordsAdapter.ViewHolder holder, int position) {
        String item = words.get(position);
        holder.showInformation(item);

    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemBinding itemBinding;
        public ViewHolder(ItemBinding binding) {
            super(binding.getRoot());
            itemBinding = binding;
        }
    }

    public void showInformation(String words){
        itemBinding.textview.setText(words);
    }
}
