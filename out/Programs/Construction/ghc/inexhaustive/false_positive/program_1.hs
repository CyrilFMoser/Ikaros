module Program_47 () where 

main = print $ show v_b
data B_A a = C_B Bool (B_A a)

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ (C_B True _) -> 0 
  C_B _ (C_B False _) -> 1 

--  This is not matched: C_B _ _ (C_A)