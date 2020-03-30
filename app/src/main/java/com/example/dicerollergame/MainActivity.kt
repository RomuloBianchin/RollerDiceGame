package com.example.dicerollergame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Criando um objeto do tipo Button e associando o mesmo ao Id correspondente.
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice() // Método que irá randomizar numeros de 1 a 6 e exibir o lado do dado correspondente.
        }

    }

    private fun rollDice() {

        // Criando um objeto e associando a classe Random, para que possamos gerar números aleatórios de 1 a 6.
        val randomInt = Random.nextInt(6) + 1

        // Utilizando a condicional when para análisar a imagem
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Criando um objeto do tipo ImageView, e associnado o mesmo ao seu id.
        val diceImage: ImageView = findViewById(R.id.dice_image)

        // Passando as imagens dos dados correspondetes a cada número gerado aleatóriamente ao clicar no botão.
        diceImage.setImageResource(drawableResource)

    }
}
