module Program_7 () where 

main = print $ show v_b
data B_B b = C_B | C_C b b | C_D (B_A b) (B_B b) b
data B_A a = C_A (B_B a) (B_A a) a

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_D (C_A _ _ _) _ _ -> 1 

--  This is not matched: C_C _ _