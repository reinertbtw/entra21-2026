const cards =
    document.getElementById('cards');

let pessoas =
    JSON.parse(localStorage.getItem('pessoas')) || [];

function mostrarClientes() {

    cards.innerHTML = '';

    pessoas.forEach((pessoa, indice) => {

        cards.innerHTML += `
            <div class="card">

                <h2>${pessoa.nome}</h2>

                <p>
                    <strong>Email:</strong>
                    ${pessoa.email}
                </p>

                <p>
                    <strong>Telefone:</strong>
                    ${pessoa.telefone}
                </p>

                    <p>
                    <strong>CEP:</strong>
                    ${pessoa.cep}
                </p>

                <p>
                    <strong>Endereço:</strong>
                    ${pessoa.estado}
                </p>

                <p>
                    <strong>Número:</strong>
                    ${pessoa.cidade}
                </p>

                <p>
                    <strong>Bairro:</strong>
                    ${pessoa.rua}
                </p>

                <button class="editar"
                    onclick="editarCliente(${indice})">
                    Editar
                </button>

                <button class="excluir"
                    onclick="excluirCliente(${indice})">
                    Excluir
                </button>

            </div>
        `;
    });
}

function excluirCliente(indice) {

    pessoas.splice(indice, 1);

    localStorage.setItem(
        'pessoas',
        JSON.stringify(pessoas)
    );

    mostrarClientes();
}

function editarCliente(indice) {

    const card =
        document.querySelectorAll('.card')[indice];

    card.innerHTML = `
        <h2>Editar Cliente</h2>

        <input
            type="text"
            id="nomeEdit"
            value="${pessoas[indice].nome}"
        >

        <input
            type="email"
            id="emailEdit"
            value="${pessoas[indice].email}"
        >

        <input
            type="text"
            id="telefoneEdit"
            value="${pessoas[indice].telefone}"
        >

        <input
            type="text"
            id="cepEdit"
            value="${pessoas[indice].cep}"
        >

        <input
            type="text"
            id="estadoEdit"
            value="${pessoas[indice].estado}"
        >

        <input
            type="text"
            id="cidadeEdit"
            value="${pessoas[indice].cidade}"
        >

        <input
            type="text"
            id="ruaEdit"
            value="${pessoas[indice].rua}"
        >

        <button class="editar"
            onclick="salvarEdicao(${indice})">
            Salvar
        </button>

        <button class="cancelar"
            onclick="mostrarClientes()">
            Cancelar
        </button>
    `;
}

function salvarEdicao(indice) {

    const nome =
        document.getElementById('nomeEdit').value;

    const email =
        document.getElementById('emailEdit').value;

    const telefone =
        document.getElementById('telefoneEdit').value;

    const cep =
        document.getElementById('cepEdit').value;

    const estado =
        document.getElementById('estadoEdit').value;

    const cidade =
        document.getElementById('cidadeEdit').value;

    const rua =
        document.getElementById('ruaEdit').value;

    pessoas[indice] = {
        nome,
        email,
        telefone,
        cep,
        estado,
        cidade,
        rua
    };

    localStorage.setItem(
        'pessoas',
        JSON.stringify(pessoas)
    );

    mostrarClientes();
}

mostrarClientes();
