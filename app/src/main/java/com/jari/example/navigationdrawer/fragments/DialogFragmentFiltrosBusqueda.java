package com.jari.example.navigationdrawer.fragments;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.jari.example.navigationdrawer.R;

/**
 * Created by Jonnathan on 02/09/2016.
 */
public class DialogFragmentFiltrosBusqueda extends DialogFragment {

    public DialogFragmentFiltrosBusqueda() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_fragment_filtros_busqueda, container);
//        mEditText = (EditText) view.findViewById(R.id.username);
//
//        // set this instance as callback for editor action
//        mEditText.setOnEditorActionListener(this);
//        mEditText.requestFocus();
        getDialog().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getDialog().setTitle(R.string.dialog_fragment_filtros_busqueda_titulo);

        return view;
    }

//    @Override
//    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
//        // Return input text to activity
//        UserNameListener activity = (UserNameListener) getActivity();
//        activity.onFinishUserDialog(mEditText.getText().toString());
//        this.dismiss();
//        return true;
//    }

//    @Override
//    public Dialog onCreateDialog(Bundle savedInstanceState) {
//
//
//
//        return super.onCreateDialog(savedInstanceState);
//    }
}
