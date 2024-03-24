package com.example.assignment7th_

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.assignment7th_.databinding.FragmentAddTaskBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.snackbar.Snackbar

class AddTaskFragment : BottomSheetDialogFragment() {

    lateinit var binding : FragmentAddTaskBinding

    val mainActivity get() = activity as MainActivity


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        binding = FragmentAddTaskBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSave.setOnClickListener {

            if (binding.etName.text.toString().isEmpty() or binding.etDescription.text.toString()
                    .isEmpty()
            ) {

                //Snackbar.make(view,"작업설명",Snackbar.LENGTH_LONG).show()
                Toast.makeText(requireContext(), "작업이름과 설명을 채운 후 save를 눌러주세요.", Toast.LENGTH_SHORT)
                    .show()
            } else {
                mainActivity.setTaskName(binding.etName.text.toString())
                mainActivity.setTaskDescription(binding.etDescription.text.toString())

                dismiss()//fragment 접근
            }
        }
    }
}