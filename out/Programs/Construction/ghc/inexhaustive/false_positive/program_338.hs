module Program_25 () where 

 main = print $ show v_b
data B_D c d = C_I (B_A d d) | C_J
data B_B = C_D | C_E | C_F (B_A B_B B_B) | C_G
data B_C = C_H (B_A ((Char,Bool)) B_B) (B_A B_C B_C)
data B_A a b = C_A | C_B ((B_B,B_B)) | C_C

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
  C_E -> 1 
  C_G -> 2 
