package losfreitasapps.com.boapiada.Piadas;

import java.util.ArrayList;
import java.util.List;

import losfreitasapps.com.boapiada.Modelo.Piadas;

/**
 * Created by Moises on 18/08/16.
 */
public class Estagiario {
    private static List<Piadas> pestagiario = new ArrayList<>();

    public static List<Piadas> getPEstagiario() {
        if (pestagiario.isEmpty()) {
            Piadas piadas = new Piadas();
            piadas.setId(1L);
            piadas.setTitulo("Telegrama urgente");
            piadas.setPiada("Um belo dia, um estagiário de Informática recebeu um telegrama urgente de seu gerente, no qual somente estava escrito: P.O.R.R.A.! No dia seguinte, o pobre capacho apressou-se em responder por telegrama: F.O.D.A. - S.E.! Retornando ao escritório central, foi imediatamente chamado pelo gerente, que disse-lhe: - Você não tinha o direito de me responder daquele jeito! Não sabes que estamos em contenção de despesas? O meu telegrama era simplificado e o significado de P.O.R.R.A. É: 'Por Obséquio Remeter o Relatório Atrasado' O estagiário argumentou: - Sei de tudo isso e foi exatamente dentro desse espírito que lhe respondi F.O.D.A. - S.E.! que significa: 'Foi Ontem Despachado; Amanhã Será Entregue.'");
            pestagiario.add(piadas);

            piadas = new Piadas();
            piadas.setId(2L);
            piadas.setTitulo("Estágio de Direito");
            piadas.setPiada("4 estudantes de Direito disputavam uma vaga de estagiário: A proposta é responder a uma única pergunta, que dependendo da resposta pode desclassificar o candidato. As entrevistas: Diretor: Qual é a coisa mais rápida do mundo? Candidato da USP : Ora, é um pensamento. Diretor: Porquê? Candidato da USP : Porque um pensamento ocorre quase instantaneamente. Diretor: Muito bem, excelente resposta... Diretor: Qual é a coisa mais rápida do mundo? Candidato da PUC: Um piscar de olhos. Diretor: Por quê? Candidato da PUC: Porque é tão rápido que às vezes nem vemos. Diretor: Ótimo. Diretor: Qual é a coisa mais rápida do mundo? Candidato da FMU: A eletricidade. Diretor: Por quê? Candidato da FMU: Veja, ao ligarmos um interruptor, acendemos uma lâmpada a 5 km de distância instantaneamente. Diretor: Excelente. Diretor: Qual é a coisa mais rápida do mundo? Candidato da UNIP: Uma diarréia... Diretor: Como assim? Está brincando? Explique isso... Candidato da UNIP: Isso mesmo. Ontem à noite eu tive uma diarréia tão forte, que antes que eu pudesse pensar, piscar os olhos ou acender a luz, já tinha me cagado todo... Diretor: O emprego é seu...");
            pestagiario.add(piadas);

            piadas = new Piadas();
            piadas.setId(3L);
            piadas.setTitulo("Teste de admissão");
            piadas.setPiada("Um psicólogo fazia testes para admissão de novos candidatos em uma empresa e seleção: - O senhor pode contar até dez, por favor? - Dez, nove, oito, sete, seis, cinco, quatro, três, dois, um. - Por que você contou de trás pra frente? - É que eu trabalhava na Nasa. - Sinto muito, está reprovado. Entra o próximo: - O senhor pode contar até dez, por favor? - Um, três, cinco, sete, nove, dois, quatro, seis, oito, dez. - Por que você contou primeiro os ímpares e depois os pares? - Porque eu trabalhava como carteiro. - Sinto muito, está reprovado. Entra o próximo: - O senhor pode contar até dez, por favor? -1,2,3,4,5,6,7,8 e 1,2,3,4,5,6,7,8 -Por que o sr só contou até oito -Por que eu era dançarino -Sinto muito, está reprovado Entra o próximo: - Antes de começarmos, por favor me diga uma coisa, o que o senhor fazia em seu emprego anterior? - Eu era estagiário. Fazia faculdade. - OK.Excelente. O senhor pode contar até dez? - É claro. Ás, dois, três, quatro, cinco, seis, sete, dama, valete e rei. Truuuuco, ladrão!");
            pestagiario.add(piadas);

            piadas = new Piadas();
            piadas.setId(4L);
            piadas.setTitulo("Sem nada pra fazer");
            piadas.setPiada("O presidente de uma Grande empresa, sentado em sua enorme sala sem absolutamente nada para fazer, começa a pensar sobre o que é trabalho e o que é lazer em seu dia. Após uma enorme lista de diversões, ele chegou na hora em que transa com sua esposa, com a qual já está casado há 15 anos. Sem conseguir concluir ao certo se transar com sua esposa é trabalho ou prazer, ele chama o vice-presidente em sua sala. Um pouco menos desocupado, o vice para de ler as reportagens sobre a empresa que haviam sido publicadas no jornal e vai até a sala do Presidente que lhe pergunta: * Transar com minha esposa é trabalho ou prazer? O vice pensa alguns segundos e incerto da resposta pede duas horas para responder. Volta para sua sala, chama o diretor geral da empresa e faz a mesma pergunta: * Quando o presidente dorme com a mulher dele, é trabalho ou prazer? O vice dá ao diretor geral o prazo de uma hora para responder. Imediatamente o diretor geral, mesmo sem nada para fazer, delega a função ao diretor jurídico que passa a pergunta para o advogado sênior e assim vai até chegar ao advogado júnior. Assim como o resto da empresa, o advogado júnior fica na dúvida e vai até a mesa de seu estagiário: * Você tem cinco minutos para descobrir se quando o presidente transa com a mulher dele é trabalho ou prazer. O estagiário, então, sem parar de digitar com a mão direita e separar uma pilha de documentos com a mão esquerda, olha para o advogado júnior por cima das milhares de pastas que estão em sua mesa e responde: * é prazer. Espantado com a rapidez e confiança da resposta do estagiário, o advogado júnior pergunta: * Mas como você tem tanta segurança em sua resposta ? Ainda sem parar de trabalhar, o estagiário responde: * Por que se fosse trabalho era eu quem ia fazer!!!!");
            pestagiario.add(piadas);
        }
        return pestagiario;
    }
}


