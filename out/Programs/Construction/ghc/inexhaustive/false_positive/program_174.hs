module Program_21 () where 

 main = print $ show v_b
data B_B = C_E Bool | C_F
data B_D = C_I Int
data B_A = C_A ((B_B,(Int,Bool))) B_A | C_B | C_C B_B B_D | C_D (((Int,Bool),(Bool,Int)))
data B_C a b = C_G | C_H (B_C a a) B_B

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B -> 1 
  C_C _ _ -> 2 
