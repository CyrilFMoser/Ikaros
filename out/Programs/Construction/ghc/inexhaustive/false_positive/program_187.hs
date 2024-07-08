module Program_5 () where 

 main = print $ show v_b
data B_C = C_G B_C (B_B B_C) | C_H ((B_C,B_C))
data B_B b = C_B (B_B b) | C_C Bool (B_A b) | C_D | C_E (B_A b) | C_F
data B_A a = C_A a

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
  C_D -> 1 
  C_E (C_A _) -> 2 
  C_F -> 3 
