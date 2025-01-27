module Program_27 () where 

main = print $ show v_b
data B_A a = C_A | C_B (B_A a) a (B_A a)

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ _ -> 0 

--  This is not matched: C_B _ _ (C_A)