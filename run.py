import subprocess
import os

def run(compose_command):
    command = compose_command + ' up genericcrud'
    
    print('''  
          Iniciando o projeto dentro do Docker.
          Você PRECISA do docker e do docker-compose funcionando em seu Linux
          ''')
    return subprocess.call(command, shell=True)

if __name__ == "__main__":
    project_home = os.path.dirname(os.path.abspath(__file__))
    compose_file = os.path.join(project_home, "docker-compose.yml")
    compose_command = 'docker-compose -f ' + compose_file + ' -p genericCrud'
    run(compose_command)