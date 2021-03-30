/*
 * Copyright 2021 Paulo Pereira
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.presentation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.ExperimentalAnimationApi
import com.example.androiddevchallenge.domain.models.Person
import com.example.androiddevchallenge.presentation.sample.AutoCompleteSample
import com.example.androiddevchallenge.presentation.theme.MyTheme

class MainActivity : AppCompatActivity() {

    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                val persons = listOf(
                    Person(
                        name = "Paulo Pereira",
                        age = 23
                    ),
                    Person(
                        name = "Daenerys Targaryen",
                        age = 24
                    ),
                    Person(
                        name = "Jon Snow",
                        age = 24
                    ),
                    Person(
                        name = "Sansa Stark",
                        age = 20
                    ),
                )
                AutoCompleteSample(persons = persons)
            }
        }
    }
}
