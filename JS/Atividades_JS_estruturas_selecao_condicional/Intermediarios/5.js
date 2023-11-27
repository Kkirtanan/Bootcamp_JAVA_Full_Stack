//  5. **Conversor de Notas:**
//    - Escreva um programa que converte notas numéricas em conceitos (A, B, C, D, F) baseado em um sistema de pontuação. 


let conversor = "Nota inválida, insira um valor entra 0 e 10";
while (conversor == "Nota inválida, insira um valor entra 0 e 10") {
   const readline = require("readline-sync"); 
   let nota = Number(readline.question("Digite uma nota de 0 a 10 : "));
   conversor = nota >=0 && nota <=2? "Conceito F":
               nota > 2 && nota <=4? "Conceito D":
               nota > 4 && nota <=6? "Conceito C":
               nota > 6 && nota <=8? "Conceito B":
               nota > 8 && nota <=10? "Conceito A":
                                       "Nota inválida, insira um valor entra 0 e 10"
console.log(conversor);
}

console.log("Fim da consulta");





