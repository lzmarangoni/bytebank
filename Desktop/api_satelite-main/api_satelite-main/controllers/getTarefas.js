const { getAllTasks } = require("../services/tarefas")

function getTarefas(req, res){
    const tarefas = getAllTasks()
   res.send(tarefas)
}

/*function getTarefa(req, res){
    const tarefa = req.params.id
    const tarefas = getTarefaPorID(tarefa)
   res.send(tarefas)
}*/

module.exports = {
    getTarefas
}