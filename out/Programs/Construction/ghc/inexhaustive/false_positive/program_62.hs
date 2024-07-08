module Program_8 () where 

 main = print $ show v_b
data B_B a = C_F B_A ((Char,B_A)) | C_G | C_H B_C | C_I B_C
data B_A = C_A | C_B | C_C | C_D B_A | C_E B_C Int
data B_C = C_J | C_K

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C -> 1 
  C_D C_A -> 2 
  C_D C_B -> 3 
  C_D C_C -> 4 
  C_D (C_D C_A) -> 5 
  C_D (C_D C_B) -> 6 
  C_D (C_D C_C) -> 7 
  C_D (C_D (C_D _)) -> 8 
  C_D (C_D (C_E _ _)) -> 9 
  C_D (C_E _ _) -> 10 
  C_E _ _ -> 11 
