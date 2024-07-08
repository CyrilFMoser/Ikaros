module Program_2 () where 

 main = print $ show v_b
data B_A a = C_A a (((Char,Bool),(Char,Bool))) | C_B Bool | C_C (B_A a) B_B | C_D (B_A a) a
data B_B = C_E ((B_B,(Char,Bool))) | C_F | C_G (B_A Char) (((Bool,Char),B_B))

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_D (C_D _ _) _) _ -> 0 
  C_D (C_D (C_A _ _) _) _ -> 1 
  C_D (C_C (C_C _ _) (C_E _)) _ -> 2 
  C_D (C_C (C_A _ _) C_F) _ -> 3 
  C_D (C_D (C_B _) _) _ -> 4 
  C_D (C_D (C_C _ _) _) _ -> 5 
