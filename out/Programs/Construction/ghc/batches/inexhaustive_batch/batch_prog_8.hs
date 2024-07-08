module Program_8 () where 

 main = print $ show v_b
data B_B b = C_E (B_B b) (B_B b) | C_F | C_G (B_B b) | C_H (B_B b) b | C_I (B_B b)
data B_A a = C_A | C_B | C_C | C_D (B_B Int)

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B -> 1 
  C_C -> 2 
  C_D (C_E _ _) -> 3 
  C_D (C_F) -> 4 
  C_D (C_G _) -> 5 
  C_D (C_H _ _) -> 6 
