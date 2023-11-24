// Funções são blocos de código que recebem entradas e retornam saídas

// function calcDelta() {
//   let a = 5;
//   let b = 3;
//   let c = 1;
//   let delta = b**2 - 4*a*c;
// console.log(delta);
// }
// calcDelta();

// Tipos de funções

// Função com parâmetro e sem retorno 
// function calcDelta(a, b, c) {
//   let delta = b**2 - 4*a*c;
// console.log(delta);
// }
// calcDelta(5,3,1)
// calcDelta(1,10,2)
// calcDelta(0,1,0)

// Função com parâmetro e cem retorno 
// function calcDelta(a, b, c) {
//   let delta = b**2 - 4*a*c;
//   return delta;
// }
// Formas de imprimir o calculo de retorno que é executado na função, através do return
// console.log(calcDelta(5,3,1));
// let result= calcDelta(1,10,2);
// Se apenas chamar a função como abaixo, não será impresso, somente calculado
// calcDelta(0,1,0)

// Função sem parâmetro e sem retorno 
// function calcDelta() {
//   let a = 5;
//   let b = 3;
//   let c = 1;
//   let delta = b**2 - 4*a*c;
// console.log(delta);
// }
// calcDelta();

// Expressão de Função
const soma = function(a,b) {
  return a+b;
}

// Arrow Function
const soma2 = (a,b) => {
  return a + b;
}

// Arrow function com retorno implicito
const soma3 = (a,b) => a+b;
// Exemplo
const calcDelta = (a,b,c) => b**2 - 4*a*c;