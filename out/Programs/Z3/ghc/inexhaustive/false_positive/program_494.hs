module Program_16 () where 

main = print $ show v_b
data B_A a = C_A (B_B a) (B_A a) | C_B | C_C
data B_B b = C_D | C_E (B_A b)

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_A (C_E _) (C_A _ _)) -> 0 
  C_E (C_A (C_D) (C_C)) -> 1 
