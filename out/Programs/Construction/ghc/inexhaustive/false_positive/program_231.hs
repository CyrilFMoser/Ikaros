module Program_15 () where 

 main = print $ show v_b
data B_C = C_I B_A B_B | C_J | C_K | C_L B_B B_A | C_M B_A B_C
data B_A = C_A B_A (((Int,Char),(Char,Char))) | C_B ((B_A,B_A)) ((B_C,(Bool,Bool))) | C_C Int B_A
data B_B = C_D B_A | C_E B_A B_C | C_F | C_G (((Char,Int),B_A)) B_A | C_H B_A B_C

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ -> 0 
  C_E (C_A (C_A _ _) ((_,_))) _ -> 1 
  C_E (C_A (C_B _ _) ((_,_))) _ -> 2 
  C_E (C_A (C_C _ _) ((_,_))) _ -> 3 
  C_E (C_B ((_,_)) ((_,_))) _ -> 4 
  C_E (C_C _ (C_A _ _)) _ -> 5 
  C_E (C_C _ (C_B _ _)) _ -> 6 
  C_F -> 7 
  C_G (((_,_),C_A _ _)) (C_A (C_A _ _) ((_,_))) -> 8 
  C_G (((_,_),C_B _ _)) (C_A (C_A _ _) ((_,_))) -> 9 
  C_G (((_,_),C_C _ _)) (C_A (C_A _ _) ((_,_))) -> 10 
  C_G (((_,_),C_A _ _)) (C_A (C_B _ _) ((_,_))) -> 11 
  C_G (((_,_),C_B _ _)) (C_A (C_B _ _) ((_,_))) -> 12 
  C_G (((_,_),C_C _ _)) (C_A (C_B _ _) ((_,_))) -> 13 
  C_G (((_,_),C_A _ _)) (C_A (C_C _ _) ((_,_))) -> 14 
  C_G (((_,_),C_B _ _)) (C_A (C_C _ _) ((_,_))) -> 15 
  C_G (((_,_),C_C _ _)) (C_A (C_C _ _) ((_,_))) -> 16 
  C_G (((_,_),C_A _ _)) (C_B ((_,_)) ((_,_))) -> 17 
  C_G (((_,_),C_B _ _)) (C_B ((_,_)) ((_,_))) -> 18 
  C_G (((_,_),C_C _ _)) (C_B ((_,_)) ((_,_))) -> 19 
  C_G (((_,_),C_A _ _)) (C_C _ _) -> 20 
  C_G (((_,_),C_B _ _)) (C_C _ _) -> 21 
  C_G (((_,_),C_C _ _)) (C_C _ _) -> 22 
  C_H (C_A _ _) (C_I _ _) -> 23 
  C_H (C_A _ _) C_J -> 24 
  C_H (C_A _ _) C_K -> 25 
  C_H (C_A _ _) (C_L _ _) -> 26 
  C_H (C_A _ _) (C_M _ _) -> 27 
  C_H (C_B ((_,_)) _) (C_I _ _) -> 28 
  C_H (C_B ((_,_)) _) C_J -> 29 
  C_H (C_B ((_,_)) _) C_K -> 30 
  C_H (C_B ((_,_)) _) (C_L _ _) -> 31 
  C_H (C_B ((_,_)) _) (C_M _ _) -> 32 
  C_H (C_C _ (C_A _ _)) (C_I _ _) -> 33 
  C_H (C_C _ (C_A _ _)) C_J -> 34 
  C_H (C_C _ (C_A _ _)) C_K -> 35 
  C_H (C_C _ (C_A _ _)) (C_L _ _) -> 36 
  C_H (C_C _ (C_A _ _)) (C_M _ _) -> 37 
  C_H (C_C _ (C_B _ _)) (C_I _ _) -> 38 
  C_H (C_C _ (C_B _ _)) C_J -> 39 
  C_H (C_C _ (C_B _ _)) C_K -> 40 
  C_H (C_C _ (C_B _ _)) (C_L _ _) -> 41 
  C_H (C_C _ (C_B _ _)) (C_M _ _) -> 42 
  C_H (C_C _ (C_C _ _)) (C_I _ _) -> 43 
  C_H (C_C _ (C_C _ _)) C_J -> 44 
  C_H (C_C _ (C_C _ _)) C_K -> 45 
  C_H (C_C _ (C_C _ _)) (C_L _ _) -> 46 
  C_H (C_C _ (C_C _ _)) (C_M _ _) -> 47 
