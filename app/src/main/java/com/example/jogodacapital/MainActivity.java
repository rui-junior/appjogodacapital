package com.example.jogodacapital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int tries = 0;
    int acertos = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play (View view) {

        EditText Capital = findViewById(R.id.editTextCapital);
        TextView NomeDoEstado = findViewById(R.id.textViewNomeDoEstado);
        TextView Tentativas = findViewById(R.id.textViewResultado);
        TextView Pontuacao = findViewById(R.id.textViewPontuacao)

        String[] Estado = {
                "Acre",
                "Alagoas",
                "Amapá",
                "Amazonas",
                "Bahia",
                "Ceará",
                "Distrito Federal",
                "Espírito Santo",
                "Goiás",
                "Maranhão",
                "Mato Grosso",
                "Mato Grosso do Sul",
                "Minas Gerais",
                "Pará",
                "Paraíba",
                "Paraná",
                "Pernambuco",
                "Piauí",
                "Rio de Janeiro",
                "Rio Grande do Norte",
                "Rio Grande do Sul",
                "Rondonia",
                "Roraima",
                "Santa Catarina",
                "São Paulo",
                "Sergipe",
                "Tocantins"
        };


        if(CapitalString.length() == 0){

            Toast.makeText(this, "Forneça uma Capital", Toast.LENGTH_SHORT).show();

        } else {

            while(tries < 6) {
                int randomico = new Random().nextInt(28);
                //gera um numero randomico de 0 a 27

                NomeDoEstado.setText(Estado[randomico]);
                Pontuacao.setText(acertos);
                Tentativas.setText(tries);

                switch (Estado[randomico]){

                    case "Acre":
                        Capital === "Rio Branco" ? acertos++ : "";
                        break;

                    case "Alagoas":
                        Capital === "Maceio" ? acertos++ : "";
                        break;

                    case "Amapa":
                        Capital === "Macapa" ? acertos++ : "";
                        break;

                    case "Amazonas":
                        Capital === "Manaus" ? acertos++ : "";
                        break;

                    case "Bahia":
                        Capital === "Salvador" ? acertos++ : "";
                        break;

                    case "Ceara":
                        Capital === "Fortaleza" ? acertos++ : "";
                        break;

                    case "Distrito Federal":
                        Capital === "Brasilia" ? acertos++ : "";
                        break;

                    case "Espirito Santo":
                        Capital === "Vitoria" ? acertos++ : "";
                        break;

                    case "Goiais":
                        Capital === "Goiania" ? acertos++ : "";
                        break;

                    case "Maranhão":
                        Capital === "São Luiz" ? acertos++ : "";
                        break;

                    case "Mato Grosso":
                        Capital === "Cuiabá" ? acertos++ : "";
                        break;

                    case "Mato Grosso do Sul":
                        Capital === "Campo Grande" ? acertos++ : "";
                        break;

                    case "Minas Gerais":
                        Capital === "Belo Horizonte" ? acertos++ : "";
                        break;

                    case "Pará":
                        Capital === "Belem" ? acertos++ : "";
                        break;

                    case "Paraiba":
                        Capital === "Joao Pessoa" ? acertos++ : "";
                        break;

                    case "Paraná":
                        Capital === "Curitiba" ? acertos++ : "";
                        break;

                    case "Pernambuco":
                        Capital === "Recife" ? acertos++ : "";
                        break;

                    case "Piaui":
                        Capital === "Teresina" ? acertos++ : "";
                        break;

                    case "Rio de Janeiro":
                        Capital === "Rio de Janeiro" ? acertos++ : "";
                        break;

                    case "Rio Grande do Norte":
                        Capital === "Natal" ? acertos++ : "";
                        break;

                    case "Rio Grande do Sul":
                        Capital === "Porto Alegre" ? acertos++ : "";
                        break;

                    case "Rondonia":
                        Capital === "Porto Velho" ? acertos++ : "";
                        break;

                    case "Roraima":
                        Capital === "Boa Vista" ? acertos++ : "";
                        break;

                    case "Santa Catarina":
                        Capital === "Florianopolis" ? acertos++ : "";
                        break;

                    case "Sao Paulo":
                        Capital === "Sao Paulo" ? acertos++ : "";
                        break;

                    case "Sergipe":
                        Capital === "Aracaju" ? acertos++ : "";
                        break;

                    case "Tocantins":
                        Capital === "Palmas" ? acertos++ : "";
                        break;

                    default:
                        acertos--;
                }


                tries++;

            }

        }

    }

}