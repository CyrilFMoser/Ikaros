module Program_13 () where 

 main = print $ show v_b
data B_A a b = C_A (B_B a) Int | C_B | C_C (B_A a b) | C_D Char
data B_B c = C_E Bool (B_B c)

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ _ -> 0 
