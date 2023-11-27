// 8. **Verificador de Ano Bissexto:**
//    - Implemente um programa que verifica se um ano é bissexto ou não.

while (true) {
  const readline = require("readline-sync"); 
  let ano = Number(readline.question("Informe o ano que deseja verificar: "));
  if (ano % 4 == 0 && ano > 0 || ano % 400 == 0 && ano % 100 != 0 && ano > 0) {
  console.log(`${ano} é bissexto!`);
} else {
  console.log(`${ano} não é bissexto, tente outro ano.`);
}
}

