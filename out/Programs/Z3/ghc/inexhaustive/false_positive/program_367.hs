module Program_22 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) (((Int,Int),(Int,Int))) | C_B (B_A a) a

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_A (C_B _ _) (((_,_),(_,_))) -> 1 
  C_A (C_B (C_A _ _) _) _ -> 2 
  C_A (C_A _ _) _ -> 3 
  C_A (C_B (C_B _ _) _) _ -> 4 
  C_A (C_A _ (((_,_),(_,_)))) _ -> 5 
  C_A (C_B _ _) _ -> 6 
  C_A (C_A (C_B _ _) _) _ -> 7 
  C_A (C_A _ (((_,_),(_,_)))) (((_,_),(_,_))) -> 8 
  C_A (C_A (C_A _ _) (((_,_),(_,_)))) (((_,_),(_,_))) -> 9 
