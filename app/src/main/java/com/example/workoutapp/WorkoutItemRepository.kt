package com.example.workoutapp

import android.app.Application

class WorkoutItemRepository(application: Application) {

    private var itemDao : ItemDao?

    init {
        val db = WorkoutItemDatabase.getDatabase(application.applicationContext)
        itemDao = db?.itemsDao()
    }

    fun getItems() = itemDao?.getItems()

    fun addItem(workout_item: Workout_Item) {
        itemDao?.addItem(workout_item)
    }

    fun deleteItem(workout_item: Workout_Item) {
        itemDao?.deleteItem(workout_item)
    }

    fun getItem(id: Int) {
        itemDao?.getItem(id)
    }

}