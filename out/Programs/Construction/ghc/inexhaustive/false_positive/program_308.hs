module Program_27 () where 

 main = print $ show v_b
data B_B b c = C_C | C_D Int | C_E | C_F
data B_A a = C_A a | C_B Bool (B_A a)

v_a :: B_B Bool Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_E -> 1 
  C_F -> 2 
