module Program_18 () where 

main = print $ show v_b
data B_A a = C_A (B_A a) | C_B

v_a :: C_A (B_A Bool)
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_A _ -> 1 

--  Mutation information: 
--  Generalizing a concrete pattern in C_A _ at pattern position 0 to a wildcard pattern :
--  {
--   _
--  }
-- 