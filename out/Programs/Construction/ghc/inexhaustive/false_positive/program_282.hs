module Program_4 () where 

 main = print $ show v_b
data B_B b = C_D (B_A b)
data B_A a = C_A Int | C_B ((Int,(Bool,Bool))) (B_C a Int) | C_C
data B_C c d = C_E (B_C d Bool) | C_F (B_C c c) (B_A c) | C_G | C_H (B_C d d) Bool | C_I

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_C -> 1 
