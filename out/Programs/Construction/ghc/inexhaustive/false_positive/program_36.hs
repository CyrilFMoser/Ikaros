module Program_12 () where 

 main = print $ show v_b
data B_B = C_C ((B_B,B_B)) B_B
data B_A a b = C_A | C_B (B_A b Int) B_B

v_a :: B_A Bool Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B (C_A) _ -> 1 
  C_B (C_B (C_A) (C_C _ _)) _ -> 2 
