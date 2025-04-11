package com.cusaldev.noteapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.cusaldev.noteapp.databinding.FragmentNoteFormBinding
import kotlin.random.Random

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NoteFormFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NoteFormFragment : Fragment() {

    private lateinit var binding: FragmentNoteFormBinding
    private val viewModel: NoteViewModel by activityViewModels()
    private var note: Note? = null

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentNoteFormBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            note = NoteFormFragmentArgs.fromBundle(it).note
        }

        note?.let {
            binding.etTitle.setText(it.title)
            binding.etContent.setText(it.content)
        }

        binding.btnSave.setOnClickListener {
            val title = binding.etTitle.text.toString()
            val content = binding.etContent.text.toString()

            if (note != null) {
                val updatedNote = note!!.copy(title = title, content = content)
                viewModel.updateNote(updatedNote)
            } else {
                val newNote = Note(Random.nextInt(), title, content)
                viewModel.addNote(newNote)
            }

            findNavController().popBackStack()
        }
    }
}