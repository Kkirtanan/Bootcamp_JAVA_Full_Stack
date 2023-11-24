// For 
// iteração é uma repetição, FOR com quantidade definida de repetições, enquanto a condição for TRUE
// for (let i = 0; i<10; i++) {
//   console.log("Oi");
// }

// for (let i = 10; i > 0; i--) {
//   console.log("Hi");
// }

// Loop infinito
// for (; ; ) {
//   console.log("Hello");
// }

// Verificar se um número é primo 
// let num = 50000;
// let primo = true;
// for (let i = 2; i<num; i++ ) {
//   console.log(i);
//   if( num%i == 0 ) {
//     primo = false;
//     break;
    // continue pula o loop atual, otimizar para que as repetições não aconteçam a toa
//   }
// }

// console.log(`O número ${num} é primo?: ${primo}`);

// Pirâmide de * com for aninhado


// for (let i = 1; i <= 20 ; i++) { // repte 10x
//   let row = "";
//   for ( let j = 0; j < i; j++) { // repete i vezes
//     row += "*";
//   }
//   console.log(row);
// }

// While, repetição enquanto uma condição não for satisfeita, mas não é possível definir por quantas vezes vai acontecer a repetição

// let count = 10
// while ( count < 1000 && count != 60 ) { 
//   console.log(count);
//   count+=2
// }









// Loop infinito
// let i = 3;
// while (true) {
//   if (i > 23) {
//     break
//   }
//   console.log(`while true ${i}`);
//   i++;
// }

// Do (executa ao menos uma vez, pois faz a verificação depois de executar)
  //  while (verifica primeiro e depois executa)

// do{ 
//   console.log(); // executado ao menos uma vez, mesmo que o while seja false
//  } while (false ); // não vai executar

// Exemplo

// let y = 0;
// do {
//   console.log(y);
//   y++
// } while (y < 5);

// Lista, vetores ou arrays

// let lista = ["Gabriel", "Kely", "Felipe", "Adriano","João"];
// console.log(lista[0],lista[1]); // imprimir item por item

// Estrutura de repetição para imprimir todos os items da lista
// lista.length devolve o tamanho da lista
// for (let i = 0; i < lista.length; i++) {
//   console.log(lista[i]);
// }

// Estrutura for each para melhorar a escrita, só funciona se a variavel LISTA for mesmo um vetor e usar essa syntaxe ( x of VARIAVEL VETOR)
// for ( let item of lista) {
//   console.log(item);
// }

// Exemplo 2

let numeros = [1,2,3,4,5,6];
// for(let n of numeros) {
//   console.log(n**2);
// }

let total = numeros.length
soma = 0
for (i = 0; i < total; i++) {
  soma += numeros[i]
}
let media = soma/total;
console.log(`Média da lista:  ${media}`);