module Program_29 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B ((Char,Int)) (B_A b b)
data B_B c d = C_C | C_D (B_B d d) c | C_E | C_F (B_B c d) ((Bool,Int))

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B ((_,_)) (C_B _ _) -> 0 
  C_B ((_,_)) (C_B _ (C_B _ _)) -> 1 
  C_B ((_,_)) (C_B ((_,_)) (C_A)) -> 2 
  C_B ((_,_)) (C_B ((_,_)) (C_B _ _)) -> 3 
  C_B ((_,_)) (C_A) -> 4 
  C_B _ (C_B ((_,_)) (C_B _ _)) -> 5 
  C_B ((_,_)) (C_B _ (C_A)) -> 6 
