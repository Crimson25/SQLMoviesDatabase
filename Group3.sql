SELECT Title, Lead
FROM Movies
WHERE Rating > (SELECT avg(Rating)
 FROM Movies) AND Lead IS NOT NULL