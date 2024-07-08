module Program_22 () where 

 main = print $ show v_b
data B_B c = C_F | C_G
data B_A a b = C_A | C_B | C_C B_C | C_D | C_E a B_C
data B_C = C_H ((B_C,B_C))

v_a :: B_A B_C Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B -> 1 
  C_D -> 2 
  C_E _ _ -> 3 
