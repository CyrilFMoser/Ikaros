module Program_5 () where 

 main = print $ show v_b
data B_A a = C_A | C_B | C_C Int

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B -> 1 
  C_C _ -> 2 