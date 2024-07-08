module Program_29 () where 

main = print $ show v_b
data B_A a = C_A a a | C_B | C_C a (B_A a) | C_D (B_A a) (B_A a)

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_D _ (C_D _ _)) (C_B) -> 0 
