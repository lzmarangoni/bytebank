const { default: axios } = require("axios")
const fs = require("fs")


function getAllTasks(){
   axios.get("https://api.clickup.com/api/v2/space/60987139/folder",{headers:{"Authorization":"pk_60976530_RQQUNMS67QZV31TXG2L5M6HTRTH4BK14"}})
  .then(res => {console.log(res.data) })
}
module.exports={ getAllTasks }