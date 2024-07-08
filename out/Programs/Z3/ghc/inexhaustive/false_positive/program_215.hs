module Program_3 () where 

 main = print $ show v_b
data B_B = C_E ((B_B,(Char,Bool))) | C_F | C_G (B_A Char) (((Bool,Char),B_B))
data B_A a = C_A a (((Char,Bool),(Char,Bool))) | C_B Bool | C_C (B_A a) B_B | C_D (B_A a) a

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_C (C_D _ _) (C_G _ _)) _ -> 0 
  C_C (C_A _ (((_,_),(_,_)))) (C_G _ (((_,_),C_E _))) -> 1 
  C_C (C_C (C_A _ _) (C_E _)) (C_G _ _) -> 2 
