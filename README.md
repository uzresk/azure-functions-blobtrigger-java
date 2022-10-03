# run local

edit pom

- function name
- resource group
- runtime
- plan
- plan resource group

get local settings

```shell
func azure functionapp fetch-app-settings <functionname>
```

run

```shell
.\mvnw clean package azure-functions:run
```


# deploy

```shell
.\mvnw clean package azure-functions:deploy
```
