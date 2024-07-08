module Program_7 () where 

 main = print $ show v_b
data B_A a = C_A B_C | C_B (B_D a) | C_C | C_D ((B_C,B_C)) B_C
data B_D d = C_I (B_B d ((Char,Char))) | C_J | C_K (B_D Bool) | C_L | C_M
data B_C = C_F Int | C_G | C_H
data B_B b c = C_E

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B (C_I (C_E)) -> 1 
  C_B (C_J) -> 2 
  C_B (C_K (C_I _)) -> 3 
  C_B (C_K (C_J)) -> 4 
  C_B (C_K (C_K _)) -> 5 
  C_B (C_K (C_L)) -> 6 
  C_B (C_K (C_M)) -> 7 
  C_B (C_L) -> 8 
  C_B (C_M) -> 9 
  C_C -> 10 
  C_D ((C_F _,C_F _)) (C_F _) -> 11 
  C_D ((C_F _,C_F _)) C_G -> 12 
  C_D ((C_F _,C_F _)) C_H -> 13 
  C_D ((C_F _,C_G)) (C_F _) -> 14 
  C_D ((C_F _,C_G)) C_G -> 15 
  C_D ((C_F _,C_G)) C_H -> 16 
  C_D ((C_F _,C_H)) (C_F _) -> 17 
  C_D ((C_F _,C_H)) C_G -> 18 
  C_D ((C_F _,C_H)) C_H -> 19 
  C_D ((C_G,C_F _)) (C_F _) -> 20 
  C_D ((C_G,C_F _)) C_G -> 21 
  C_D ((C_G,C_F _)) C_H -> 22 
  C_D ((C_G,C_G)) (C_F _) -> 23 
  C_D ((C_G,C_G)) C_H -> 24 
  C_D ((C_G,C_H)) (C_F _) -> 25 
  C_D ((C_G,C_H)) C_G -> 26 
  C_D ((C_G,C_H)) C_H -> 27 
  C_D ((C_H,C_F _)) (C_F _) -> 28 
  C_D ((C_H,C_F _)) C_G -> 29 
  C_D ((C_H,C_F _)) C_H -> 30 
  C_D ((C_H,C_G)) (C_F _) -> 31 
  C_D ((C_H,C_G)) C_G -> 32 
  C_D ((C_H,C_G)) C_H -> 33 
  C_D ((C_H,C_H)) (C_F _) -> 34 
  C_D ((C_H,C_H)) C_G -> 35 
  C_D ((C_H,C_H)) C_H -> 36 
