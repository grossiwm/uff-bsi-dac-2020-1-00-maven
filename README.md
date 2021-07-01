# READ ME

## Funcionalidade: Envio de mensagem customizada
EU como usuário QUERO enviar um cumprimento customizado PARA ser saudado de forma diferente dos cumprimentos já existentes no sistema.

### Cenário: cumprimento customizado preenchido e form enviado com sucesso
DADO que o usuário acessa página de enviar cumprimento\
QUANDO o usuário preencher e cumprimento customizado\
E preencher demais campos\
E enviar formulário\
ENTÃO uma saudação com o cumprimento customizado será gerada.

### Cenário: cumprimento customizado não preenchido e form enviado com sucesso
DADO que o usuário acessa página de enviar cumprimento\
QUANDO o usuário preencher todos os campos menos o de cumprimento customizado\
E enviar formulário\
ENTÃO uma saudação com o cumprimento de acordo com a língua escolhida será gerada.
