module Program_9 () where 

main = print $ show v_b
data B_A a b = C_A | C_B | C_C (B_A b b) (B_A a a)

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C (C_C _ _) (C_A)) (C_C _ (C_B)) -> 0 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_C _ _) _) -> 1 
