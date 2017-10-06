FROM postgres:9.6.5

# Copy the database initialize script:
# Contents of /docker-entrypoint-initdb.d are run on mysqld startup
ADD dockers/rest-template-db/docker-entrypoint-initdb.d/ /docker-entrypoint-initdb.d/

EXPOSE 5432