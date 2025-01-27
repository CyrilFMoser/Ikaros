module Program_25 () where 

main = print $ show v_b
data B_B c d = C_D (B_B c c) (B_B c c) d | C_E (B_B c c) (B_B d d)
data B_A a b = C_A ((B_A Bool Int,B_A Int Bool)) (B_B a b) | C_B (B_B a b) | C_C

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
  C_C -> 1 

--  This is not matched: C_A _ _