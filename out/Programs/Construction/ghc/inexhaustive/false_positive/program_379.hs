module Program_5 () where 

 main = print $ show v_b
data B_C c d = C_G (B_A Int c) | C_H ((Int,(Int,Int)))
data B_A a b = C_A (B_A a a)
data B_B = C_B | C_C | C_D (B_C B_B B_B) B_B | C_E | C_F B_B Int

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
