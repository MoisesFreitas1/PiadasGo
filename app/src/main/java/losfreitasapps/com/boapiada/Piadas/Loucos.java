package losfreitasapps.com.boapiada.Piadas;

import java.util.ArrayList;
import java.util.List;

import losfreitasapps.com.boapiada.Modelo.Piadas;

/**
 * Created by Moises on 20/08/16.
 */
public class Loucos {
    private static List<Piadas> plouco = new ArrayList<>();

    public static List<Piadas> getPLouco() {
        if (plouco.isEmpty()) {
            Piadas piadas = new Piadas();
            piadas.setId(1L);
            piadas.setTitulo("Plano de fuga");
            piadas.setPiada("Outro plano de fuga. Só que desta vez era pra pular portão. Chegou a noite, mas quando chegou na hora H o doido disse: -Ih, não vai dar pra pular o portão. -Mas porque? -Esqueceram ele aberto.");
            plouco.add(piadas);

            piadas = new Piadas();
            piadas.setId(2L);
            piadas.setTitulo("A carta");
            piadas.setPiada("0 doido estava no hospício, escrevendo uma carta, quando o médico chegou, viu e pensou: Poxa, esse cara já deve estar bom tá até escrevendo carta!. Aí ele chegou pro doido e perguntou: -Pra quem é essa carta? -Ah é pra mim mesmo, doutor, eu nunca recebo cartas de ninguém -E o que está escrito nela? -Como eu vou saber, ainda não recebi!");
            plouco.add(piadas);

            piadas = new Piadas();
            piadas.setId(3L);
            piadas.setTitulo("A pescaria");
            piadas.setPiada("No hospício, o doido, sentado num banquinho, segurando uma vara de pescar mergulhada num balde de água 0 médico passa e pergunta: - O que você está pescando? - Otários, doutor. - Já pegou algum? - O senhor é o quinto.");
            plouco.add(piadas);

            piadas = new Piadas();
            piadas.setId(4L);
            piadas.setTitulo("A porta");
            piadas.setPiada("Na aula de pintura, o já tradicional doido pegou o pincel e pintou uma porta na parede. Depois, chegou pro médico e disse: Ei eh, olha só o que eu vou fazer... EI GALERA, VAMOS FUGIR, TEM UMA PORTA AQUI!!! Os doidos iam correndo, trombavam na parede e esborrachavam no chão, o médico pensou: Esse aí já deve estar bom, olha só o que ele fez. Aí o doido disse: -Doutor, olha como esses caras são burros, não sabem que a chave está comigo.");
            plouco.add(piadas);

            piadas = new Piadas();
            piadas.setId(5L);
            piadas.setTitulo("Hospício superlotado");
            piadas.setPiada("0 hospício tava superlotado. Então Os médicos resolveram fazer um exame pra ver quem já estava bom. Saíram gritando que o hospício estava inundando, todos os doidos começaram a nadar no chão, menos o famoso doido que estava sentado num banco, sorrindo. 0 médico pensou: Esse cara já deve estar bom, não tá nadando. E perguntou pro doido: -Por que você não tá nadando? Eu vou esperar a lancha que é mais rápido.");
            plouco.add(piadas);

            piadas = new Piadas();
            piadas.setId(6L);
            piadas.setTitulo("Hospício lotadaço");
            piadas.setPiada("0 hospício tava lotadaço, os médicos queriam se desfazer de alguns doidos. Então colocaram todos os malucos para pular em um trampolim em uma piscina. Só que estava totalmente vazia. Foi o primeiro, pulou e se esborrachou no chão, o segundo, o terceiro, e todos caiam direto no fundo da piscina. Aí o nosso conhecido amigo doido chegou, subiu no trampolim, olhou para baixo e voltou. O médico pensou Oba, esse aí eu posso liberar, ele não pulou. - Por que você não pulou? -Não conta pra ninguém não, mas é porque não sei nadar.");
            plouco.add(piadas);

            piadas = new Piadas();
            piadas.setId(7L);
            piadas.setTitulo("Alô, é do hospício?");
            piadas.setPiada("0 doido atendeu o telefone e ouviu: -Alô, é do hospício? -Não, aqui nem tem telefone.");
            plouco.add(piadas);

            piadas = new Piadas();
            piadas.setId(8L);
            piadas.setTitulo("Coitado do gato");
            piadas.setPiada("Um sádico, um masoquista, um assassino, um necrófilo, um zoófilo e um pirómano estão sentados num banco de jardim dentro de um sanatório, sem saber como ocupar o tempo. Diz o zoófilo: 'Vamos pegar um gato!' Diz o sádico: 'Vamos pegar um gato e torturá-lo!' Diz o assassino: 'Vamos pegar um gato, torturá-lo e matá-lo!' Diz o necrófilo:'Vamos pegar um gato, torturá-lo, matá-lo e violá-lo!' Diz o pirómano: 'Vamos pegar um gato, torturá-lo, matá-lo, violá-lo e atear-lhe fogo!' Diz o masoquista: 'Miau!'");
            plouco.add(piadas);

            piadas = new Piadas();
            piadas.setId(9L);
            piadas.setTitulo("A fuga");
            piadas.setPiada("0 mesmo doido planejava fugir do hospício com um parceiro. Chegou pra ele e disse: - Vamos fugir de noite pelo buraco da fechadura! De noite, os dois saíram de fininho, chegaram na porta, aí o doido disse: -Ih, pode desistir, não vai dar mais pra fugir. -Por que? -Esqueceram a chave na fechadura.");
            plouco.add(piadas);

            piadas = new Piadas();
            piadas.setId(10L);
            piadas.setTitulo("Escova de dente na coleira");
            piadas.setPiada("0 mesmo doido estava passeando com a escova de dente na coleira, até que o médico chegou: -Tá passeando com o cachorrinho na coleira? -Oh seu burro, não tá vendo que isso é uma escova de dente? o medico sai todo decepcionado, ai o doido chegou pra escova e disse baixinho: -Hehe, enganamos mais um, totó!!");
            plouco.add(piadas);
        }
        return plouco;
    }
}


