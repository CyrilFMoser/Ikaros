module Program_15 () where 

main = print $ show v_b
data B_A a = C_A | C_B | C_C (B_A a) ((Int,(Char,Int))) | C_D

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_A) _ -> 0 
  C_C (C_C (C_C _ _) _) _ -> 1 
  C_C (C_C (C_A) _) ((_,(_,_))) -> 2 
  C_C (C_C (C_D) ((_,(_,_)))) _ -> 3 
