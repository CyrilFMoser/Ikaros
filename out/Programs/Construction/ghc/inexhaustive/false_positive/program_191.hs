module Program_9 () where 

 main = print $ show v_b
data B_A a b = C_A Int (B_A b b)
data B_B c = C_B Char | C_C (B_C c c) | C_D (B_A ((Bool,Char)) c) | C_E B_D (B_A c c)
data B_C d e = C_F
data B_D = C_G (B_B ((Char,Int)))

v_a :: B_B Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ -> 0 
  C_D _ -> 1 
  C_E _ _ -> 2 
