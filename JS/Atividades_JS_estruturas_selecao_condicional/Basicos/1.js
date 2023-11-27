// 1. **Verificação de Números:**
//    - Crie um programa que verifica se um número é positivo, negativo ou zero.

const readline = require("readline-sync"); 
let num = Number(readline.question("Digite um numero : "));

let verificacao = num ==0 ? "nulo":
                  num >0 ?  "Positvo":
                  "Negativo"

console.log(verificacao);

