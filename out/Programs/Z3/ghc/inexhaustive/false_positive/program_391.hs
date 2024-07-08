module Program_15 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) ((Int,(Int,Bool))) | C_B (B_A a) (B_A a) | C_C Char

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_B (C_B _ _) (C_A _ _)) (C_A _ ((_,(_,_)))) -> 0 
