
const addtarefa = document.querySelector("#addtarefa");

addtarefa.addEventListener("submit", function(event) {
  event.preventDefault();
  console.log(event);
}
);

let titulo = document.getElementById("titulo");
let data = document.getElementById("data");
let hora = document.getElementById("hora");
let texto = document.getElementById("texto");

let lista = document.querySelector("#lista");
let situacao = document.querySelector("#situacao");
const btn2 = document.querySelector("#btn2");

const tarefas = [ 
  {titulo: titulo.innerText, data: data.innerText, hora: hora.innerText, texto: texto.innerText}
]

function rendertarefa () {
  lista.innerHTML = " "
  for (let tarefa of tarefas) {
    lista.innerHTML += `<li>${tarefa.titulo} ${tarefa.data} ${tarefa.hora}</li>
    <li> ${tarefa.texto}</li>`;
    console.log(situacao);
    console.log(btn2);
  }
}

rendertarefa ();


