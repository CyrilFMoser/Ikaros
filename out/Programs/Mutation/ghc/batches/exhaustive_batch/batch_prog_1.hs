module Program_1 () where 

main = print $ show v_b
data B_B a b = C_C B_A | C_D
data B_A = C_A Char B_A | C_B (B_B B_A B_A)

v_a :: C_A Char B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  _ -> 0 
  C_A _ (C_A _ _) -> 1 
  C_A _ (C_B _) -> 2 

--  Mutation information: 
--  Generalizing a concrete pattern in C_A _ _ at pattern position 0 to a wildcard pattern :
--  {
--   _
--  }
-- 