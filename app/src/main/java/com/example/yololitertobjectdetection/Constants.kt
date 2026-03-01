package com.example.yololitertobjectdetection

object Constants {
    const val MODEL_PATH = "best_float16.tflite"
    val LABELS_PATH: String? = "labels.txt" //null // provide your labels.txt file if the metadata not present in the model
}
