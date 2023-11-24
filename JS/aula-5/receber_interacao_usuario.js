const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
// Pergunta
rl.question('Digite algo: ', (input) =>{
    console.log(`Você digitou: ${input}`);
    rl.close();
});

