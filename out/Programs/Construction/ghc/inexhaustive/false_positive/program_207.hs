module Program_22 () where 

 main = print $ show v_b
data B_C = C_E | C_F (((Char,Int),(Int,Char)))
data B_B = C_D Bool B_B
data B_A a b = C_A ((B_D,(Int,Bool))) | C_B B_B | C_C a
data B_D = C_G (((Char,Bool),B_B)) B_B | C_H (B_A B_B B_B) | C_I

v_a :: B_D
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ _ -> 0 
  C_H _ -> 1 
