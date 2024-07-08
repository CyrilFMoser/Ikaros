module Program_11 () where 

 main = print $ show v_b
data B_B c = C_E (B_B ((Char,Bool))) c | C_F (B_A c c) (B_A c c) | C_G ((Bool,Char)) (B_A c c) | C_H
data B_C d = C_I
data B_D e = C_J e (B_A ((Int,Bool)) e)
data B_A a b = C_A (B_A a b) | C_B a | C_C (B_C Bool) | C_D a

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_E _ _) _ -> 0 
  C_E (C_F _ _) _ -> 1 
  C_E (C_G _ _) _ -> 2 
  C_E (C_H) _ -> 3 
  C_F (C_A (C_A _)) (C_A _) -> 4 
  C_F (C_A (C_B _)) (C_A _) -> 5 
  C_F (C_A (C_C _)) (C_A _) -> 6 
  C_F (C_A (C_D _)) (C_A _) -> 7 
  C_F (C_B _) (C_A _) -> 8 
  C_F (C_C (C_I)) (C_A _) -> 9 
  C_F (C_D _) (C_A _) -> 10 
  C_F (C_A (C_A _)) (C_B _) -> 11 
  C_F (C_A (C_B _)) (C_B _) -> 12 
  C_F (C_A (C_C _)) (C_B _) -> 13 
  C_F (C_A (C_D _)) (C_B _) -> 14 
  C_F (C_B _) (C_B _) -> 15 
  C_F (C_C (C_I)) (C_B _) -> 16 
  C_F (C_D _) (C_B _) -> 17 
  C_F (C_A (C_A _)) (C_C (C_I)) -> 18 
  C_F (C_A (C_B _)) (C_C (C_I)) -> 19 
  C_F (C_A (C_C _)) (C_C (C_I)) -> 20 
  C_F (C_A (C_D _)) (C_C (C_I)) -> 21 
  C_F (C_B _) (C_C (C_I)) -> 22 
  C_F (C_C (C_I)) (C_C (C_I)) -> 23 
  C_F (C_D _) (C_C (C_I)) -> 24 
  C_F (C_A (C_A _)) (C_D _) -> 25 
  C_F (C_A (C_B _)) (C_D _) -> 26 
  C_F (C_A (C_C _)) (C_D _) -> 27 
  C_F (C_A (C_D _)) (C_D _) -> 28 
  C_F (C_B _) (C_D _) -> 29 
  C_F (C_C (C_I)) (C_D _) -> 30 
  C_F (C_D _) (C_D _) -> 31 
  C_G _ _ -> 32 
  C_H -> 33 
