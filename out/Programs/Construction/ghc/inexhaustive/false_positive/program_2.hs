module Program_10 () where 

 main = print $ show v_b
data B_B b c = C_F | C_G (B_A b) | C_H | C_I (B_B b b) | C_J
data B_A a = C_A (B_A a) | C_B ((Int,Int)) (B_B a a) | C_C Int Int | C_D (B_A a) | C_E (B_B a a) ((Bool,(Int,Bool)))

v_a :: B_B Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_G (C_A _) -> 1 
  C_G (C_B ((_,_)) (C_F)) -> 2 
  C_G (C_B ((_,_)) (C_G _)) -> 3 
  C_G (C_B ((_,_)) (C_H)) -> 4 
  C_G (C_B ((_,_)) (C_J)) -> 5 
  C_G (C_C _ _) -> 6 
  C_G (C_D (C_A _)) -> 7 
  C_G (C_D (C_B _ _)) -> 8 
  C_G (C_D (C_C _ _)) -> 9 
  C_G (C_D (C_D _)) -> 10 
  C_G (C_D (C_E _ _)) -> 11 
  C_G (C_E (C_F) ((_,_))) -> 12 
  C_G (C_E (C_G _) ((_,_))) -> 13 
  C_G (C_E (C_H) ((_,_))) -> 14 
  C_G (C_E (C_I _) ((_,_))) -> 15 
  C_G (C_E (C_J) ((_,_))) -> 16 
  C_H -> 17 
  C_I (C_F) -> 18 
  C_I (C_G (C_A _)) -> 19 
  C_I (C_G (C_B _ _)) -> 20 
  C_I (C_G (C_C _ _)) -> 21 
  C_I (C_G (C_D _)) -> 22 
  C_I (C_G (C_E _ _)) -> 23 
  C_I (C_H) -> 24 
  C_I (C_I (C_F)) -> 25 
  C_I (C_I (C_G _)) -> 26 
  C_I (C_I (C_H)) -> 27 
  C_I (C_I (C_I _)) -> 28 
  C_I (C_I (C_J)) -> 29 
  C_I (C_J) -> 30 
  C_J -> 31 
