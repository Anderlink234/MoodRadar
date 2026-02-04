db = db.getSiblingDB('admin');

db.createUser({
  user: 'root',
  pwd: 'example',
  roles: [{ role: 'root', db: 'admin' }]
});

db = db.getSiblingDB('MoodRadar');

db.createCollection('mood_entries');
// Puedes agregar más colecciones o índices aquí si es necesario.
