module Program_14 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A b b) Bool | C_B ((Char,(Char,Bool))) | C_C | C_D

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_A (C_A (C_D) _) _ -> 1 
