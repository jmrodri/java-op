#FROM quay.io/operator-framework/java-operator

#COPY requirements.yml ${HOME}/requirements.yml
#RUN java-galaxy collection install -r ${HOME}/requirements.yml \
#&& chmod -R ug+rwx ${HOME}/.ansible

#COPY watches.yaml ${HOME}/watches.yaml
