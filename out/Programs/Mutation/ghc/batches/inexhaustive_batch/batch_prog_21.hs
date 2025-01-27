module Program_21 () where 

main = print $ show v_b
data B_A a = C_A | C_B (B_A ((Int,Int))) (B_A Int) Bool | C_C (B_A a) (B_A a) (B_A a)

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_C (C_C _ _ _) (C_B _ _ _) (C_B _ _ _) -> 1 
  C_C (C_B _ _ _) (C_C _ _ _) _ -> 2 
  C_C (C_A) (C_C _ _ _) (C_B _ _ _) -> 3 
  C_B (C_B _ _ _) (C_C _ _ _) _ -> 4 
  C_B (C_B _ _ _) (C_B _ _ _) _ -> 4 
  C_B (C_B _ _ _) (C_A) _ -> 4 

--  This is not matched: (C_B Char (C_A (Tuple Int Int) (B_A (Tuple Int Int))) Wildcard Bool (B_A Char))
--  Mutation information: 
--  Expanded _ at position 4 into: 
--  {
--   C_A
--   C_B _ _ _
--   C_C _ _ _
--  }
-- 