module Program_31 () where 

 main = print $ show v_b
data B_C d = C_G (B_B d)
data B_A a b = C_A (((Int,Char),Char)) Int | C_B Bool | C_C (B_B a) a | C_D
data B_B c = C_E Int | C_F (B_A c c) c

v_a :: B_A Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B True -> 0 
  C_B False -> 1 
  C_C (C_E _) _ -> 2 
  C_C (C_F (C_A _ _) _) _ -> 3 
  C_C (C_F (C_B _) _) _ -> 4 
  C_C (C_F (C_C _ _) _) _ -> 5 
  C_C (C_F (C_D) _) _ -> 6 
  C_D -> 7 
