module Program_28 () where 

main = print $ show v_b
data B_A a = C_A a a | C_B | C_C a (B_A a) | C_D (B_A a) (B_A a)

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ (C_D _ _) -> 0 
  C_D (C_D (C_A _ _) _) (C_C _ (C_A _ _)) -> 1 
  C_D (C_D (C_A _ _) (C_B)) (C_D (C_A _ _) (C_B)) -> 2 
