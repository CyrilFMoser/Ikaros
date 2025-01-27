module Program_36 () where 

main = print $ show v_b
data B_B b c = C_C ((B_A Char,Int)) (B_B c c) | C_D
data B_A a = C_A | C_B

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 

--  This is not matched: C_B _ _ (C_A)