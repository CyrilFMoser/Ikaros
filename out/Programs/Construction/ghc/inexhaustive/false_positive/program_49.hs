module Program_24 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (((Int,Char),(Int,Int))) ((Int,Int))
data B_B c d = C_C | C_D c c | C_E (B_B d d) (B_A c c) | C_F ((Bool,Char)) d | C_G (B_B c c) c

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
