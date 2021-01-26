## Projeto Spring Boot 2.4.x contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo cinco operações básicas:

+	Busca paginada de recursos
+	Busca de recurso por id
+	Inserir novo recurso
+	Atualizar recurso
+	Deletar recurso

O projeto está configurado para um ambiente de testes acessando o banco de dados H2, utilizando Maven como gerenciador de dependência, e Java 11 como linguagem.

#  especificação da entidade Client é mostrada a seguir:

![Image](https://github.com/marciorbarcellos/dsclient-bootcamp-devsuperior/blob/master/backend/img/entidadeClient.jpg)

# Seed com dados fictícios de clientes

```
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Maria Silva de Souza', '063.642.554-63', 7500.00, '2018-07-01T14:18:05.361Z', 2, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Leonardo Silva', '012.617.852-35', 8200.00, '2014-01-15T23:28:56.782Z', 1, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Martin Danton', '001.246.567-77', 8650.00, '2020-05-21T18:02:26.317Z', 3, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Flavia Albuquerque', '572.755.868-42', 5160.00, '2017-02-05T19:03:01.355Z', 0, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Rodolfo Arquedes', '557.684.468-15', 4780.00, '2012-06-05T08:20:12.735Z', 2, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Lucia Kleber Poland', '358.794.644-27', 5250.00, '2008-03-12T12:25:06.426Z', 1, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Aloysio Figueiredo', '077.834.546-64', 6850.00, '2015-08-05T12:28:45.787Z', 2, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Victor Danton', '468.135.172-86', 4750.00, '2019-04-17T21:14:35.545Z', 2, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Andrea Lia Skauys', '835.257.382-43', 7200.00, '2020-05-21T18:02:26.317Z', 3, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Luciana Wergueiro', '468.146.683-28', 6300.00, '2021-01-01T19:21:07.577Z', 0, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Odilon Holanda', '461.735.846-83', 7800.00, '2014-03-01T14:08:00.286Z', 2, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Kleber Emerson', '712.030.490-21', 8500.00, '2019-07-01T16:25:01.707Z', 1, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Luiza Afranio', '628.480.835-98', 6000.00, '2020-08-07T18:02:00.207Z', 0, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Kenia Lians', '018.020.357-80', 5500.00, '2017-01-02T12:21:05.630Z', 3, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Jairo Monteiro', '777.019.001-18', 7500.00, '2018-07-01T12:01:14.030Z', 2, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Lea Erkant', '398.470.308-01', 6800.00, '2015-08-12T14:07:01.067Z', 1, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Vanessa Klaus', '052.382.846-15', 6800.00, '2017-05-06T16:12:26.082Z', 0, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Simone Venâncio Freitas', '481.657.840-05', 8250.00, '2012-02-15T17:31:18.014Z', 1, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Uberlan Silva Zimmerman', '317.863.096-94', 7500.00, '2018-07-01T12:01:14.030Z', 2, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Helena Tavares Wolner', '168.944.802-77', 6000.00, '2016-03-01T08:17:26.207Z', 2, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Fernanda Rodrigues', '530.247.868-28', 5000.00, '2015-07-05T12:12:06.264Z', 1, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Mayra Alvarez de Souza', '843.805.294-20', 4600.00, '2012-01-05T09:12:40.865Z', 1, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Alvaro Americano', '675.370.562-68', 8800.00, '2018-02-03T08:25:12.632Z', 2, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Silvia Brito Borges', '635.030.502-67', 5200.00, '2011-02-06T12:21:08.835Z', 0, NOW());
INSERT INTO TB_CLIENT (ID, NAME, CPF, INCOME, BIRTH_DATE, CHILDREN, created_At) VALUES (null, 'Paulo Cesar Milbert', '312.589.261-05', 4700.00, '2014-01-03T08:12:05.052Z', 1, NOW());
```

# Testes manuais no Postman

+ Busca paginada de clientes
	+ GET /clients?page=0&linesPerPage=6&direction=ASC&orderBy=name

+ Busca de cliente por id
	+ GET /clients/1

+ Inserção de novo cliente
	+ POST /clients
		{
		  "name": "Maria Silva",
		  "cpf": "12345678901",
		  "income": 6500.0,
		  "birthDate": "1994-07-20T10:30:00Z",
		  "children": 2
		}

+ Atualização de cliente
	+ PUT /clients/1
		{
		  "name": "Maria Silvaaa",
		  "cpf": "12345678901",
		  "income": 6500.0,
		  "birthDate": "1994-07-20T10:30:00Z",
		  "children": 2
		}

+ Deleção de cliente
	+ DELETE /clients/1



