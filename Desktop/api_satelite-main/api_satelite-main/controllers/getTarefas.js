const { getAllTasks } = require("../services/tarefas")

function getTarefas(req, res){
    const tarefas = getAllTasks()
   res.send(tarefas)
}



module.exports = {
    getTarefas
}