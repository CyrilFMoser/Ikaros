module Program_8 () where 

main = print $ show v_b
data B_A = C_A Char B_A | C_B (B_B B_A B_A)
data B_B a b = C_C B_A | C_D

v_a :: C_A Char B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_A _ (C_A 'x' _) -> 1 
  C_A _ (C_A _ _) -> 1 
  C_A _ (C_B _) -> 2 

--  Mutation information: 
--  Adding an additional constant to a Wildcard in _ at pattern position 1 with constant expression:
--  {
--   'x'
--  }
-- 