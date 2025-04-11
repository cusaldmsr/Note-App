package com.cusaldev.noteapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NoteViewModel : ViewModel() {

    private val _notes = MutableLiveData<MutableList<Note>>(mutableListOf())
    val notes: LiveData<MutableList<Note>> get() = _notes

    fun addNote(note: Note) {
        _notes.value?.add(note)
        _notes.value = _notes.value // Trigger LiveData observer
    }

    fun updateNote(updatedNote: Note) {
        _notes.value = _notes.value?.map {
            if (it.id == updatedNote.id) updatedNote else it
        }?.toMutableList()
    }

    fun getNoteById(id: Int): Note? {
        return _notes.value?.find { it.id == id }
    }
}
