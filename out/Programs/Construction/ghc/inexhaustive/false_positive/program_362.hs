module Program_18 () where 

 main = print $ show v_b
data B_C = C_G (B_B B_C) | C_H (B_A B_C) | C_I (B_B ((Bool,Int)))
data B_B b = C_B (B_A b) | C_C (B_B b) | C_D ((Int,B_C)) | C_E | C_F
data B_A a = C_A (B_B B_C) B_C

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ -> 0 
  C_H (C_A (C_B _) (C_G _)) -> 1 
  C_H (C_A (C_B _) (C_H _)) -> 2 
  C_H (C_A (C_B _) (C_I _)) -> 3 
  C_H (C_A (C_C _) (C_G _)) -> 4 
  C_H (C_A (C_C _) (C_H _)) -> 5 
  C_H (C_A (C_C _) (C_I _)) -> 6 
  C_H (C_A (C_D _) (C_G _)) -> 7 
  C_H (C_A (C_D _) (C_H _)) -> 8 
  C_H (C_A (C_D _) (C_I _)) -> 9 
  C_H (C_A (C_E) (C_G _)) -> 10 
  C_H (C_A (C_E) (C_H _)) -> 11 
  C_H (C_A (C_E) (C_I _)) -> 12 
  C_H (C_A (C_F) (C_G _)) -> 13 
  C_H (C_A (C_F) (C_H _)) -> 14 
  C_H (C_A (C_F) (C_I _)) -> 15 
  C_I (C_B (C_A _ _)) -> 16 
  C_I (C_C (C_B _)) -> 17 
  C_I (C_C (C_C _)) -> 18 
  C_I (C_C (C_D _)) -> 19 
  C_I (C_C (C_E)) -> 20 
  C_I (C_C (C_F)) -> 21 
  C_I (C_E) -> 22 
  C_I (C_F) -> 23 
