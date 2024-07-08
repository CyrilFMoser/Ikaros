module Program_8 () where 

 main = print $ show v_b
data B_A a b = C_A
data B_C d = C_C (((Char,Int),Int)) (B_A Bool d) | C_D Char
data B_B c = C_B c (B_B Int)

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
