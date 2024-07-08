module Program_17 () where 

 main = print $ show v_b
data B_B a = C_E
data B_A = C_A (B_B Char) (B_B ((Int,Char))) | C_B B_A | C_C (((Bool,Int),(Char,Char))) B_A | C_D ((B_A,B_A))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B (C_A _ _) -> 1 
  C_B (C_B _) -> 2 
  C_B (C_C ((_,_)) _) -> 3 
  C_B (C_D _) -> 4 
  C_C _ _ -> 5 
  C_D ((C_A _ _,C_A _ _)) -> 6 
  C_D ((C_A _ _,C_B _)) -> 7 
  C_D ((C_A _ _,C_C _ _)) -> 8 
  C_D ((C_A _ _,C_D _)) -> 9 
  C_D ((C_B _,C_A _ _)) -> 10 
  C_D ((C_B _,C_C _ _)) -> 11 
  C_D ((C_B _,C_D _)) -> 12 
  C_D ((C_C _ _,C_A _ _)) -> 13 
  C_D ((C_C _ _,C_B _)) -> 14 
  C_D ((C_C _ _,C_C _ _)) -> 15 
  C_D ((C_C _ _,C_D _)) -> 16 
  C_D ((C_D _,C_A _ _)) -> 17 
  C_D ((C_D _,C_B _)) -> 18 
  C_D ((C_D _,C_C _ _)) -> 19 
  C_D ((C_D _,C_D _)) -> 20 
