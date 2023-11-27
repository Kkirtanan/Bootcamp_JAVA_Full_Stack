// 3. **Calculadora Simples:**
//    - Implemente uma calculadora que recebe dois números e uma operação (adição, subtração, multiplicação, divisão) e retorna o resultado.

const readline = require("readline-sync"); 

let n1 = Number(readline.question("Digite o primeiro número : "));
let n2 = Number(readline.question("Digite o segundo núemro : "));
let op = (readline.question("Informe qual operação deseja realizar, + para adição, - para subtração, x para multiplicação : "));

let calculadora;
calculadora = op === "+"? n1+n2:
              op === "-"? n1-n2:
                          n1*n2

console.log(`O resultado de ${n1}${op}${n2} é igaul a ${calculadora}`);

