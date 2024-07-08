module Program_5 () where 

 main = print $ show v_b
data B_C b = C_H B_A B_A | C_I | C_J (B_C b)
data B_A = C_A ((B_A,B_A)) B_A | C_B B_A | C_C ((B_A,(Char,Int))) B_A
data B_B a = C_D (B_C a) | C_E B_A (B_C a) | C_F (B_B B_A) (B_C a) | C_G Int

v_a :: B_C Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_H (C_A ((_,_)) (C_A _ _)) (C_A _ _) -> 0 
  C_H (C_A ((_,_)) (C_B _)) (C_A _ _) -> 1 
  C_H (C_A ((_,_)) (C_C _ _)) (C_A _ _) -> 2 
  C_H (C_B _) (C_A _ _) -> 3 
  C_H (C_C ((_,_)) (C_A _ _)) (C_A _ _) -> 4 
  C_H (C_C ((_,_)) (C_B _)) (C_A _ _) -> 5 
  C_H (C_C ((_,_)) (C_C _ _)) (C_A _ _) -> 6 
  C_H (C_A ((_,_)) (C_A _ _)) (C_B (C_A _ _)) -> 7 
  C_H (C_A ((_,_)) (C_B _)) (C_B (C_A _ _)) -> 8 
  C_H (C_A ((_,_)) (C_C _ _)) (C_B (C_A _ _)) -> 9 
  C_H (C_B _) (C_B (C_A _ _)) -> 10 
  C_H (C_C ((_,_)) (C_A _ _)) (C_B (C_A _ _)) -> 11 
  C_H (C_C ((_,_)) (C_B _)) (C_B (C_A _ _)) -> 12 
  C_H (C_A ((_,_)) (C_A _ _)) (C_B (C_B _)) -> 13 
  C_H (C_A ((_,_)) (C_B _)) (C_B (C_B _)) -> 14 
  C_H (C_A ((_,_)) (C_C _ _)) (C_B (C_B _)) -> 15 
  C_H (C_B _) (C_B (C_B _)) -> 16 
  C_H (C_C ((_,_)) (C_A _ _)) (C_B (C_B _)) -> 17 
  C_H (C_C ((_,_)) (C_B _)) (C_B (C_B _)) -> 18 
  C_H (C_C ((_,_)) (C_C _ _)) (C_B (C_B _)) -> 19 
  C_H (C_A ((_,_)) (C_A _ _)) (C_B (C_C _ _)) -> 20 
  C_H (C_A ((_,_)) (C_B _)) (C_B (C_C _ _)) -> 21 
  C_H (C_A ((_,_)) (C_C _ _)) (C_B (C_C _ _)) -> 22 
  C_H (C_B _) (C_B (C_C _ _)) -> 23 
  C_H (C_C ((_,_)) (C_A _ _)) (C_B (C_C _ _)) -> 24 
  C_H (C_C ((_,_)) (C_B _)) (C_B (C_C _ _)) -> 25 
  C_H (C_C ((_,_)) (C_C _ _)) (C_B (C_C _ _)) -> 26 
  C_H (C_A ((_,_)) (C_A _ _)) (C_C _ _) -> 27 
  C_H (C_A ((_,_)) (C_B _)) (C_C _ _) -> 28 
  C_H (C_A ((_,_)) (C_C _ _)) (C_C _ _) -> 29 
  C_H (C_B _) (C_C _ _) -> 30 
  C_H (C_C ((_,_)) (C_A _ _)) (C_C _ _) -> 31 
  C_H (C_C ((_,_)) (C_B _)) (C_C _ _) -> 32 
  C_H (C_C ((_,_)) (C_C _ _)) (C_C _ _) -> 33 
  C_I -> 34 
  C_J _ -> 35 
