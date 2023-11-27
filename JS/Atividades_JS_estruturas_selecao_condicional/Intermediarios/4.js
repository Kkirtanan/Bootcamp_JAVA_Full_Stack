// 4. **Idade e Categoria:**
//    - Crie um programa que determina a categoria de uma pessoa baseada na idade (criança, adolescente, adulto, idoso).

const readline = require("readline-sync"); 
let idade = Number(readline.question("Qual é a sua idade? : "));

let categoria = idade >= 0 && idade <= 2? "Você é um bebê":
                idade > 2 && idade <=12? "Você é uma criança":
                idade > 12 && idade <18? "Você é um adolescente":
                idade >= 18 && idade <=59? "Você é um adulto":
                idade >=60 && idade <= 120? "Você é um idoso":
                                          "Idade inválida"

console.log(categoria);





