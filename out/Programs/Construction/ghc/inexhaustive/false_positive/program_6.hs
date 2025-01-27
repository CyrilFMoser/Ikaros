module Program_42 () where 

main = print $ show v_b
data B_A a b = C_A | C_B

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 

--  This is not matched: C_B _ _ (C_A)