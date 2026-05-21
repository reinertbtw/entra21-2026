const pessoas =
    JSON.parse(localStorage.getItem('pessoas')) || [];

const botao =
    document.getElementById('cadastrar');

botao.addEventListener('click', () => {

    const nome =
        document.getElementById('nome').value;

    const email =
        document.getElementById('email').value;

    const telefone =
        document.getElementById('telefone').value;

    const cep =
        document.getElementById('cep').value;

    const estado =
        document.getElementById('estado').value;

    const cidade =
        document.getElementById('cidade').value;

    const rua =
        document.getElementById('rua').value;

    const pessoa = {
        nome,
        email,
        telefone,
        cep,
        estado,
        cidade,
        rua
    };

    pessoas.push(pessoa);

    localStorage.setItem(
        'pessoas',
        JSON.stringify(pessoas)
    );

    alert('Cliente cadastrado!');

});

function buscarLogradouro() {

    const cep =
        document.getElementById('cep');

    fetch(`https://viacep.com.br/ws/${cep.value}/json/`)
        .then(dados => dados.json())
        .then(resposta => {

            document.getElementById('rua').value =
                resposta.logradouro;

            document.getElementById('estado').value =
                resposta.uf;

            document.getElementById('cidade').value =
                resposta.localidade;
        });
}
