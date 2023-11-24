// 1 Desenvolva um programa que receba um número e exiba a sequência de Fibonacci até esse número.

// let num = 8
// let n1 = 0
// let n2 = 1


// for (let i = 1; i <= num+1; i++) {
//   console.log(n1);
//   let nextnum = n1 + n2;
//   n1 = n2;
//   n2 = nextnum;
// }



// 2 Crie uma função que simule um jogo de adivinhação. O programa deve receber um número e gerar um outro número aleatório e tentar adivinha-lo.

// Solução professor
const readline = require('readline');

function jogoAdivinhacao(){
    const numeroAleatorio = Math.floor(Math.random() * 10) + 1;
    let tentativas=0;
    //CRIANDO A INTERFACE
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });
  
    const solicitarPalpite = () =>{
        rl.question('Digite um número entre 1 e 10: ', (input) =>{
            const palpite = parseInt(input);

            if(isNaN(palpite) || palpite < 1 || palpite > 100){
                console.log('Por favor, digite um número entre 1 e 10');
                solicitarPalpite();
            }else{
                tentativas++;
                if(palpite === numeroAleatorio){
                    console.log(`Parabéns! Você adivinhou o número ${palpite} em ${tentativas} tentativas.`);
                    rl.close();
                }else{
                    if(palpite < numeroAleatorio){
                        console.log('Tente um número maior.');
                    }else{
                        console.log('Tente um número menor.');
                    }
                    solicitarPalpite();
                }
            }
        });
    };
    solicitarPalpite();
}

// CHAMANDO A FUNÇÃO PARA COMEÇAR O JOGO DA ADIVINHAÇÃO
jogoAdivinhacao();



// let num = 10
// let x = Math.random();

// if (x != num ) {
//   console.log(`Tente novamente, o número gerado foi: ${x}`);
// } else {
//   console.log(`Parabés você acertou, o número gerado foi: ${x}`);
// }




// 3 Implemente um script que receba um número e desenhe um quadrado formado por "#", o qual deve ter o comprimento do lado de acordo com o número fornecido.

// let num = 10
// let side = "#".repeat(num);
// for (i = 1; i <= num; i++){
//   console.log(side);
// }

