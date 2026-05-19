const pessoas = JSON.parse(localStorage.getItem('pessoas')) || [];

const botao =
    document.getElementById('cadastrar');

const tabela =
    document.getElementById('tabela');

const botaoLimpar =
    document.getElementById('limpar');

const botaoMostrar =
    document.getElementById('mostrar');

function mostrarTabela() {
    tabela.innerHTML = '';

    pessoas.forEach(pessoa => {
        tabela.innerHTML += `
            <tr>
                <td>${pessoa.nome}</td>
                <td>${pessoa.email}</td>
                <td>${pessoa.telefone}</td>
            </tr>
        `;
    });
}

mostrarTabela();

botao.addEventListener('click', () => {

    const nome =
        document.getElementById('nome').value;

    const email =
        document.getElementById('email').value;

    const telefone =
        document.getElementById('telefone').value;

    const pessoa = {
        nome,
        email,
        telefone
    };

    pessoas.push(pessoa);

    localStorage.setItem(
        'pessoas',
        JSON.stringify(pessoas)
    );

    mostrarTabela();
});

botaoLimpar.addEventListener('click', () => {
    tabela.innerHTML = '';

    botaoMostrar.style.display = 'inline-block';
});

botaoMostrar.addEventListener('click', () => {
    mostrarTabela();

    botaoMostrar.style.display = 'none';
});
