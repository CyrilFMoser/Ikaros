module Program_28 () where 

 main = print $ show v_b
data B_D c = C_J Char (B_D c) | C_K
data B_C = C_H (B_D ((Char,Int))) B_C | C_I
data B_A a = C_A | C_B | C_C
data B_B b = C_D B_C Bool | C_E | C_F | C_G b Char

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B -> 1 
