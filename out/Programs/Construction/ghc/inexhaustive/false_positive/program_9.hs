module Program_39 () where 

main = print $ show v_b
data B_A = C_A B_A | C_C B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C C_A _) -> 0 

--  This is not matched: C_B _ _ (C_A)