module Program_11 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) ((Int,(Int,Bool))) | C_B (B_A a) (B_A a) | C_C Char

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_B (C_A _ _) (C_A _ _)) ((_,(_,_))) -> 0 
  C_A (C_A (C_B _ _) ((_,(_,_)))) _ -> 1 
  C_A _ _ -> 2 
  C_B (C_A (C_B _ _) _) (C_B (C_B _ _) (C_B _ _)) -> 3 
  C_B (C_B _ (C_B _ _)) (C_A _ _) -> 4 
  C_B (C_B (C_C _) _) (C_A (C_B _ _) ((_,(_,_)))) -> 5 
  C_B (C_B (C_B _ _) (C_A _ _)) (C_A _ _) -> 6 
  C_B (C_B _ (C_A _ _)) (C_C _) -> 7 
  C_B (C_B (C_A _ _) (C_A _ _)) (C_A _ ((_,(_,_)))) -> 8 
  C_B (C_A (C_C _) ((_,(_,_)))) (C_A (C_A _ _) _) -> 9 
  C_B (C_B (C_A _ _) (C_C _)) (C_A _ _) -> 10 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B (C_B _ _) _) -> 11 
