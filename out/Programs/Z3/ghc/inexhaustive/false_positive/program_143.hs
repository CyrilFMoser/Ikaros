module Program_22 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a ((Char,Bool))) Bool | C_B ((Bool,Char)) (B_A Char Char) | C_C (B_B b b) ((Bool,(Char,Char))) | C_D
data B_B c d = C_E | C_F c | C_G c d | C_H d

v_a :: B_B Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E -> 0 
