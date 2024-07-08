module Program_30 () where 

 main = print $ show v_b
data B_A = C_A (B_B B_A) | C_B B_A ((Int,(Char,Int))) | C_C B_A | C_D
data B_B a = C_E
data B_C = C_F | C_G

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_C _ -> 1 
  C_D -> 2 
