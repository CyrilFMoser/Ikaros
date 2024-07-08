module Program_11 () where 

 main = print $ show v_b
data B_A a b = C_A a | C_B b b
data B_B = C_C Bool | C_D ((B_B,B_B))
data B_D d e = C_F | C_G e B_B | C_H | C_I d (B_C e) | C_J (B_D e e) (B_A e e)
data B_C c = C_E

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
