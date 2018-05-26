# curso-android-educacionit-repaso-clase3

Tener en cuenta que la importación inicial se debería hacer de la siguiente forma (para que funcione correctamente el proyecto en AndroidStudio):

(ver https://stackoverflow.com/questions/37093723/how-to-add-an-android-studio-project-to-github)

Go to root folder.

```
git init
```

Create .gitignore txt file in root folder. Place these content in file.

```
*.iml
.gradle
/local.properties
/.idea/workspace.xml
/.idea/libraries
.idea
.DS_Store
/build
/captures
.externalNativeBuild
```

Finalmente:

```
git add .
git remote add origin https://github.com/username/project.git
git commit - m "My First Commit"
git push origin
```
