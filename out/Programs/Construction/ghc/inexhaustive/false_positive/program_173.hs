module Program_20 () where 

 main = print $ show v_b
data B_A a b = C_A a | C_B Char | C_C Int Int | C_D
data B_B = C_E Int | C_F B_B | C_G (B_C Char) B_B | C_H | C_I (B_C B_B) B_B
data B_C c = C_J (B_C c)

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_C 12 _ -> 1 
  C_C _ _ -> 2 
  C_D -> 3 
