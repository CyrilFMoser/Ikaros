module Program_48 () where 

main = print $ show v_b
data B_A = C_A | C_B B_B

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 

--  This is not matched: C_B _ _ (C_A)