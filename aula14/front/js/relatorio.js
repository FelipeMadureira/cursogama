function validaLogin() {
    let userTxt = localStorage.getItem("userLogged");

    //verificar se o usuário está logado
    if((!userTxt)){
        window.location = "index.html";
    }

    let jsonUser = JSON.parse(userTxt); //transforma o text em um Json
    document.getElementById("user").innerHTML = `${jsonUser.nome} ( ${jsonUser.cpf} )`;
    document.getElementById("imgUser").innerHTML = `<img src="${jsonUser.linkFoto}">`;
}

function logout() {
    localStorage.removeItem("userLogged");
    window.location = "index.html";
}

function buscarPorStatus() {
    let statusSelect = document.getElementById("sel_status");
    let statusValue = statusSelect[statusSelect.selectedIndex].value; //obtem o valor status selecionado

    fetch("http://localhost:8080/pedidos/status/"+statusValue)
        .then(res => res.json())
        .then(result => preencheResposta(result));
}

function preencheResposta(resposta) {
    //console.log(resposta); //avaliar resposta antes de dar sequencia
    let tabelaPedidos = '<table class = "table table-sm"> <tr> <th> Solicitante </th> <th> Email </th> <th> Data </th> <th> Status </th> <th> Alterar </th></tr>';

    for(let index=0; index < resposta.length; index ++){
        tabelaPedidos = tabelaPedidos + `<tr> <td> ${resposta[index].solicitante.nome} </td>
                                              <td> ${resposta[index].solicitante.email}</td> 
                                              <td> ${resposta[index].data}</td> 
                                              <td> ${resposta[index].status}</td>
                                              <td> <buttom class="btn btn-sm btn-success" onclick="alterarStatus('A', ${resposta[index].numPedido})">AP</buttom>
                                                   <buttom class="btn btn-sm btn-warning" onclick="alterarStatus('P', ${resposta[index].numPedido})">PE</buttom> 
                                                   <buttom class="btn btn-sm btn-danger" onclick="alterarStatus('C', ${resposta[index].numPedido})">CA</buttom></td></tr>`;
    }

    tabelaPedidos = tabelaPedidos + '</table>';

    document.getElementById("tableResposta").innerHTML = tabelaPedidos;
}

function buscarPorData() {
    let data = document.getElementById("dataPedido").value;

    fetch("http://localhost:8080/pedidos/data?dataagendamento="+data)
        .then(res => res.json())
        .then(result => preencheResposta(result));
}

function alterarStatus(status, numPedido){
    let pedidoMsg = {
        numPedido:numPedido,
        status:status
    }

    let cabecalho = {
        method: 'PUT',
        body: JSON.stringify(pedidoMsg),
        headers:{
            'Content-type':'application/json'
        }
    }

    fetch('http://localhost:8080/pedidos/status',cabecalho)
    .then( res => res.json())
    .then(result => { if(result) buscarPorStatus()})
}