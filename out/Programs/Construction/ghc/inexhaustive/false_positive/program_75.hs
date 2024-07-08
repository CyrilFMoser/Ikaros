module Program_19 () where 

 main = print $ show v_b
data B_C = C_G (B_D B_B ((Char,Char)))
data B_D b c = C_H (B_D c c) c | C_I
data B_A a = C_A | C_B | C_C | C_D | C_E
data B_B = C_F B_B ((B_B,Int))

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B -> 1 
  C_D -> 2 
  C_E -> 3 
