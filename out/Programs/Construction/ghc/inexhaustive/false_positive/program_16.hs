module Program_32 () where 

main = print $ show v_b
data B_A a b = C_C b
data B_B = C_D Bool

v_a :: B_A Char B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_D True) -> 0 
  C_C (C_D False) -> 1 

--  This is not matched: C_B _ _ (C_A)