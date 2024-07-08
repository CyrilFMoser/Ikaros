module Program_4 () where 

 main = print $ show v_b
data B_B b c = C_E | C_F (((Int,Bool),Int)) | C_G
data B_A a = C_A a | C_B ((Bool,Int)) Bool | C_C (B_A a) a | C_D (B_B a a)

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B _ _ -> 1 
  C_C (C_A _) _ -> 2 
  C_C (C_B _ _) _ -> 3 
  C_C (C_C (C_A _) _) _ -> 4 
  C_C (C_C (C_B _ _) _) _ -> 5 
  C_C (C_C (C_C _ _) _) _ -> 6 
  C_C (C_C (C_D _) _) _ -> 7 
  C_C (C_D _) _ -> 8 
