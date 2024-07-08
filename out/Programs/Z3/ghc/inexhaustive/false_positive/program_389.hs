module Program_13 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) ((Int,(Int,Bool))) | C_B (B_A a) (B_A a) | C_C Char

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_B (C_B _ _) (C_B _ _)) ((_,(_,_))) -> 0 
  C_B (C_A (C_A _ _) _) (C_B _ _) -> 1 
  C_B (C_B (C_A _ _) (C_B _ _)) (C_B _ _) -> 2 
  C_B (C_B (C_B _ _) (C_C _)) (C_B _ (C_C _)) -> 3 
  C_B (C_B (C_C _) (C_B _ _)) (C_A (C_A _ _) _) -> 4 
