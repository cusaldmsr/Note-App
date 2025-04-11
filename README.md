<div align="center">

 
<img src="Github Assets/githubAndroidImg.png" width = "300">
</div>
<div align="center">


# 📝 Note App - MVVM Architecture

This is a simple **Note Taking App** built as part of the **Android Class 4th Assignment** at **IDET Institute**. The app follows the **MVVM (Model-View-ViewModel)** architectural pattern and demonstrates the use of **LiveData**, **RecyclerView**, and **Fragment** for a clean and modern Android development approach.

</div>

## 📌 Features

- ✅ Add a new note
- ✅ View note details
- ✅ Edit existing notes
- ✅ Display list of notes using `RecyclerView`
- ✅ Automatically updates UI using `LiveData` and `MutableLiveData`
- ✅ All notes are managed within a `Fragment` using MVVM architecture

## 🧠 Architecture - MVVM

- **Model**: Represents the Note data class
- **View**: UI components including Fragments and XML layouts
- **ViewModel**: Handles data logic and exposes `LiveData` for the View to observe

## 🛠️ Tech Stack

- **Kotlin**
- **Android Jetpack Components**
  - LiveData
  - ViewModel
  - Fragment
  - RecyclerView
- **MVVM Architecture**

## 📂 Project Structure

```
Note-App/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/noteapp/
│   │   │   │   ├── ui/        # Fragments and UI logic 
│   │   │   │   │                (NoteFragment, AddEditNoteFragment)
│   │   │   │   ├── adapters/  # RecyclerView Adapter (NoteAdapter)
│   │   │   │   ├── model/     # Note data model
│   │   │   │   ├── viewmodel/ # NoteViewModel
│   │   │   │   └── MainActivity.kt
│   │   │   └── res/
│   │   │       ├── drawable/ 
│   │   │       ├── layout/ 
│   │   │       ├── mipmap/ 
│   │   │       ├── navigation/ 
│   │   │       ├── values/ 
│   │   │       └── xml/
│   └── build.gradle
└── build.gradle
```


## 🚀 How It Works

- Notes are displayed in a `RecyclerView` inside a `Fragment`.
- When a new note is added or an existing one is updated, the `ViewModel` updates the note list using `MutableLiveData`.
- The `RecyclerView` automatically refreshes its content by observing the LiveData from the `ViewModel`.

## 📷 UI Screenshots 

<div align="center">
<img src="Github Assets/note_list_img.png" width = "300">
<img src="Github Assets/add_note_img.png" width = "300">
</div>

## 📜 Commit History

> **1. Initializes Note App project and create a data model.** [`34a623d`](https://github.com/cusaldmsr/Note-App/commit/34a623da12d22df24ec0ab875f5302585ccf2c25)

> **2. Implements NoteViewModel with basic CRUD operations.** [`d342f11`](https://github.com/cusaldmsr/Note-App/commit/d342f116588c78fffeae5b4bd37560e489963fac)

> **3. Adds Navigation, ViewBinding, and related dependencies.** [`ceba0c4`](https://github.com/cusaldmsr/Note-App/commit/ceba0c4622e504ae12e8908623c23a28bb7dfa6b)

> **4. Implements Note serialization and item layout.** [`5535694`](https://github.com/cusaldmsr/Note-App/commit/553569416138d8512912cd29929af0d0f283a714)

> **5. Implements NoteAdapter to display notes in a RecyclerView.** [`385fdee`](https://github.com/cusaldmsr/Note-App/commit/385fdee345fd8693693d7dfc27cc2f25c72c6bd5)

> **6. Implements note list and form fragments with navigation.** [`2a86dba`](https://github.com/cusaldmsr/Note-App/commit/2a86dbae6ced38916eb8f4d83e7a665acb5c0715)

> **7. Adds navigation graph for NoteListFragment and NoteFormFragment.** [`850e6b3`](https://github.com/cusaldmsr/Note-App/commit/850e6b37be12dfd9f8d40f0826306b904e62cebb)

> **8. Implements navigation between note list and form.** [`3f88f89`](https://github.com/cusaldmsr/Note-App/commit/3f88f8915ecffc97f70f55e30b175e4656ca6558)

> **9. Connects MainActivity to navigation graph.** [`a3a1153`](https://github.com/cusaldmsr/Note-App/commit/a3a1153f201f70fa54e292ac3d30e0e2bd847777)

> **10. Adds launcher icon background color resource.** [`8d5938c`](https://github.com/cusaldmsr/Note-App/commit/8d5938c22b3acf4a63f54c4e90d718914c6f14fd)

## 🔗 Repository

GitHub Repo: [https://github.com/cusaldmsr/Note-App](https://github.com/cusaldmsr/Note-App)

## 👨‍🎓 Author

GitHub: [@cusaldmsr](https://github.com/cusaldmsr)

---

Feel free to contribute or fork the project for your own learning!
