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

                <button onclick="excluirCliente(${indice})">
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

mostrarClientes();