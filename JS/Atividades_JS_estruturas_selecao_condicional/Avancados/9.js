// 9. **Jogo de Adivinhação:**
//    - Crie um jogo onde o programa escolhe um número aleatório e o jogador tem que adivinhar qual é. O programa deve fornecer dicas se o número fornecido é maior ou menor.


let advinha;
let x = Math.floor((Math.random() * 10) + 1);
while (advinha != `Parabés você acertou, o número aleatório é ${x}!`) {
  const readline = require("readline-sync"); 
  let num = Number(readline.question("Tente advinhar qual é o número aleatório, entre 1 e 10: "));

advinha = num == x? `Parabés você acertou, o número aleatório é ${x}!`:
          num > x && num <= 10? "Tente um número menor":
          num >= 1 && num < x ? "Tente um número maior":
                                            "Insira apenas números entre 1 e 10"
console.log(advinha); 
}


