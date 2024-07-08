module Program_9 () where 

 main = print $ show v_b
data B_C = C_E Int B_A | C_F B_A | C_G (B_B B_A) | C_H ((B_A,(Bool,Bool))) B_C | C_I ((B_C,B_A)) ((B_A,(Char,Int)))
data B_A = C_A ((B_C,B_A)) B_A | C_B B_C (B_B B_C)
data B_B a = C_C ((B_A,(Char,Char))) B_A | C_D

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ _ -> 0 
  C_F (C_A ((_,_)) _) -> 1 
  C_F (C_B _ _) -> 2 
  C_G (C_C ((_,_)) (C_A _ _)) -> 3 
  C_G (C_C ((_,_)) (C_B _ _)) -> 4 
  C_G (C_D) -> 5 
  C_H _ _ -> 6 
  C_I ((C_E _ _,C_A _ _)) _ -> 7 
  C_I ((C_F _,C_A _ _)) _ -> 8 
  C_I ((C_F _,C_B _ _)) _ -> 9 
  C_I ((C_G _,C_A _ _)) _ -> 10 
  C_I ((C_G _,C_B _ _)) _ -> 11 
  C_I ((C_H _ _,C_A _ _)) _ -> 12 
  C_I ((C_H _ _,C_B _ _)) _ -> 13 
  C_I ((C_I _ _,C_A _ _)) _ -> 14 
  C_I ((C_I _ _,C_B _ _)) _ -> 15 
