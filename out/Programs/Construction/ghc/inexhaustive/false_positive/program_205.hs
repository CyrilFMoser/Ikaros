module Program_20 () where 

 main = print $ show v_b
data B_B b c = C_F Bool ((B_C,B_C)) | C_G
data B_C = C_H ((B_C,B_C)) | C_I | C_J | C_K (B_B Int B_C)
data B_A a = C_A B_C | C_B a a | C_C (B_A a) | C_D | C_E (B_B a a) a

v_a :: B_A B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B (C_H ((_,_))) (C_H ((_,_))) -> 1 
  C_B C_I (C_H ((_,_))) -> 2 
  C_B C_J (C_H ((_,_))) -> 3 
  C_B (C_K _) (C_H ((_,_))) -> 4 
  C_B C_I C_I -> 5 
  C_B C_J C_I -> 6 
  C_B (C_K _) C_I -> 7 
  C_B (C_H ((_,_))) C_J -> 8 
  C_B C_I C_J -> 9 
  C_B C_J C_J -> 10 
  C_B (C_K _) C_J -> 11 
  C_B (C_H ((_,_))) (C_K _) -> 12 
  C_B C_I (C_K _) -> 13 
  C_B C_J (C_K _) -> 14 
  C_B (C_K _) (C_K _) -> 15 
  C_C (C_A (C_H _)) -> 16 
  C_C (C_A C_I) -> 17 
  C_C (C_A C_J) -> 18 
  C_C (C_A (C_K _)) -> 19 
  C_C (C_B _ _) -> 20 
  C_C (C_C _) -> 21 
  C_C (C_D) -> 22 
  C_C (C_E _ (C_H _)) -> 23 
  C_C (C_E _ C_I) -> 24 
  C_C (C_E _ C_J) -> 25 
  C_C (C_E _ (C_K _)) -> 26 
  C_D -> 27 
  C_E (C_F _ ((_,_))) (C_H ((_,_))) -> 28 
  C_E (C_F _ ((_,_))) C_I -> 29 
  C_E (C_F _ ((_,_))) C_J -> 30 
  C_E (C_F _ ((_,_))) (C_K (C_F _ _)) -> 31 
  C_E (C_F _ ((_,_))) (C_K (C_G)) -> 32 
  C_E (C_G) (C_H ((_,_))) -> 33 
  C_E (C_G) C_I -> 34 
  C_E (C_G) C_J -> 35 
  C_E (C_G) (C_K (C_F _ _)) -> 36 
  C_E (C_G) (C_K (C_G)) -> 37 
