# server_infra

# install microk8s

$ sudo snap install microk8s --classic --channel=1.13/stable
$ microk8s.enable dns dashboard storage

sudo snap alias microk8s.kubectl kubectl

dashboard 설치 확인 
$ kubectl get all --all-namespaces

dashboard 접속
$ token=$(kubectl -n kube-system get secret | grep default-token | cut -d " " -f1)
$ kubectl -n kube-system describe secret $token


port forward
https://kubernetes.io/docs/reference/generated/kubectl/kubectl-commands#port-forward
kubectl port-forward --address 0.0.0.0 -n devops-tools service/jenkins-service 8889:32000
$ kubectl port-forward -n kube-system service/kubernetes-dashboard 10443:443


# 5/15 Jenkins 설치
참고링크 : https://devopscube.com/setup-jenkins-on-kubernetes-cluster/
kubectl port-forward --address 0.0.0.0 -n devops-tools service/jenkins-service 8889:8080



***************************
microk8s 는 자료가 너무없다 
minikube로 환승


# MariaDB 설치

# GateWay 설정
