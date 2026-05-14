const assentosTexto =
    document.getElementById("assentosSelecionados");

const assentos =
    document.querySelectorAll(".sala .assento:not(.ocupado)");

const quantidade =
    document.getElementById('quantidade');

const total =
    document.getElementById('total');

const preco = 20;

assentos.forEach(assento => {
    assento.addEventListener('click', () => {
        assento.classList.toggle('selecionado');
        atualizarResumo();
    });
});

function atualizarResumo() {
    const selecionados =
        document.querySelectorAll(".sala .assento.selecionado");

    const nomesAssentos = [];

    selecionados.forEach(assento => {

        nomesAssentos.push(
            assento.dataset.assento
        );

    });

    if (nomesAssentos.length > 0) {

        assentosTexto.innerText =
            nomesAssentos.join(", ");

    } else {

        assentosTexto.innerText =
            "Nenhum assento selecionado";

    }

    const quantidadeSelecionada =
        selecionados.length;

    quantidade.innerText =
        quantidadeSelecionada;

    total.innerText =
        quantidadeSelecionada * preco;

    document.querySelector(".info")
        .style.transform = "scale(1.05)";

    setTimeout(() => {

        document.querySelector(".info")
            .style.transform = "scale(1)";

    }, 150);
}
