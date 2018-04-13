package com.example.wiltontuckerhart.examen3calculadora.subclases;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.wiltontuckerhart.examen3calculadora.R;

import org.sufficientlysecure.htmltextview.HtmlTextView;

public class ToDoViewHolder extends RecyclerView.ViewHolder{
    public HtmlTextView html;
    public ImageView Deleate;

    public ToDoViewHolder(View itemView) {
        super(itemView);
        html = itemView.findViewById(R.id.html_text);
        Deleate = itemView.findViewById(R.id.delete);
    }
}
