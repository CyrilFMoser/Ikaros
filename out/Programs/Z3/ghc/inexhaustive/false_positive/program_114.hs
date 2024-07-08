module Program_25 () where 

 main = print $ show v_b
data B_A a b = C_A b b | C_B a

v_a :: B_A Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
