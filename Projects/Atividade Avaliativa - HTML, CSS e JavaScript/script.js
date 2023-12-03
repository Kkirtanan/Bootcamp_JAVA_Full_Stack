
document.querySelector('#push').onclick = function(){
  if(document.querySelector('#newtask input').value.length == 0){
      alert("Informe a tarefa!")
  }
  else{
      document.querySelector('#tasks').innerHTML += `
          <div class="list">
              <span id="taskname">
                  ${document.querySelector('#newtask input').value}
              </span>
              <input type="checkbox" id="completed" name="completed" value="concluido">
              <label for="completed"> Concluído</label>
              <button class="delete" style='font-size:12px'>Apagar <i class='fas fa-trash-alt' style='font-size:12px'></i></button>
          </div>
      `;

      var current_tasks = document.querySelectorAll(".delete");
      for(var i=0; i<current_tasks.length; i++){
          current_tasks[i].onclick = function(){
              this.parentNode.remove();
          }
      }
  }
}