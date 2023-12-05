package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment

class MyDialog : DialogFragment() {

   /* override fun onCreateDialog(savedInstanceState: Bundle?) =
        AlertDialog.Builder(requireContext())
            .setMessage("Какое-то сообщение внутри диалога!")
            .setPositiveButton("Ok") { _,_ -> }
            .setNegativeButton("Cancel") { _,_ -> }
            .create()*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(context).inflate(R.layout.mydialog,container,false)
    }

    companion object {
        const val TAG = "MyDialog"
    }
}