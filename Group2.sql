SELECT avg(Rating) AS AverageRating, Genre.Name
FROM Movies JOIN Relation JOIN Genre
ON Movies.GenreID = Relation.GenreID AND Relation.GenreID = Genre.GenreID
GROUP BY Genre.Name
HAVING AverageRating > 7.5
ORDER BY AverageRating DESC