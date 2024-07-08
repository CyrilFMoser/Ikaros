module Program_14 () where 

 main = print $ show v_b
data B_B b c = C_F (B_B c c) | C_G
data B_A a = C_A | C_B | C_C | C_D ((Char,Int)) ((Bool,Char)) | C_E (B_A a) (((Char,Int),(Int,Char)))
data B_C d = C_H (B_A d) | C_I
data B_D e = C_J | C_K (B_C e) (B_B e e)

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B -> 1 
  C_C -> 2 
  C_D ((_,_)) ((_,'x')) -> 3 
  C_D ((_,_)) ((_,_)) -> 4 
  C_E (C_A) (((_,_),(_,_))) -> 5 
  C_E (C_B) (((_,_),(_,_))) -> 6 
  C_E (C_C) (((_,_),(_,_))) -> 7 
  C_E (C_D ((_,_)) ((_,_))) (((_,_),(_,_))) -> 8 
  C_E (C_E (C_A) ((_,_))) (((_,_),(_,_))) -> 9 
  C_E (C_E (C_B) ((_,_))) (((_,_),(_,_))) -> 10 
  C_E (C_E (C_C) ((_,_))) (((_,_),(_,_))) -> 11 
  C_E (C_E (C_E _ _) ((_,_))) (((_,_),(_,_))) -> 12 
