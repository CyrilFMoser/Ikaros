module Program_19 () where 

main = print $ show v_b
data B_B c d = C_C | C_D (B_A d d) (B_B c c) | C_E
data B_A a b = C_A | C_B b

v_a :: B_B Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_A) _ -> 0 
  C_D (C_B _) _ -> 1 
  C_E -> 2 

--  This is not matched: C_C