module Program_31 () where 

 main = print $ show v_b
data B_B = C_D (B_A B_B B_B) (B_A B_B B_B)
data B_A a b = C_A | C_B a (B_A a a) | C_C

v_a :: B_A Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B _ _ -> 1 
  C_B _ (C_A) -> 2 
  C_B _ (C_C) -> 3 
