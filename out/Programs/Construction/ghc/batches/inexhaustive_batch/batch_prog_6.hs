module Program_6 () where 

 main = print $ show v_b
data B_B c d = C_D | C_E Int Bool | C_F (B_C c) (B_B d d) | C_G
data B_C e = C_H Bool | C_I | C_J e
data B_A a b = C_A a a | C_B ((Bool,(Int,Bool))) | C_C

v_a :: B_B Bool Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ _ -> 0 
  C_F _ _ -> 1 
  C_G -> 2 
