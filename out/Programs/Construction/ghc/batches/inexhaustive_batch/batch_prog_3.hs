module Program_3 () where 

main = print $ show v_b
data B_A = C_A Int | C_B B_A Int ((B_B,B_B))
data B_B = C_C B_B B_B

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_A _) _ _ -> 0 
  C_B (C_B _ _ _) _ _ -> 1 

--  This is not matched: C_A _