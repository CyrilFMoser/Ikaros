module Program_20 () where 

main = print $ show v_b
data B_A a = C_A (B_A a) | C_B

v_a :: C_A (B_A Bool)
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A (C_B)) -> 0 
  C_A (C_A (C_A _)) -> 0 
  C_A (C_A _) -> 0 
  C_A _ -> 1 

--  Mutation information: 
--  Expanded _ at position 0 into: 
--  {
--   C_A _
--   C_B
--  }
-- 