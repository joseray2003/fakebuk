db.createCollection("usuarios")

db.usuarios.insertOne(
  {
    nombre: "Martín",
    apellido: "Borbón",
    edad: 19,
    correo: "borbonleyvam@gmail.com",
    password: "mbl",
    ciudad: "Navojoa, Sonora",
activo: "true",
img: "img.prueba.png"	
  }
)

db.createCollection("publicaciones")

db.publicaciones.insertOne(
  {
    correo: "borbonleyvam@gmail.com",
    date: new Date(),
    contenido: "Hola, que tengan buen dia",
    img: "imagen.opcional.jpg",
  }
)