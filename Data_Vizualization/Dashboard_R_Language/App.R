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

# Agrupamento 1 - Números de mortos

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
GroupTable <- left_join(GroupnkillTable, Groupcount, by = c ("gname" = "gname", "year" = "year"))
View(GroupTable)

# Agrupamento 2 - Números de mortos


