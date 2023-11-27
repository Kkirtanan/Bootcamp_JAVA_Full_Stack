// 6. **Cálculo de Desconto:**
//    - Desenvolva um programa que calcula o valor final após aplicar um desconto a um determinado preço.


let desconto = "Valores inválidos"
let qtd;
let precoTot;
let pct;
while (desconto == "Valores inválidos") {
  const readline = require("readline-sync"); 
  let precoUn = Number(readline.question("Qual o preço unitário em R$? : "));
  qtd = Number(readline.question("Qual a quantidade desejada, entre 1 e 10? : "));
  precoTot = precoUn*qtd
  if (qtd >= 1 && qtd <= 5 && precoUn >=0) {
    pct = 0.9;
    desconto = Number(precoTot*pct).toFixed(2);
  } else if (qtd >= 5 && qtd <= 10 && precoUn >= 0) {
      pct = 0.8;
      desconto = Number(precoTot*pct).toFixed(2);
    } else {
        desconto = "Valores inválidos";
        console.log(desconto);
      }
} 

console.log(`O preço total para ${qtd} unidades é de R$ ${desconto} e foi concedido um desconto de ${(1-pct).toFixed(1)*100}% !!!`);


