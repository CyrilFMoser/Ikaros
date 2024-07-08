module Program_9 () where 

 main = print $ show v_b
data B_A = C_A (B_B B_A B_A)
data B_B a b = C_B ((Char,B_A))

v_a :: B_B Char B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
