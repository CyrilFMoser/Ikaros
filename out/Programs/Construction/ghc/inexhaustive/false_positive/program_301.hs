module Program_20 () where 

 main = print $ show v_b
data B_B = C_E (B_A B_B) (B_A B_B) | C_F | C_G (B_C ((Char,Char)) ((Bool,Bool))) (B_A ((Bool,Int))) | C_H (B_A B_B)
data B_A a = C_A a (B_C a a) | C_B B_B (B_C a a) | C_C | C_D
data B_C b c = C_I ((B_B,B_B)) B_B | C_J c | C_K

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ _ -> 0 
  C_G (C_I ((_,_)) (C_E _ _)) _ -> 1 
  C_G (C_I ((_,_)) C_F) _ -> 2 
  C_G (C_I ((_,_)) (C_G _ _)) _ -> 3 
  C_G (C_I ((_,_)) (C_H _)) _ -> 4 
  C_G (C_J ((_,_))) _ -> 5 
  C_G (C_K) _ -> 6 
  C_H _ -> 7 
