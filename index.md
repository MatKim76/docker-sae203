## Notre équipe pour cette SAE

| Prénom       | Nom               | Groupe |
|:-------------|:------------------|:-------|
| Trystan      | Baillobay         | B1     |
| Maxime       | Lemoine           | B2     |
| Matéo        | Sa                | B2     |

* * *

## Nos pages respectives :

[Trystan](https://github.com/ydroo)

[Matéo](https://github.com/MatKim76)

[Maxime](https://github.com/Maximeuuu)

* * *

## Compte rendu de notre SAE

Dans un premier temps, nous avons effectué le TP d'initiation git chacun de notre côté (ou ensemble pour les TP3 et 4) avant les premières séances dédiées 
à cette SAE. Dans ces TP d'initiation nous avons appris à utiliser git et GitHub. Nous avons appris toutes sortes de travailler depuis le dépot git de par
nos machines respectives.

GitHub nous permettrait alors de pouvoir travailler sur le même répertoire, sur les mêmes fichiers et y faire des modifications. Il faut aussi faire 
attention à ne pas faire de modification en même temps sous peine de causer des conflits, ce qui empêche toute intéraction avec GitHub avant que le conflit 
ne soit corrigé par un ``git add <fichier>`` ou ``git restore <fichier>`` depuis les machines utilisateurs. Sans fichier ``index.md``, le gh-pages se 
basera sur un autre fichier au format MARKDOWN, un README par exemple.

Nous avons ensuite, par le biais du TP5 de l'initiation GIT, les gh pages. Nous pouvons à partir d'un répertoire **public** créer une page internet. A 
partir d'un ``index.md`` ainsi qu'un ``config.yml`` (pour importer des styles, une sorte de css), GitHub nous génrère un site internet comme celui-ci.
Le ``index.md`` est notre base où nous renseignerons tout ce que devra contenir le site (titres, texte, tableaux, ...) à la manière d'un fichier html sauf 
que l'on peut ici oublier les balises.


Par la suite, nous avons effectué le TP d'initiation à dockerfile dans chacune de nos machine personnelles, ce qui 
nous a permis de nous familiariser avec ce type de fichier. 

* * *

## Explication de Dockerfile, son utilité dans notre projet

Docker présente de multiples avantages, en permettant de développer des applications faciles à assembler, à maintenir et à déplacer. Les conteneurs 
permettent l’isolation des applications entre elles et du système sous-jacent.

Ils permettent aussi la portabilité, puisque les applications n’ont pas à être liées au système d’exploitation hôte. Les applications conteneurisées 
peuvent par exemple être aisément transférées de systèmes sur site vers les environnements Cloud.

L’outil Docker est à la fois bénéfique pour les développeurs et pour les administrateurs système. On le retrouve souvent au coeur des processus DevOps.

Les développeurs peuvent se focaliser sur leur code, sans avoir à se soucier du système sur lequel il sera exécuté. En outre, ils peuvent gagner du temps 
en incorporant des programmes pré-conçus pour leurs applications.

* * *

## Le programme, la suite de commandes, à exécuter par notre Dockerfile

Par la suite nous nous sommes mis d'accord pour trouver un programme à exécuter avec ce fichier, nous avons choisi de faire un
jeu Puissance 4 en java. Ce jeu pourra être jouable en simultané sur 2 machines. Un des deux joueurs pourra créer une salle
(il jouera alors le rôle de serveur). 

Ce joueur transmettra son ip (depuis le pare-feu pour un ordinateur windows ou alors le 
nom sous l'écran de la machine pour un PC de l'IUT) ainsi que le port sur lequel ils joueront à l'autre joueur, le client.
Le client devra alors rentrer le même port et l'ip du serveur. De plus, chacun des joueurs pourra choisir un pseudo qui pourra 
être affiché sur la fenêtre de jeu.

* * *

## Consignes d'installations

Pour utiliser notre projet :

* * *

### Requis

1. installer [docker](https://www.docker.com/) sur la machine utilisateur.
2. Installer un serveur X11 pour windows (exemple : Xming).

### Installation

Sur la machine utilisateur
1. Exécuter l'application Docker depuis le systeme d'exploitation actuel.
2. Télécharger depuis le github l'[image Docker](https://github.com/MatKim76/docker-sae203/blob/8f5a2292059c602d4a4715eaf883eccddfebda84/Dockerfile) ``Dockerfile``.

Dans un terminal
1. Vérifier que docker est installé : ``docker --version``.
2. Se déplacer dans le répertoire où se situe l'image ``Dockerfile`` : ``cd <repertoire>``.
3. Construire l'image : ``docker build -t img-puissance4``.
4. Fermer le terminal.

* * *

## Instruction pour lancer le Puissance4

### Dans un premier terminal
1. Lancer le serveur : ``docker run -it --rm -e DISPLAY=host.docker.internal:0 -v /tmp/.X11-unix:/tmp/.X11-unix img-puissance4``.
2. Vérifier si le conteneur existe : ``docker ps``.
*info : 1 ligne devrait s'afficher*.
3. Une fenêtre s'ouvre, on complète les entrées.
4. Appuyer sur le bouton "Créer salle".

### Dans un second terminal
1. Lancer le serveur : ``docker run -it --rm -e DISPLAY=host.docker.internal:0 -v /tmp/.X11-unix:/tmp/.X11-unix img-puissance4``.
2. Vérifier si le conteneur existe : ``docker ps``.
*info : 2 lignes devraient s'afficher*
3. Une fenêtre s'ouvre, on complète les entrées.
*info : dans ip mettre : ``172.17.0.2``*
4. Appuyer sur le bouton "rejoindre salle".
 
**Vous pouvez jouer via les deux terminals !**

* * *

## Utilisation

- Flèche de gauche : Naviguer à la colonne de gauche du plateau
- Flèche de droite : Naviguer à la colonne de droite du plateau
- Flèche du bas    : Poser une pièce dans la colonne selectionnée

* * *

## Conclusion

Cette SAE nous a permis de nous familiariser avec git, cette plateforme de dépot pourrait nous avérer être utile dans notre 
futur, que ce soit dans notre parcours à l'IUT ou bien dans notre vie professionnelle.

GitHub regroupe de nombreux projets et se montrer très pratique puisque l'accès y est rapide ainsi de par son abilité à 
insérer tout type de fichier de par tout type de langage.

Couplé à Dockerfile qui nous permet d'exécuter notre programme depuis n'importe quelles machines, les possibilités sont 
nombreuses.
