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

    alert('Cliente cadastrado!');

});
