module Program_24 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) (B_A a) | C_B (B_A a) a | C_C | C_D Char

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_B _ _) _ -> 0 
