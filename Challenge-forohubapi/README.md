<h1>
  <b>API Rest Foro</b>
</h1>

<h2>
    Desafio planteado por <a href="https://www.aluracursos.com/">Alura latam</a>.
</h2>

<h2>
  Informacion
</h2>

<p>
  El forohubAPI  permite a los usuarios realizar las siguientes operaciones enfocadas en los tópicos.
</p>
<ul>
  <li>
    Crear nuevo tópico
  </li>
  <li>
    Mostrar todos los tópicos creados
  </li>
  <li>
    Mostrar tópico específico
  </li>
  <li>
    Mostrar tópico específico
  </li>
  <li>
    Actualizar tópico
  </li>
  <li>
    Eliminar tópico
  </li>
</ul>

<h2>
  Configuraciones entorno
</h2>

<ul>
  <li>
    Java (versión 17) 
  </li>
  <li>
    Maven
  </li>
  <li>
    Spring Boot (versión 3.3.1)
    Dependencias:
      <ul>
        <li>
          Lombok  
        </li>
        <li>
          Spring Web
        </li>
        <li>
          Spring Boot DevTools
        </li>
        <li>
          Spring Data JPA
        </li>
        <li>
          Flyway Migration
        </li>
        <li>
          MySQL Driver
        </li>
        <li>
          Validation
        </li>
        <li>
          Spring Security
        </li>
      </ul>
  </li>
</ul>

<h2>
    Documentacion
</h2>

<p>
    Se implemento Swagger para documentar la aplicación.
</p>

<p>
    Funciones de testeo para el Login en la API.
</p>

![Documemntacion_Login](https://github.com/user-attachments/assets/2892b207-e716-47a6-a012-26885ad13200)

<p>
    Para poder hacer de la API es necesario crear un usuario en la base de datos USUARIOS, para esto se be hacer directamente en la base de datos con el siguiente comando.
  
"INSERT INTO usuarios (nombre, email, contrasenia) VALUES ('su nombre', 'su email' , 'contraseña');"

</p>

<p>
    Después de crear el usuario se puede obtener el token desde la interfaz de Swagger.
</p>

![Login_Autenticacion](https://github.com/user-attachments/assets/1afb0b52-3cfa-4c9a-b072-cc9fa9290bf0)

<p>
En el body se obtiene el token para autenticar todos los test
</p>

![Token](https://github.com/user-attachments/assets/b8782612-6f06-45af-9f89-4fac7ecfe73d)

<p>
    Se realiza la comprobación del token desde el controller de usuarios
</p>

![Auntenticacion_Cursos](https://github.com/user-attachments/assets/6693f14d-c342-44f0-bba1-9e9a19550a98)

<p>
    Una vez utilizado el token se puede hacer uso de las demás funciones de la API
</p>

![Documemntacion_Curso](https://github.com/user-attachments/assets/10c72ea8-5b61-40df-8068-91f72e2ed6c0)
![Documemntacion_Respuestas](https://github.com/user-attachments/assets/60c389bb-7b89-4710-b903-a3d43d8807eb)
![Documemntacion_Topicos](https://github.com/user-attachments/assets/9ec56bbb-b080-4c20-b2cc-e59b218d871c)

<p>
   Se realizan tambien la configuracion de test desde la aplicacion de insomnia
</p>

![Test insomnia](https://github.com/user-attachments/assets/59e0ae3d-0fb7-4901-8280-5908e90f0f5c)
