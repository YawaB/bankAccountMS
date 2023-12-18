# BankAccount MicroService
# MAWUVIWO Yawa Brinda
Cette repository Git abrite un projet Spring Boot avec les dépendances Web, Spring Data JPA, H2, Lombok,
fournissant un microservice de gestion de comptes bancaires avec API RESTful, documentation Swagger,
exposant également une API RESTful via Spring Data Rest, et intégrant une couche Service ainsi qu'un microservice GraphQL.
<h5>RestController du webservice</h5>
<img src="./captures/bankAccountsController.png">
<p>Consultation de tous les comptes</p>
<img src="./captures/getAccount.png" alt="getComptes screen">
<p>Consultation d'un compte à partir de son id</p>
<h5>Ajout de la documentation OpenAPI</h5>
<img src="./captures/swagger.png" alt="swaggerInterface of the BankAccount service">
<p>Documentation du RestAPI | Interface du webservice</p>
<img src="./captures/testGetAccount.png" alt="Get account swagger">
<p>Test de getAccount à partir de Swagger</p>
<h1>Test du web micro-service en utilisant un client REST,Postman</h1>
<h6>Methode Post pour ajouter un nouveau compte</h6>
<img src="./captures/testPostmanSave.png" alt="Save new account">
<p>Ajout réussi</p>
<img src="./captures/accountAdded.png" alt="New account saved">
<p>Vérification de l'ajout du nouveau compte</p>
<h1>Exposition de l'API Restful en utilisant Spring Data Rest en exploitant des projections</h1>
<p>Après l'ajout de la dependance Spring-data-Rest, il faut annoter l'interface Repository avec @RepositoryRestResource.<br>Nous rechargons l'API Rest</p>
<img src="./captures/springDataRest.png" alt="Visualisation des données avec spring data Rest">
<p>Le Spring data rest utilise maintenant le path <b>/accounts</b></p>
<img src="./captures/projection.png" alt="Visualisation projétée des données avec spring data Rest à travers une nouvelle fonction findByCurrency">
<p>Test de la methode findByCurrency ajoutée dans l'interface de Spring Data Rest</p>
<h3>Les projections avec Spring Data Rest</h3>
<img src="./captures/projectionP1.png" alt="Visualisation projétée des données avec spring data Rest à travers une nouvelle fonction findByCurrency">
<h2>Utilisation des Mappers</h2>
<img src="./captures/postMapper.png" alt="Utilisation des Mappers:AccountMapper pour convertir les request en responses">



