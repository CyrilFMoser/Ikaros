module Program_5 () where 

 main = print $ show v_b
data B_A a b = C_A b B_C | C_B ((B_C,B_B)) B_B | C_C | C_D
data B_B = C_E B_D | C_F | C_G B_B ((B_B,B_B))
data B_D = C_K B_D B_D
data B_C = C_H (((Char,Int),(Char,Int))) B_C | C_I | C_J B_D

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B _ _ -> 1 
  C_D -> 2 
