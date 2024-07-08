module Program_11 () where 

 main = print $ show v_b
data B_B a b = C_F (B_D a b) | C_G | C_H
data B_A = C_A | C_B | C_C | C_D (B_D ((Bool,Int)) Int) (B_C ((Char,Int))) | C_E
data B_C c = C_I
data B_D d e = C_J (B_B e e)

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C -> 1 
  C_D (C_J (C_F _)) (C_I) -> 2 
  C_D (C_J (C_G)) (C_I) -> 3 
  C_D (C_J (C_H)) (C_I) -> 4 
  C_E -> 5 
