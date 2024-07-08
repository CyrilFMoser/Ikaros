module Program_28 () where 

 main = print $ show v_b
data B_C b = C_G Bool
data B_A a = C_A | C_B a | C_C (B_C a) (B_C a) | C_D | C_E
data B_B = C_F

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_C _ _ -> 1 
  C_D -> 2 
  C_E -> 3 
