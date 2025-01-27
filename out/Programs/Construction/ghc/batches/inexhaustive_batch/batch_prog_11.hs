module Program_11 () where 

main = print $ show v_b
data B_A = C_A B_A B_A | C_B | C_C

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_C -> 1 

--  This is not matched: C_B