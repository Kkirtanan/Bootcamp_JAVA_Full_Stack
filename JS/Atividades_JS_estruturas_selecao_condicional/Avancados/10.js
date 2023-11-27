// 10. **Simulador de Empréstimo:**
//     - Desenvolva um programa que simula um sistema de empréstimo, determinando se um cliente é elegível com base na renda, idade e histórico de crédito.


console.log("<-------Informe os dados do cliente-------->");
const readline = require("readline-sync"); 
let renda = parseFloat(readline.question("Informe a renda mensal em R$ : "));
let pagador = (readline.question("Informe a classificação de crédito (MB - muito bom B - bom R - ruim) : "));
let idade = Number(readline.question("Informe a idade em anos : "));

if (idade >= 18 && idade <=80 && renda >= 1320 && (pagador == "MB" || pagador == "B") ) {
  console.log("Cliente elegível, seguir com a simulação de empréstimo.");
} else {
  console.log("Cliente não elegível, informe ao cliente que neste momento não há crédito disponível.");
}


