package app.codinguyy.dialogfragmentexample.dialogwithnavcontroller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.DialogFragment
import app.codinguyy.dialogfragmentexample.R

class DialogFragmentExample() : DialogFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.dialog_fragment, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<AppCompatButton>(R.id.button)
        val textview = view.findViewById<TextView>(R.id.textview_headline)

        val text = arguments?.getString("bundle_key_text")

        text?.let {
            textview.text = it
        }

        button.setOnClickListener {
            dismiss()
        }
    }
}
