// 7. **Validação de Triângulo:**
//    - Crie um programa que verifica se três segmentos formam um triângulo e, se sim, determina seu tipo (equilátero, isósceles, escaleno).

const readline = require("readline-sync"); 
let l1 = parseFloat(readline.question("Informe a medida do lado 1 em cm : "));
let l2 = parseFloat(readline.question("Informe a medida do lado 2 em cm : "));
let l3 = parseFloat(readline.question("Informe a medida do lado 3 em cm : "));

let verificacao1 = l1 < l2+l3;
let verificacao2 = l2 < l1+l3;
let verificacao3 = l3 < l2+l1;
let verificacao4 = l1>0 && l2>0 && l3>0;

if (verificacao1 == true && verificacao2 == true && verificacao3 == true && verificacao4 == true) {
  let triangulo = l1 == l2 && l1 == l3 && l2 == l3 ? "equilátero":
                  l1 != l2 && l1 != l3 && l2 != l3 ? "escaleno":
                                     "isósceles"
  console.log(`O triangulo formado pelos lados de medida: ${l1}, ${l2} e ${l3} é do tipo ${triangulo}`);
} else {
  console.log("Não é possível formar triangulo com as medidas informadas.");
}

