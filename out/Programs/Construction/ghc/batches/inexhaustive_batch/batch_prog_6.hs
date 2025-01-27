module Program_6 () where 

main = print $ show v_b
data B_A a = C_A
data B_B b c = C_B (B_B b b) (B_A b) | C_C

v_a :: B_B Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 

--  This is not matched: C_C