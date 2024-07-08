module Program_24 () where 

 main = print $ show v_b
data B_C = C_I ((B_B,Int)) B_C | C_J | C_K Bool B_B | C_L ((Int,B_A)) B_A | C_M
data B_A = C_A | C_B Bool | C_C B_A | C_D ((B_B,B_C)) | C_E
data B_B = C_F B_C B_A | C_G | C_H B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B _ -> 1 
  C_C C_A -> 2 
  C_C (C_B _) -> 3 
  C_C (C_C C_A) -> 4 
  C_C (C_C (C_B _)) -> 5 
  C_C (C_C (C_C _)) -> 6 
  C_C (C_C (C_D _)) -> 7 
  C_C (C_C C_E) -> 8 
  C_C (C_D _) -> 9 
  C_C C_E -> 10 
  C_D ((C_F _ _,C_I _ _)) -> 11 
  C_D ((C_F _ _,C_K _ _)) -> 12 
  C_D ((C_F _ _,C_L _ _)) -> 13 
  C_D ((C_F _ _,C_M)) -> 14 
  C_D ((C_G,C_I _ _)) -> 15 
  C_D ((C_G,C_J)) -> 16 
  C_D ((C_G,C_K _ _)) -> 17 
  C_D ((C_G,C_L _ _)) -> 18 
  C_D ((C_G,C_M)) -> 19 
  C_D ((C_H _,C_I _ _)) -> 20 
  C_D ((C_H _,C_J)) -> 21 
  C_D ((C_H _,C_K _ _)) -> 22 
  C_D ((C_H _,C_L _ _)) -> 23 
  C_D ((C_H _,C_M)) -> 24 
  C_E -> 25 
