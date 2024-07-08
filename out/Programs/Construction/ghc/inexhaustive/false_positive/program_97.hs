module Program_1 () where 

 main = print $ show v_b
data B_C = C_I B_C
data B_A = C_A | C_B Bool (B_B B_A ((Int,Char))) | C_C B_A B_C | C_D | C_E B_A B_C
data B_B a b = C_F | C_G B_A a | C_H B_A B_C

v_a :: B_B Bool Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_G _ _ -> 1 
  C_H C_A _ -> 2 
  C_H (C_B _ (C_F)) _ -> 3 
  C_H (C_B _ (C_H _ _)) _ -> 4 
  C_H (C_C _ _) _ -> 5 
  C_H C_D _ -> 6 
  C_H (C_E _ _) _ -> 7 
