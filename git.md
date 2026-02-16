# Parte Teorica-git

---
## 1.¿Que es un repositorio en git?.

Un repositorio en Git es un proyecto que tiene control de versiones.Contiene una carpeta oculta .git donde se guarda todo el historial de cambios. Un proyecto normal solo tiene archivos un repositorio guarda versiones y cambios.

---
## 2.¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y repository) y qué papel cumple cada una? 

- **Working Directory (Directorio de trabajo):** Es donde están los archivos del proyecto y donde se realizan las modificaciones directamente.
- **Staging Area (Index):** Es una zona intermedia donde se preparan los cambios antes de confirmarlos con un commit. Aquí se agregan los archivos con git add.
- **Repository (Repositorio):** Es donde se almacenan de forma permanente los commits con el historial del proyecto.   
Cada cambio pasa primero por el directorio de trabajo, luego al staging y finalmente al repositorio mediante un commit.

---
## 3.¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag).

Git almacena la información mediante objetos internos:

- **Blob:** Guarda el contenido de un archivo (sin nombre ni estructura).
- **Tree:** Representa la estructura de carpetas y archivos, organizando los blobs.
- **Commit:** Guarda una referencia a un árbol (tree), información del autor, fecha, mensaje y referencia al commit anterior.
- **Tag:** Es una etiqueta que apunta a un commit específico, normalmente usada para marcar versiones importantes.

---
## 4.¿Cómo se crea un commit y qué información almacena un objeto commit?
Un commit se crea agregando primero los archivos al área de staging con git add y luego ejecutando git commit -m "mensaje".  
El objeto commit almacena el hash del commit padre, el nombre del autor, la fecha, el mensaje descriptivo y una referencia al árbol (tree) que contiene el estado de los archivos en ese momento. Cada commit tiene un identificador único llamado hash.

---
## 5.¿Cuál es la diferencia entre git pull y git fetch? 
git pull descarga los cambios y además los fusiona automáticamente en la rama en la que estoy trabajando (fetch + merge).                                                 git fetch descarga los cambios del repositorio remoto pero no los fusiona con la rama actual.  

---
## 6.¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?
Un branch (rama) es un puntero que apunta a un commit específico.                                              Cada vez que se crea un nuevo commit, la rama se mueve automáticamente hacia ese nuevo commit. Git utiliza un puntero especial llamado HEAD para indicar en qué rama o commit se está trabajando.

---
## 7.¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven? 
Un merge se realiza con el comando git merge nombre-rama y permite combinar cambios de una rama en otra.  
Los conflictos surgen cuando dos ramas modifican la misma parte de un archivo.  
Para resolverlos se debe editar manualmente el archivo, eliminar las marcas de conflicto, guardar los cambios, ejecutar git add y finalmente git commit.

---
## 8.¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso? 
El área de staging es una zona intermedia donde se preparan los archivos antes de hacer un commit mediante el comando git add.Si se omite este paso, los cambios no serán incluidos en el commit, ya que Git solo guarda lo que esté en staging.

---
## 9.¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos? 
El archivo .gitignore sirve para indicar qué archivos o carpetas Git no debe rastrear.Se usa para evitar subir archivos temporales, dependencias o configuraciones locales al repositorio.

---
## 10.¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?
git commit --amend modifica el último commit realizado, permitiendo cambiar el mensaje o agregar archivos olvidados.Un nuevo commit crea un registro adicional en el historial.  
El amend reescribe el historial, mientras que un nuevo commit lo amplía.

---
## 11.¿Cómo se utiliza git stash y en qué escenarios es útil? 
git stash guarda cambios temporales sin hacer commit y limpia el área de trabajo.  
Es útil cuando se necesita cambiar de rama rápidamente sin perder avances.Los cambios se pueden recuperar con git stash pop.

---
## 12.¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git revert, git checkout)?  
git reset mueve el puntero y puede eliminar commits según el modo utilizado.  
git revert crea un nuevo commit que deshace los cambios de uno anterior sin borrar el historial.  
git checkout permite restaurar archivos a un estado previo.

---
## 13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?
Los remotos conectan el repositorio local con uno en línea.  
origin suele ser el repositorio principal al que se hacen push.  
upstream se usa cuando se trabaja con un fork para traer cambios del repositorio original.  

Comandos comunes:  
git remote -v  
git remote add  
git fetch  
git push

---
## 14. ¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git diff, git show)?
git log muestra el historial de commits.  
git diff permite ver diferencias entre cambios.  
git show muestra los detalles de un commit específico.





