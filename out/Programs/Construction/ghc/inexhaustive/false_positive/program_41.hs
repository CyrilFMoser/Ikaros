module Program_17 () where 

 main = print $ show v_b
data B_D f = C_L | C_M | C_N Bool (B_C f) | C_O | C_P Char
data B_C e = C_K
data B_A a b = C_A b | C_B a | C_C | C_D | C_E
data B_B c d = C_F d | C_G ((Int,(Char,Bool))) | C_H | C_I | C_J Bool

v_a :: B_D Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_L -> 0 
  C_M -> 1 
  C_N _ (C_K) -> 2 
  C_P _ -> 3 
