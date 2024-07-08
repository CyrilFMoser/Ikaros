module Program_15 () where 

 main = print $ show v_b
data B_A = C_A (B_B B_A) B_A | C_B | C_C B_A ((Int,B_A)) | C_D ((Bool,B_A)) B_A | C_E B_A B_A
data B_B a = C_F (B_B a) B_A | C_G a | C_H

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ _ -> 0 
  C_G _ -> 1 
