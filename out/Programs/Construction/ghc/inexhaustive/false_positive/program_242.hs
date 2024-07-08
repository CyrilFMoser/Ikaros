module Program_25 () where 

 main = print $ show v_b
data B_B c = C_F (((Char,Char),(Bool,Int))) | C_G | C_H Char
data B_A a b = C_A (B_C Int b) | C_B (((Bool,Char),Char)) | C_C | C_D (B_A b b) | C_E
data B_C d e = C_I d | C_J | C_K ((Char,Char))

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B (((_,_),_)) -> 1 
  C_C -> 2 
  C_D (C_A (C_I _)) -> 3 
  C_D (C_A (C_J)) -> 4 
  C_D (C_A (C_K _)) -> 5 
  C_D (C_B ((_,_))) -> 6 
  C_D (C_C) -> 7 
  C_D (C_D (C_B _)) -> 8 
  C_D (C_D (C_C)) -> 9 
  C_D (C_D (C_D _)) -> 10 
  C_D (C_D (C_E)) -> 11 
  C_D (C_E) -> 12 
  C_E -> 13 
