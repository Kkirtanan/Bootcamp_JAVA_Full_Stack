// 2. **Verificação de Par ou Ímpar:**
//    - Escreva um programa que determina se um número é par ou ímpar.

const readline = require("readline-sync"); 


let num = Number(readline.question("Digite um numero : "));
let tipo = num %2 == 0 ? "Par":
                  "Impar"

console.log(`O número que você digitou é ${tipo}`);