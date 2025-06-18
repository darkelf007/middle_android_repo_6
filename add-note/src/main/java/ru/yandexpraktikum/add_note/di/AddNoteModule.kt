package ru.yandexpraktikum.add_note.di

import ru.yandexpraktikum.add_note.domain.interactors.AddNoteInteractor
import ru.yandexpraktikum.add_note.domain.interactors.AddNoteInteractorImpl
import dagger.Binds
import dagger.Module

@Module
interface AddNoteModule {
    @Binds
    fun bindAddNoteUsecase(impl: AddNoteInteractorImpl): AddNoteInteractor
}