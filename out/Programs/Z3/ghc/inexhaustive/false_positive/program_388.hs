module Program_12 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) ((Int,(Int,Bool))) | C_B (B_A a) (B_A a) | C_C Char

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A (C_A _ _) _) _ -> 0 
  C_A (C_A (C_B _ _) _) _ -> 1 
  C_A (C_A (C_A _ _) ((_,(_,_)))) ((_,(_,_))) -> 2 
  C_A (C_B (C_C _) _) _ -> 3 
