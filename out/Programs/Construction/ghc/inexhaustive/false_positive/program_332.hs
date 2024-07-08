module Program_2 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A b b) | C_B Int (B_A b b) | C_C Char | C_D

v_a :: B_A Bool Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_C _ -> 1 
  C_D -> 2 
