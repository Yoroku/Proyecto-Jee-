FROM payara/micro
COPY ./target/gestion.ferreteria.war $DEPLOY_DIR
