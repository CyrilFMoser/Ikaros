module Program_28 () where 

 main = print $ show v_b
data B_A = C_A B_A (B_C ((Int,Int))) | C_B (B_B B_A) (B_C Bool) | C_C (B_B Char) | C_D ((Char,B_A)) (B_C Char)
data B_C b = C_G B_A | C_H | C_I B_A B_A | C_J (B_C b) Bool | C_K Int
data B_B a = C_E B_A | C_F

v_a :: B_C B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ -> 0 
  C_H -> 1 
  C_I _ (C_A (C_B _ _) (C_G _)) -> 2 
  C_I _ (C_A (C_C _) (C_G _)) -> 3 
  C_I _ (C_A (C_D _ _) (C_G _)) -> 4 
  C_I _ (C_A (C_A _ _) (C_H)) -> 5 
  C_I _ (C_A (C_B _ _) (C_H)) -> 6 
  C_I _ (C_A (C_C _) (C_H)) -> 7 
  C_I _ (C_A (C_D _ _) (C_H)) -> 8 
  C_I _ (C_A (C_A _ _) (C_I _ _)) -> 9 
  C_I _ (C_A (C_B _ _) (C_I _ _)) -> 10 
  C_I _ (C_A (C_C _) (C_I _ _)) -> 11 
  C_I _ (C_A (C_D _ _) (C_I _ _)) -> 12 
  C_I _ (C_A (C_A _ _) (C_J _ _)) -> 13 
  C_I _ (C_A (C_B _ _) (C_J _ _)) -> 14 
  C_I _ (C_A (C_C _) (C_J _ _)) -> 15 
  C_I _ (C_A (C_D _ _) (C_J _ _)) -> 16 
  C_I _ (C_A (C_A _ _) (C_K _)) -> 17 
  C_I _ (C_A (C_B _ _) (C_K _)) -> 18 
  C_I _ (C_A (C_C _) (C_K _)) -> 19 
  C_I _ (C_A (C_D _ _) (C_K _)) -> 20 
  C_I _ (C_B _ _) -> 21 
  C_I _ (C_C (C_E _)) -> 22 
  C_I _ (C_C (C_F)) -> 23 
  C_I _ (C_D ((_,_)) (C_G _)) -> 24 
  C_I _ (C_D ((_,_)) (C_H)) -> 25 
  C_I _ (C_D ((_,_)) (C_I _ _)) -> 26 
  C_I _ (C_D ((_,_)) (C_J _ _)) -> 27 
  C_I _ (C_D ((_,_)) (C_K _)) -> 28 
  C_J _ _ -> 29 
  C_K _ -> 30 
