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

# Agrupamento 3 - Os tipos de alvo dos ataques(targettype)

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