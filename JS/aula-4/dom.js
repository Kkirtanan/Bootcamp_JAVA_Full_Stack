console.log("Boa Tarde");

// DOM: document object model
// document é o arquivo HTML, representado em modelo de objeto, é raiz do DOM, só o navegador reconhece o document

// Funções de seleção (consulta)
let h1 = document.querySelector("h1");
// uma variavel do objeto h1 para manipular este objeto no html através do JS
h1.innerText = "Olá Kely";
// manipular estilo com JS 
h1.style.color = "red";
h1.style.fontFamily = "Arial";
h1.style.backgroundColor = "yellow";
h1.style.padding = "20px 30 px";
// h1.id = "titulo"

// // Consulta de todos os seletores
// document.querySelectorAll("group")
// // Faz consulta por nome de id 
// document.getElementById("titulo")



// // Criar um evento ao elemento botão
// // chamar o elemtto do HTML
// let btn = document.querySelector("clique")

// // Criar função com estilos
// function changestyle() {
//   let h1 = document.querySelector("h1");
//   h1.innerText = "Olá Kely";
//   h1.style.color = "red";
//   h1.style.fontFamily = "Arial";
//   h1.style.backgroundColor = "yellow";
//   h1.style.padding = "20px 30 px";
// }

// // Criar o evento "click"
// btn.addEventListener("click",changestyle)

let imagens = [
  "https://petitgato.com.br/img/webp/gatos-persas-em-sao-paulo-img-3780.webp",
  "https://defensoresdosanimais.files.wordpress.com/2011/06/cc3a3o-filhote.jpg",
  "https://www.petz.com.br/blog//wp-content/uploads/2022/02/passarinho-que-canta-topo.jpg",
];

// Criar evento clicar no botaõ e aparecer a imagem

// chamar elementos 
let image = document.querySelector("#image");
let btn1 = document.querySelector("#btn1");
let btn2 = document.querySelector("#btn2");
let btn3 = document.querySelector("#btn3");

  // Criar a função
// função anOnima, sem nome
// function() {}

// Criar o evento e colocar a função anonima dentro da função do evento

btn1.addEventListener("click", function() {
  image.src = imagens[0]
});

btn2.addEventListener("click", function() {
  image.src = imagens[1]
});

btn3.addEventListener("click", function() {
  image.src = imagens[2]
});

