module Program_17 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A b b) | C_B ((Char,Int)) Int | C_C a (B_A a b)

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B _ _ -> 1 
  C_C _ (C_A _) -> 2 
  C_C _ (C_C _ _) -> 3 
