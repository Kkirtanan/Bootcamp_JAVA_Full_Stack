// Condicional Simples
// let idade = 10;
// if (idade>=18){
//   console.log("Você é maior de idade");
// }

// Condicional Composta 
// if (idade >=18) {
//   console.log("Você é maior de idade");
// } else{
//   console.log("Você é menor de idade");
// }

// Condicionla encadeada
// let hora = 11.5
// if (hora<12) {
//   console.log("Bom Dia");
// } else if (hora >= 12 && hora <18) {
//   console.log("Boa Tarde");
// } else {
//   console.log("Boa Noite");
// }
  
// let idade = -1;
// if (idade>=0 && idade<= 2) {
//   console.log("Bebê");
// } else if (idade>2 && idade <= 12){
//   console.log("Criança");
// }else if(idade > 12 && idade< 18){
//   console.log("Adolescente");
// }else if(idade > 18 && idade < 60){
//   console.log("Adulto");
// }else if(idade >= 60 && idade <= 130){
//   console.log("Idoso");
// } else {
//   console.log("Idade invalida");
// }

// Operador bitwise AND (& bit a bit), converte em binario

// Operador Ternário
// let num = 10
// let resultado = num%2 === 0 ? "par":"impar";
// console.log("O resultado é: ", resultado);

// Outro jeito de concatenar string no JS TEMPLATE STRING
// console.log(`O resultado é: ${resultado}.`);

// Exemplo operador ternário 
// let nota = 75
// let classificacao = nota >= 90 ? "A":
//                     nota >= 80 ? "B":
//                     nota >= 70 ? "C":
//                     nota >= 60 ? "D":
//                     "F"
// console.log(`Sua nota de ${nota} resulta na classificação: ${classificacao}`);

// let idade = parseInt(0)
// let mensagem = 
//     isNaN(idade)
//     ? "Poe favor, digite um número."
//     : idade >=0 && idade <=2
//     ? "Você é um bebê"
//     : idade > 2 && idade <= 12
//     ? "Você é uma criança"
//     : idade > 12 && idade <= 17
//     ? "Você é um adolescente"
//     : idade >= 18 && idade <= 59
//     ? "Você é um adulto"
//     : idade >= 60 && idade <= 130
//     ? "Você é um idoso"
//     : "Idade inválida"
// console.log(mensagem);

// Estrutura de seleção
// let dia = 2;

// switch (dia) {
//   case 1:
//     console.log("Domingo");
//     break;
//   case 2:
//     console.log("Segunda-feira");
//     break;
//   default:
//     console.log("Dia inexistente");
//     break;
// }


// Tipos dados, função typeof
let dado = true;
let tipoDado;
switch (typeof dado) {
  case  'string':
    tipoDado = "string"
    break;
  case  'number':
    tipoDado = "number"
    break;
  case  'boolean':
    tipoDado = "boolean"
    break;

  default:
    tipoDado = "Tipo de dado não identificado"
    break;
}
console.log(tipoDado);