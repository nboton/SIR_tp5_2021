# TP SIR JPA 2020-2021 

Avant de démarrer le projet,

 -créer une base de données vide nommée: db_kanban
 
 -Les paramètres par défaut sont déjà définis au niveau du fichier persistence.xml
 comme suit:
   <persistence-unit name="dev" transaction-type="RESOURCE_LOCAL">
        <!-- <class>org.hibernate.ejb.test.Cat</class> -->
        <!--  <class>org.hibernate.ejb.test.Distributor</class> -->
        <!--  <class>org.hibernate.ejb.test.Item</class> -->
        <properties>
            <property name="hibernate.show_sql" value="true"/>

            <property name="hibernate.dialect" value="org.hibernate.dialect.MariaDBDialect"/>
            <property name="hibernate.hbm2ddl.auto" value="update"/>
            <property name="hibernate.connection.driver_class" value="com.mysql.jdbc.Driver"/>
            <property name="hibernate.connection.username" value="root"/>
            <property name="hibernate.connection.password" value=""/>
            <property name="hibernate.connection.url" value="jdbc:mysql://localhost/db_kanban"/>
        </properties>
    </persistence-unit>
    
Pour démarrer le projet,
 -Lancer la classe "RestServer".Cette classe contient la méthode main et permet de démarrer le serveur.
 -Elle contient un ensemble d'instance qui  permettent de peupler automatiquement  la base de données une fois lancée.
 -Vous pouvez ensuite consulter votre base de données pour voir les enregistrement
 
Dans POSTMAN, vous pouvez utiliser les url définies ci-dessous pour afficher, enregistrer, et supprimer des données dans la base.

- Requêtes GET :
   Le lien suivant permet d'afficher l’ensemble des utilisateur disponibles :
   http://localhost:8080/api/utilisateur/

   Le lien suivant permet d'afficher une fiche par son identifiant :
   http://localhost:8080/api/utilisateur/{{codeUser}}

   Le lien suivant permet d'afficher l’ensemble des fiches disponibles  :
   http://localhost:8080/api/fiche/

   Le lien suivant permet d'afficher une fiche par son identifiant :
    http://localhost/api/fiche/{{idfich}}

   Le lien suivant permet de récupérer l’ensemble des sections disponibles :
   http://localhost:8080/api/section/

   Le lien suivant permet de récupérer une section par son identifiant :
   http://localhost/api/section/{{sectId}}

   Le lien suivant permet d'afficher l’ensemble des tableaux disponible : http://localhost/api/tableau/

   Le lien suivant permet d'afficher un tableau par son identifiant :
   http://localhost/api/tableau/{{idTab}}



----------------------------------------------
- Requêtes  POST :

   Le lien suivant permet d’ajouter un utilisateur :
   http://localhost/api/utilisateur/add

   Le lien suivant permet d’ajouter un tableau :
   http://localhost/api/tableau/add

   Le lien suivant permet d’ajouter une fiche :
   http://localhost/api/fiche/add

   Le lien suivant permet d’ajouter une section:
   http://localhost/api/section/add

----------------------------------------------

- Requêtes DELET :
   Le lien suivant permet de supprimer un utilisateur par son identifiant
   http://localhost/api/utilisateur/delete/{{userId}}

   Le lien suivant permet de supprimer un tableau par son identifiant :
   http://localhost/api/tableau/delete/{{idTab}}

   Le lien suivant permet de supprimer une fiche par son identifiant :
   http://localhost/api/fiche/delete/{{userId}}

   Le lien suivant permet de supprimer une section par son identifiant :
   http://localhost/api/section/delete/{{sectId}}


lien vers TP JPA: https://github.com/nboton/SIR_tp_jpa2021
----------------------------------------------

# Authors:
- Olive BOTON
- Anwar MACHADI
