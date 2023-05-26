package com.example.trivia

import android.hardware.biometrics.BiometricManager

class StatFeed(val name: String, val image: Int);
class ALLResults(
    val results: List<ResultFeed>,
    val response_code: Int
)

class Quizresults(
    val results: String
)

class ResultFeed(
    val category: String,
    val type: String,
    val Difficulty: String,
    val question: String,
    val correct_answer: String,
    val incorrect_answers: ArrayList<String>

)

class JoinedFeed(
    val questions: ArrayList<BiometricManager.Strings>,
    val answer: ArrayList<ArrayList<String>>,
    val correct_answer: ArrayList<String>
)