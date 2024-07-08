module Program_8 () where 

 main = print $ show v_b
data B_C e f = C_G | C_H Bool
data B_B c d = C_B Char c | C_C Bool | C_D | C_E | C_F
data B_A a b = C_A

v_a :: B_B Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_C _ -> 1 
  C_D -> 2 
  C_E -> 3 
