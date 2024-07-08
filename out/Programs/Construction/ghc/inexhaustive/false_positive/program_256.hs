module Program_0 () where 

 main = print $ show v_b
data B_A = C_A B_B B_B | C_B ((B_A,B_A)) Int | C_C B_A ((Bool,(Char,Int)))
data B_B = C_D | C_E | C_F

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E -> 0 
  C_F -> 1 
