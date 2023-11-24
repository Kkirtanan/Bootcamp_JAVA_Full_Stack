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