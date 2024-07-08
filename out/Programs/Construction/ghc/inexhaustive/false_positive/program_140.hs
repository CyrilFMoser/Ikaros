module Program_2 () where 

 main = print $ show v_b
data B_A = C_A B_A
data B_C c d = C_E (B_D Char) (B_B B_A c)
data B_D e = C_F | C_G (B_B e e) | C_H B_A B_A
data B_B a b = C_B | C_C Bool Char | C_D

v_a :: B_C Bool Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ _ -> 0 
