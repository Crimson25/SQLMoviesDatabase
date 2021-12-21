SELECT Title, Genre.Name AS Genre, Rating
FROM Movies JOIN Genre
ON Movies.GenreID = Genre.GenreID
ORDER BY Rating DESC
LIMIT 10
