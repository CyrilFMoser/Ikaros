module Program_22 () where 

 main = print $ show v_b
data B_C c d = C_F (B_A c c)
data B_B = C_B | C_C B_B (B_C B_B B_B) | C_D | C_E ((B_B,(Int,Int)))
data B_D e f = C_G B_B | C_H
data B_A a b = C_A

v_a :: B_A Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
