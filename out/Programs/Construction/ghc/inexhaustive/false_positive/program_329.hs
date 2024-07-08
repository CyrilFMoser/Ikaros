module Program_17 () where 

 main = print $ show v_b
data B_A = C_A Char | C_B Int B_A | C_C B_C B_A | C_D
data B_B a = C_E | C_F a ((Char,B_A)) | C_G a
data B_C = C_H

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B 12 _ -> 1 
  C_C _ (C_A _) -> 2 
  C_C _ (C_B _ _) -> 3 
  C_C _ (C_C _ _) -> 4 
  C_C _ C_D -> 5 
  C_D -> 6 
