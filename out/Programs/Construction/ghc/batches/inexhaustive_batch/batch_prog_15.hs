module Program_15 () where 

main = print $ show v_b
data B_A a b = C_A (B_A b (B_A b b)) | C_B Int | C_C

v_a :: B_A Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B 12 -> 0 
  C_B _ -> 1 
  C_C -> 2 

--  This is not matched: C_A _