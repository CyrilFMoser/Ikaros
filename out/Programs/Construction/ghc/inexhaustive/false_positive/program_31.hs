module Program_9 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B | C_C

v_a :: B_A Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_C -> 1 
