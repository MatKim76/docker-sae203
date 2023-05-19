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

Dans un premier temps, nous avons effectué le [TP d'initiation git](https://abderzah.github.io/Introduction-GIT) chacun de notre côté (ou ensemble pour les TP3 et 4) avant les premières séances dédiées 
à cette SAE. Dans ces TP d'initiation nous avons appris à utiliser git et GitHub. Nous avons appris toutes sortes de travailler depuis le dépot git de par
nos machines respectives.

[GitHub](https://github.com/) nous permettrait alors de pouvoir travailler sur le même répertoire, sur les mêmes fichiers et y faire des modifications. Il faut aussi faire 
attention à ne pas faire de modification en même temps sous peine de causer des conflits, ce qui empêche toute intéraction avec GitHub avant que le conflit 
ne soit corrigé par un ``git add <fichier>`` ou ``git restore <fichier>`` depuis les machines utilisateurs. Sans fichier ``index.md``, le gh-pages se 
basera sur un autre fichier au format MARKDOWN, un README par exemple.

Nous avons ensuite, par le biais du TP5 de l'initiation GIT, les gh pages. Nous pouvons à partir d'un répertoire **public** créer une page internet. A 
partir d'un ``index.md`` ainsi qu'un ``config.yml`` (pour importer des styles, une sorte de css), GitHub nous génrère un site internet comme celui-ci.
Le ``index.md`` est notre base où nous renseignerons tout ce que devra contenir le site (titres, texte, tableaux, ...) à la manière d'un fichier html sauf 
que l'on peut ici oublier les balises, ce site en est un exemple...

Par la suite, nous avons effectué le TP d'initiation à dockerfile dans chacune de nos machine personnelles, ce qui 
nous a permis de nous familiariser avec ce type de fichier. 

* * *

## Explication de Dockerfile, son utilité dans notre projet

[Docker](https://www.docker.com/) présente de multiples avantages, en permettant de développer des applications faciles à assembler, à maintenir et à déplacer. Les conteneurs 
permettent l’isolation des applications entre elles et du système sous-jacent.

Ils permettent aussi la portabilité, puisque les applications n’ont pas à être liées au système d’exploitation hôte. Les applications conteneurisées 
peuvent par exemple être aisément transférées de systèmes sur site vers les environnements Cloud.

Les développeurs peuvent se focaliser sur leur code, sans avoir à se soucier du système sur lequel il sera exécuté. En outre, ils peuvent gagner du temps 
en incorporant des programmes pré-conçus pour leurs applications.

Un Dockerfile est un fichier texte utilisé pour créer une image Docker. Docker est une plateforme de virtualisation légère qui permet de créer et de gérer des conteneurs,
qui sont des environnements d'exécution isolés pour des applications. Dockerfile permet de spécifier l'image de base à utiliser, généralement appelée image parente,
qui fournit l'environnement de base pour l'application. Par exemple, on peut utiliser une image de système d'exploitation comme Ubuntu ou une image plus spécifique
comme une image contenant un serveur web. Dockerfile permet aussi d'inclure les fichiers sources nécessaires à l'application dans l'image Docker.
On peut copier des fichiers depuis le système de fichiers local ou à partir d'une URL spécifique vers des emplacements spécifiques à l'intérieur du conteneur.

Le Dockerfile est utilisé pour décrire les étapes nécessaires à la construction d'une image Docker. Il spécifie les instructions qui doivent être exécutées pour assembler
une image à partir d'un ensemble de fichiers sources.

* * *

## Démonstration

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

Instructions dans le [README.md](https://github.com/MatKim76/docker-sae203/blob/main/README.md) à la [racine du projet](https://github.com/MatKim76/docker-sae203).

* * *

## Utilisation

### Naviguer dans les colonnes du plateau
- Flèche de gauche : colonne de gauche
- Flèche de droite : colonne de droite

### Jouer
- Flèche du bas    : Poser une pièce dans la colonne selectionnée

* * *

## Conclusion

Cette SAE nous a permis de nous familiariser avec git, cette plateforme de dépot pourrait nous avérer être utile dans notre 
futur, que ce soit dans notre parcours à l'IUT ou bien dans notre vie professionnelle. Après plusieurs recherches, certains professionnels utilisent **régulièrement**
GitHub pour mettre en ligne leur projet et mettre en avant leurs connaissances, leurs motivations lors d'entretiens d'embauche. GitHub est aussi utilisé dans le domaine
professionnel comme un outil de travail, cette SAE nous est donc très utile pour ce que nous envisagerons de faire dans le futur !

GitHub regroupe de nombreux projets et se montrer très pratique puisque l'accès y est rapide ainsi de par son abilité à 
insérer tout type de fichier de par tout type de langage.

Couplé à Dockerfile qui nous permet d'exécuter notre programme depuis n'importe quelles machines, les possibilités sont 
nombreuses, nous avons ici choisi de faire un puissance 4 en Java mais des systèmes de messageries en ligne ou bien des emploi du temps interactifs par exemple
sont envisageables grace à ce système employé.
