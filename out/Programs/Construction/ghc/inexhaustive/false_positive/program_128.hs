module Program_0 () where 

 main = print $ show v_b
data B_B = C_E | C_F (((Bool,Bool),B_B))
data B_C b = C_G (B_A b) Int | C_H (B_C b) B_B | C_I Bool
data B_A a = C_A (((Char,Bool),B_B)) | C_B | C_C a | C_D Char B_B

v_a :: B_A B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B -> 1 
  C_C C_E -> 2 
  C_C (C_F _) -> 3 
