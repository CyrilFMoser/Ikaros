module Program_27 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (((Bool,Int),B_B)) | C_C B_B (((Int,Int),B_B)) | C_D (B_A a B_B)
data B_B = C_E ((B_B,B_B)) ((B_B,Bool)) | C_F B_B Bool

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E ((C_E ((_,_)) ((_,_)),C_E ((_,_)) ((_,_)))) ((C_E ((_,_)) ((_,_)),_)) -> 0 
  C_E _ ((C_F (C_E _ _) _,_)) -> 1 
  C_E ((C_E ((_,_)) _,C_F _ _)) ((C_E _ ((_,_)),_)) -> 2 
  C_E ((C_F (C_E _ _) _,C_E _ _)) ((C_E _ _,_)) -> 3 
  C_E ((C_F _ _,C_E _ _)) ((C_E _ _,_)) -> 4 
  C_E ((C_E ((_,_)) ((_,_)),C_E ((_,_)) _)) ((C_F (C_F _ _) _,_)) -> 5 
  C_E ((C_E _ ((_,_)),C_E ((_,_)) _)) ((C_F (C_F _ _) _,_)) -> 6 
  C_E ((C_E ((_,_)) _,C_E ((_,_)) ((_,_)))) ((C_F (C_E _ _) _,_)) -> 7 
  C_E ((C_F (C_E _ _) _,C_F (C_E _ _) _)) ((C_F (C_E _ _) _,_)) -> 8 
  C_E ((C_E _ ((_,_)),C_E _ _)) ((C_F (C_E _ _) _,_)) -> 9 
  C_E ((C_F (C_E _ _) _,C_F (C_F _ _) _)) ((C_E _ _,_)) -> 10 
  C_E ((C_E _ _,C_E _ _)) ((C_E ((_,_)) _,_)) -> 11 
  C_E ((C_F _ _,C_E _ ((_,_)))) ((C_E _ ((_,_)),_)) -> 12 
  C_E ((C_F _ _,C_F (C_E _ _) _)) _ -> 13 
  C_E ((C_F _ _,C_F (C_E _ _) _)) ((C_E _ _,_)) -> 14 
