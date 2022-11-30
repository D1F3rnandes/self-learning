getwd()
setwd("C:/Users/Diego/Documents/git-projects/Data_Vizualization/Dashboard_R_Language/")

install.packages("plyr")
install.packages("dplyr")
install.packages("tidyr")
install.packages("ggplot2")

library(plyr)
library(dplyr)
library(tidyr)
library(ggplot2)

dados <- read.csv("dados.csv", sep = ",")

dados <- dados %>%
  mutate(year = iyear) %>%
  select(-c(2))

View(dados)

# Agrupamento 1 - Números de mortos(nkill)

  # Limpeza dos dados
dados_clean <- dados %>% drop_na(nkill)
View(dados_clean)

  # Agrupando os dados por números de mortos
Groupcount <- ddply(dados_clean, .(gname,year), nrow)
colnames(Groupcount)[3] <- "attack_count"

  # Agrupando a agregação dos dados por números de mortes
GroupnkillSum <- aggregate(nkill ~ gname + year, data = dados_clean, sum)
colnames(GroupnkillSum)[3] <- "kills_total"

  # Agrupando a agregação dos dados por média de mortes
GroupnkillMean <- aggregate(nkill ~ gname + year, data = dados_clean, mean)
colnames(GroupnkillMean)[3] <- "kills_mean"

  # Criando a tabelas com totas os dados agrupados
GroupnkillTable <- left_join(GroupnkillSum, GroupnkillMean, by = c("gname" = "gname", "year" = "year"))
GroupTable <- left_join(GroupnkillTable, Groupcount, by = c("gname" = "gname", "year" = "year"))
View(GroupTable)

# Agrupamento 2 - Nacionalidade que sofreu ataques(natlty)

  # Limpeza dos dados
natltycount<- ddply(dados_clean, .(natlty1_txt, year), nrow)
colnames(natltycount)[3] <- "attack_count"

  # Somando o números de mortos por nacionalidade
natltykillSum <- aggregate(nkill ~ natlty1_txt + year, data = dados_clean, sum)
colnames(natltykillSum)[3] <- "kills_total"

  # Verificando a média de morte por nacionalidade
natltykillMean <- aggregate(nkill ~ natlty1_txt + year, data = dados_clean, mean)
colnames(natltykillMean)[3] <- "kills_mean"

  # Criando a tabelas com totas os dados agrupados
natltykillTable <- left_join(natltykillSum, natltykillMean, by = c("natlty1_txt" = "natlty1_txt", "year" = "year"))
natltyTable <- left_join(natltykillTable, natltycount, by = c("natlty1_txt" = "natlty1_txt", "year" = "year"))
View(natltyTable)

# Agrupamento 3 - Os tipos de alvo dos ataques(targetype)

  # Limpeza dos dados
natltycount <- ddply(dados_clean, .(targtype1_txt, year), nrow)
colnames(natltycount)[3] <- "attack_count"

  # Somando o números de mortos por nacionalidade
targetypekillSum <- aggregate(nkill ~ targtype1_txt + year, data = dados_clean, sum)
colnames(targetypekillSum)[3] <- "attack_count"

  # Verificando a média de morte por nacionalidade
targetypekillMean <- aggregate(nkill ~ targtype1_txt + year, data = dados_clean, mean)
colnames(targetypekillMean)[3] <- "attack_mean"

  # Criando a tabelas com totas os dados agrupados
targetypekillTable <- left_join(targetypekillSum, targetypekillMean, by = c("targtype1_txt" = "targtype1_txt", "year" = "year"))
targetypeTable <- left_join(targetypekillTable, natltycount, by = c("targtype1_txt" = "targtype1_txt", "year" = "year"))
View(targetypeTable)

# Agrupamento 4 - Os tipos de alvo dos ataques(regioncount)

  # Limpeza dos dados
regioncount <- ddply(dados_clean, .(region_txt, year), nrow)
colnames(regioncount)[3] <- "attack_count"

  # Somando o números de mortos por nacionalidade
regioncountkillSum <- aggregate(nkill ~ region_txt + year, data = dados_clean, sum)
colnames(regioncountkillSum)[3] <- "attack_count"

  # Verificando a média de morte por nacionalidade
regioncountkillMean <- aggregate(nkill ~ region_txt + year, data = dados_clean, mean)
colnames(targetypekillMean)[3] <- "attack_mean"

  # Criando a tabelas com totas os dados agrupados
regioncountkillTable <- left_join(regioncountkillSum, regioncountkillMean, by = c("region_txt" = "region_txt", "year" = "year"))
regionCountTable <- left_join(regioncountkillTable, regioncount, by = c("region_txt" = "region_txt", "year" = "year"))
View(regionCountTable)

# Agrupamento 5 - Agrupamento do tipo de arma

Weaponcount <- ddply(dados_clean, .(weaptype1_txt, year), nrow)
colnames(Weaponcount)[3]  <- "attack_count"

WeaponnkillSum <- aggregate(nkill ~ weaptype1_txt + year, data = dados_clean, sum)
colnames(WeaponnkillSum)[3]  <- "kills_total"

WeaponnkillMean <- aggregate(nkill ~ weaptype1_txt + year, data = dados_clean, mean)
colnames(WeaponnkillMean)[3]  <- "kills_mean"

WeaponnkillTable <- left_join(WeaponnkillSum, WeaponnkillMean, by = c("weaptype1_txt" = "weaptype1_txt", "year" = "year"))
WeaponTable <- left_join(WeaponnkillTable, Weaponcount, by = c("weaptype1_txt" = "weaptype1_txt", "year" = "year"))
View(WeaponTable)

# Agrupamento 6 - Agrupamento do tipo de ataque

attacktypecount <- ddply(dados_clean, .(attacktype1_txt, year), nrow)
colnames(attacktypecount)[3]  <- "attack_count"

attacktypenkillSum <- aggregate(nkill ~ attacktype1_txt + year, data = dados_clean, sum)
colnames(attacktypenkillSum)[3]  <- "kills_total"

attacktypenkillMean <- aggregate(nkill ~ attacktype1_txt + year, data = dados_clean, mean)
colnames(attacktypenkillMean)[3]  <- "kills_mean"

attacktypenkillTable <- left_join(attacktypenkillSum, attacktypenkillMean, by = c("attacktype1_txt" = "attacktype1_txt", "year" = "year"))
attacktypeTable <- left_join(attacktypenkillTable, attacktypecount, by = c("attacktype1_txt" = "attacktype1_txt", "year" = "year"))
View(attacktypeTable)

# Agrupamento 7 - Agrupamento do pais que sofreu os ataques (país que sofreu o ataque)

countrycount <- ddply(dados_clean, .(country_txt, year), nrow)
colnames(countrycount)[3]  <- "attack_count"

countrynkillSum <- aggregate(nkill ~ country_txt + year, data = dados_clean, sum)
colnames(countrynkillSum)[3]  <- "kills_total"

countrynkillMean <- aggregate(nkill ~ country_txt + year, data = dados_clean, mean)
colnames(countrynkillMean)[3]  <- "kills_mean"

countrynkillTable <- left_join(countrynkillSum, countrynkillMean, by = c("country_txt" = "country_txt", "year" = "year"))
countryTable <- left_join(countrynkillTable, countrycount, by = c("country_txt" = "country_txt", "year" = "year"))
View(countryTable)

# Alterando o titulo das colunas

colnames(GroupTable)[1] <- "Title"
colnames(natltyTable)[1] <- "Title"
colnames(targetypeTable)[1] <- "Title"
colnames(regioncountTable)[1] <- "Title"
colnames(WeaponTable)[1] <- "Title"
colnames(attacktypeTable)[1] <- "Title"
colnames(countryTable)[1] <- "Title"

# Evitando que ocorra que o titulo fique vazio, subtituindo por Unknown

natltyTable$Title <- ifelse(natltyTable$Title == "", "Unknown", as.character(natltyTable$Title))

# Ajustando o titulo pois é muito extenso

WeaponTable$Title <- ifelse(WeaponTable$Title == "Vehicle (not to include vehicle-borne explosives, i.e., car or truck bombs)", 
                            "Vehicle (not to include vehicle-borne explosives)", 
                            as.character(WeaponTable$Title))

# Títulos das colunas
colnames(natltyTable)[1] <- "Title"
colnames(targetypeTable)[1] <- "Title"
colnames(regionCountTable)[1] <- "Title"
colnames(WeaponTable)[1] <- "Title"
colnames(attacktypeTable)[1] <- "Title"
colnames(countryTable)[1] <- "Title"