module Program_18 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A b b) Bool | C_B ((Char,(Char,Bool))) | C_C | C_D

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B ((_,(_,_))) -> 0 
  C_A (C_A (C_B _) _) _ -> 1 
  C_A (C_D) _ -> 2 
  C_A (C_C) _ -> 3 
