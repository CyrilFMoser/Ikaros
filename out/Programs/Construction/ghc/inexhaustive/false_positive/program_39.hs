module Program_15 () where 

 main = print $ show v_b
data B_A a b = C_A b | C_B (B_B Int a)
data B_D g = C_K (B_A Bool g) | C_L ((Int,(Char,Int))) | C_M
data B_C e f = C_H (B_A f e) | C_I | C_J
data B_B c d = C_C ((Char,(Int,Bool))) (B_B d d) | C_D | C_E (B_B d d) (B_B c c) | C_F | C_G d c

v_a :: B_B Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ _ -> 0 
  C_D -> 1 
  C_E _ _ -> 2 
  C_G _ _ -> 3 
