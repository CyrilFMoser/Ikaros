module Program_17 () where 

main = print $ show v_b
data B_A = C_A Int (B_B B_A) | C_B Char B_A
data B_B a = C_C | C_D B_A (B_B B_A) (B_B a)

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ _ (C_C) -> 0 
  C_D _ _ (C_D (C_A _ _) (C_C) _) -> 1 
  C_D _ _ (C_D (C_B _ _) (C_C) _) -> 2 
  C_D _ _ (C_D (C_A _ _) (C_D _ _ _) _) -> 3 
  C_D _ _ (C_D (C_B _ _) (C_D _ _ _) _) -> 4 

--  This is not matched: C_C