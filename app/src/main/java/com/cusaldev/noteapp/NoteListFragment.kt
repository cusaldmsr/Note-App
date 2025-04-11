package com.cusaldev.noteapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.cusaldev.noteapp.databinding.FragmentNoteListBinding

class NoteListFragment : Fragment() {
    private lateinit var binding: FragmentNoteListBinding
    private lateinit var adapter: NoteAdapter
    private val viewModel: NoteViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNoteListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = NoteAdapter(emptyList()) { selectedNote ->
            val action = NoteListFragmentDirections
                .actionNoteListFragmentToNoteFormFragment(selectedNote)
            findNavController().navigate(action)
        }

        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter

        viewModel.notes.observe(viewLifecycleOwner) { notes ->
            adapter.updateList(notes)
        }

        binding.btnAdd.setOnClickListener {
            val action = NoteListFragmentDirections
                .actionNoteListFragmentToNoteFormFragment(null)
            findNavController().navigate(action)
        }
    }
}
