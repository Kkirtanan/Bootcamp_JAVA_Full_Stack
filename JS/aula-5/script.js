const numeroAleatorio = Math.floor(Math.random() * 10) + 1;
let tentativas = 0;

function verificarPalpite(){
    const x = document.getElementById("guessInput");
    const palpite = parseInt(x.value);
    const feedback = document.getElementById("feedback");

    if (isNaN(palpite) || palpite < 1 || palpite > 10) {
        feedback.textContent = 'Por favor, digite um número entre 1 e 10.';
    }else{
        tentativas++;
        if(palpite === numeroAleatorio){
            feedback.textContent = `Parabéns! Você adivinhou o número ${palpite} em ${tentativas} tentativas.`;
            x.disabled = true;
            document.getElementById('checkButton').disabled = true;
        }else{
            if(palpite <numeroAleatorio){
                feedback.textContent = 'Tente um número maior.';
            }else{
                feedback.textContent = 'Tente um número menor.';
            }
        }
    }
    x.value = '';
}
document.getElementById('checkButton').addEventListener('click', verificarPalpite);



// Adicionando evento para Tecla Enter
document.getElementById('guessInput').addEventListener('keydown', function(event){
  if(event.key === 'Enter'){
      verificarPalpite();
  }
});

// Calculo de delta
function calcularDelta() {
  const a = parseFloat(document.getElementById('aInput').value);
  const b = parseFloat(document.getElementById('bInput').value);
  const c = parseFloat(document.getElementById('cInput').value);

  const delta = b ** 2 - 4 * a * c;

  const deltaResult = document.getElementById('deltaResult');
  if (isNaN(delta)) {
    deltaResult.textContent = 'Por favor, insira valores válidos para a, b e c.';
  } else {
    deltaResult.textContent = `O delta é: ${delta}`;
  }
}

document.getElementById('calculateButton').addEventListener('click', calcularDelta);
