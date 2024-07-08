module Program_30 () where 

 main = print $ show v_b
data B_A a b = C_A b | C_B Char (B_B a Bool)
data B_B c d = C_C (B_B c c) Int

v_a :: B_A Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
