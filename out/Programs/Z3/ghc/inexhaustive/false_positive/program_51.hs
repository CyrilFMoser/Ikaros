module Program_26 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A b b) b | C_B Int | C_C | C_D Char

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
  C_D _ -> 1 
  C_A (C_A (C_A _ _) _) _ -> 2 
  C_A (C_B _) _ -> 3 
