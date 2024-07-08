module Program_31 () where 

 main = print $ show v_b
data B_A a b = C_A B_B | C_B (B_A B_B a) Bool | C_C b | C_D Bool
data B_B = C_E B_B B_B | C_F B_C Int
data B_C = C_G B_B B_C | C_H (B_A ((Bool,Bool)) ((Char,Int))) | C_I B_C Char | C_J (B_A B_C ((Char,Int)))

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G (C_E (C_E _ _) (C_E _ _)) (C_G _ (C_G _ _)) -> 0 
  C_G (C_E (C_E _ _) (C_F _ _)) (C_G _ (C_G _ _)) -> 1 
  C_G (C_E (C_F _ _) (C_E _ _)) (C_G _ (C_G _ _)) -> 2 
  C_G (C_E (C_F _ _) (C_F _ _)) (C_G _ (C_G _ _)) -> 3 
  C_G (C_F _ _) (C_G _ (C_G _ _)) -> 4 
  C_G (C_E (C_E _ _) (C_E _ _)) (C_G _ (C_H _)) -> 5 
  C_G (C_E (C_E _ _) (C_F _ _)) (C_G _ (C_H _)) -> 6 
  C_G (C_E (C_F _ _) (C_E _ _)) (C_G _ (C_H _)) -> 7 
  C_G (C_F _ _) (C_G _ (C_H _)) -> 8 
  C_G (C_E (C_E _ _) (C_E _ _)) (C_G _ (C_I _ _)) -> 9 
  C_G (C_E (C_E _ _) (C_F _ _)) (C_G _ (C_I _ _)) -> 10 
  C_G (C_E (C_F _ _) (C_E _ _)) (C_G _ (C_I _ _)) -> 11 
  C_G (C_E (C_F _ _) (C_F _ _)) (C_G _ (C_I _ _)) -> 12 
  C_G (C_F _ _) (C_G _ (C_I _ _)) -> 13 
  C_G (C_E (C_E _ _) (C_E _ _)) (C_G _ (C_J _)) -> 14 
  C_G (C_E (C_E _ _) (C_F _ _)) (C_G _ (C_J _)) -> 15 
  C_G (C_E (C_F _ _) (C_E _ _)) (C_G _ (C_J _)) -> 16 
  C_G (C_E (C_F _ _) (C_F _ _)) (C_G _ (C_J _)) -> 17 
  C_G (C_F _ _) (C_G _ (C_J _)) -> 18 
  C_G (C_E (C_E _ _) (C_E _ _)) (C_H (C_A _)) -> 19 
  C_G (C_E (C_E _ _) (C_F _ _)) (C_H (C_A _)) -> 20 
  C_G (C_E (C_F _ _) (C_E _ _)) (C_H (C_A _)) -> 21 
  C_G (C_E (C_F _ _) (C_F _ _)) (C_H (C_A _)) -> 22 
  C_G (C_F _ _) (C_H (C_A _)) -> 23 
  C_G (C_E (C_E _ _) (C_E _ _)) (C_H (C_B _ _)) -> 24 
  C_G (C_E (C_E _ _) (C_F _ _)) (C_H (C_B _ _)) -> 25 
  C_G (C_E (C_F _ _) (C_E _ _)) (C_H (C_B _ _)) -> 26 
  C_G (C_E (C_F _ _) (C_F _ _)) (C_H (C_B _ _)) -> 27 
  C_G (C_F _ _) (C_H (C_B _ _)) -> 28 
  C_G (C_E (C_E _ _) (C_E _ _)) (C_H (C_C _)) -> 29 
  C_G (C_E (C_E _ _) (C_F _ _)) (C_H (C_C _)) -> 30 
  C_G (C_E (C_F _ _) (C_E _ _)) (C_H (C_C _)) -> 31 
  C_G (C_E (C_F _ _) (C_F _ _)) (C_H (C_C _)) -> 32 
  C_G (C_F _ _) (C_H (C_C _)) -> 33 
  C_G (C_E (C_E _ _) (C_E _ _)) (C_H (C_D _)) -> 34 
  C_G (C_E (C_E _ _) (C_F _ _)) (C_H (C_D _)) -> 35 
  C_G (C_E (C_F _ _) (C_E _ _)) (C_H (C_D _)) -> 36 
  C_G (C_E (C_F _ _) (C_F _ _)) (C_H (C_D _)) -> 37 
  C_G (C_F _ _) (C_H (C_D _)) -> 38 
  C_G (C_E (C_E _ _) (C_E _ _)) (C_I _ _) -> 39 
  C_G (C_E (C_E _ _) (C_F _ _)) (C_I _ _) -> 40 
  C_G (C_E (C_F _ _) (C_E _ _)) (C_I _ _) -> 41 
  C_G (C_E (C_F _ _) (C_F _ _)) (C_I _ _) -> 42 
  C_G (C_F _ _) (C_I _ _) -> 43 
  C_G (C_E (C_E _ _) (C_E _ _)) (C_J (C_A _)) -> 44 
  C_G (C_E (C_E _ _) (C_F _ _)) (C_J (C_A _)) -> 45 
  C_G (C_E (C_F _ _) (C_E _ _)) (C_J (C_A _)) -> 46 
  C_G (C_E (C_F _ _) (C_F _ _)) (C_J (C_A _)) -> 47 
  C_G (C_F _ _) (C_J (C_A _)) -> 48 
  C_G (C_E (C_E _ _) (C_E _ _)) (C_J (C_B _ _)) -> 49 
  C_G (C_E (C_E _ _) (C_F _ _)) (C_J (C_B _ _)) -> 50 
  C_G (C_E (C_F _ _) (C_E _ _)) (C_J (C_B _ _)) -> 51 
  C_G (C_E (C_F _ _) (C_F _ _)) (C_J (C_B _ _)) -> 52 
  C_G (C_F _ _) (C_J (C_B _ _)) -> 53 
  C_G (C_E (C_E _ _) (C_E _ _)) (C_J (C_C _)) -> 54 
  C_G (C_E (C_E _ _) (C_F _ _)) (C_J (C_C _)) -> 55 
  C_G (C_E (C_F _ _) (C_E _ _)) (C_J (C_C _)) -> 56 
  C_G (C_E (C_F _ _) (C_F _ _)) (C_J (C_C _)) -> 57 
  C_G (C_F _ _) (C_J (C_C _)) -> 58 
  C_G (C_E (C_E _ _) (C_E _ _)) (C_J (C_D _)) -> 59 
  C_G (C_E (C_E _ _) (C_F _ _)) (C_J (C_D _)) -> 60 
  C_G (C_E (C_F _ _) (C_E _ _)) (C_J (C_D _)) -> 61 
  C_G (C_E (C_F _ _) (C_F _ _)) (C_J (C_D _)) -> 62 
  C_G (C_F _ _) (C_J (C_D _)) -> 63 
  C_H _ -> 64 
  C_I _ _ -> 65 
  C_J (C_A (C_E _ _)) -> 66 
  C_J (C_A (C_F _ _)) -> 67 
  C_J (C_B (C_A _) _) -> 68 
  C_J (C_B (C_B _ _) _) -> 69 
  C_J (C_B (C_C _) _) -> 70 
  C_J (C_B (C_D _) _) -> 71 
  C_J (C_C ((_,_))) -> 72 
  C_J (C_D _) -> 73 
