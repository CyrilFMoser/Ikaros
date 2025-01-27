module Program_43 () where 

main = print $ show v_b
data B_A a = C_A (B_A a) | C_B (((Bool,Int),B_A Char)) (B_B a)
data B_B b = C_C b b | C_D Char

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ -> 0 

--  This is not matched: C_B _ _ (C_A)