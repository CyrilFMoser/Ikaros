module Program_24 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) (((Int,Int),(Int,Int))) | C_B (B_A a) a

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_B (C_A (C_B _ _) (((_,_),(_,_)))) _ -> 1 
  C_B (C_B (C_A _ _) _) _ -> 2 
