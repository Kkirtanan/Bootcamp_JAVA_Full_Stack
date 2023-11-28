
// estrutua de objetos: {}, objetos são representação abstrata do mundo real, no exemplo abaixo o objeto é aluno e nome, ida,de, etc são as propriedades.
// const aluno = {
//   nome: "Gabriel",
//   idade: 23,
//   matricula:"202023"
//   // objeto dentro do objeto
//   endereço: {
//     logradouro: "Rua Ali Porto",
//     numero: 500,
//     cidade: "Tinaguá -CE"
//   }
// }

// console.log(aluno.nome);
// console.log(aluno.endereço.cidade);



// lista sem coloca no plural no nome da variavel, abaixo exemplo de lista de objetos

const corpo = document.querySelector("#corpo");

const alunos = [
  {nome: "kely",idade: 30},
  {nome: "Lucas", idade: 40},
  {nome: "Fagner", idade: 27},
];

// innerHTML utiliza para alterar o HTML através do javascript
// Colocar uma lista, iterando as variaveis 


// corpo.innerHTML = "<ul>";
// for (let aluno of alunos){
//   // colocar aqui o item que se repete 
//   corpo.innerHTML += `<li>${aluno.nome} ${aluno.idade}</li>`;
// }
// corpo.innerHTML += "</ul>";

// Adicionar um novo objeto a lista 
// alunos.push({nome: "João",idade: 25});

// para poder adicionar mais objetos na lista fica melhor colocar todo o código em uma função

function renderlista () {
  corpo.innerHTML = " ";
  for (let aluno of alunos){
  // colocar aqui o item que se repete 
  corpo.innerHTML += `<li>${aluno.nome} ${aluno.idade}</li>`;
}
}

// primeiro inserir o novo objeto e depois chaamr a função
alunos.push({nome: "João",idade: 25});
renderlista ();


// Crirar Eventos para todos os paragragos

const paragrafos = document.querySelectorAll("p");
// isso gera uma lista COM TODOS OS PARAGRAFOS DO HTML

for (let p of paragrafos) {
  // criar evento de passar o mouse por cima de cada paragrafo, qdo passar o mouse, faz alguma coisa, se chama ouvidor de evento, função que executa um determinado evento e é um objeto associado ao evento, essa função tem um parametro event que é um objeto
  p.addEventListener("mouseover", function (event) {
    console.log(event);
    // para saber o texto do paragrafo que está colocando o mouse por cima, target identifica aonde está o elemnto no html
    let texto = event.target.innerText;
    let titulo = document.querySelector("#msg"); // chamou o h2 do HTML
    titulo.innerText = "texto"

  });
}




