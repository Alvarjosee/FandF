// server.js

const express = require('express');
const cors = require('cors');
const bodyParser = require('body-parser'); // Si necesitas analizar el cuerpo de las solicitudes

const app = express();

// Middleware para CORS
app.use(cors({
    origin: 'http://localhost:63342', // Cambia esto a tu origen
    methods: ['GET', 'POST', 'PUT', 'DELETE'], // Ajusta según los métodos que necesites
    credentials: true
}));

// Middleware para analizar el cuerpo de las solicitudes (opcional)
app.use(bodyParser.json()); // Para analizar aplicaciones/json

// Manejo de la solicitud POST
app.post('/api/vehicles', (req, res) => {
    // Tu lógica para manejar la solicitud, por ejemplo:
    const vehicleData = req.body; // Obtén los datos enviados desde el frontend
    console.log(vehicleData); // Puedes imprimir en la consola para verificar
    // Aquí puedes agregar la lógica para guardar el vehículo en la base de datos, etc.
    
    res.status(201).json({
        message: 'Vehículo creado con éxito',
        modelo: vehicleData.modelo, // Solo un ejemplo, ajusta según tu lógica
        motor: vehicleData.motor.model
    });
});

// Iniciar el servidor
const PORT = 8080; // El puerto donde quieres que escuche tu servidor
app.listen(PORT, () => {
    console.log(`Servidor corriendo en http://localhost:${PORT}`);
});
