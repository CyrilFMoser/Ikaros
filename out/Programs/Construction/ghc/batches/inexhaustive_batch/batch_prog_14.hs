module Program_14 () where 

 main = print $ show v_b
data B_A = C_A (B_B B_D)
data B_D = C_J | C_K (B_B B_D) | C_L | C_M ((B_A,(Bool,Int))) Char | C_N
data B_B a = C_B | C_C B_A ((B_D,B_A)) | C_D (B_C a B_A) Int | C_E (B_C a a) (B_C a a) | C_F B_D B_D
data B_C b c = C_G B_D | C_H (B_C c c) | C_I

v_a :: B_B B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C (C_A _) ((C_J,C_A _)) -> 1 
  C_C (C_A _) ((C_K _,C_A _)) -> 2 
  C_C (C_A _) ((C_L,C_A _)) -> 3 
  C_C (C_A _) ((C_M _ _,C_A _)) -> 4 
  C_C (C_A _) ((C_N,C_A _)) -> 5 
  C_E _ (C_G _) -> 6 
  C_E _ (C_H _) -> 7 
  C_E _ (C_I) -> 8 
  C_F C_J C_J -> 9 
  C_F (C_K (C_B)) C_J -> 10 
  C_F (C_K (C_C _ _)) C_J -> 11 
  C_F (C_K (C_D _ _)) C_J -> 12 
  C_F (C_K (C_E _ _)) C_J -> 13 
  C_F (C_K (C_F _ _)) C_J -> 14 
  C_F C_L C_J -> 15 
  C_F (C_M _ _) C_J -> 16 
  C_F C_N C_J -> 17 
  C_F C_J (C_K (C_B)) -> 18 
  C_F (C_K (C_B)) (C_K (C_B)) -> 19 
  C_F (C_K (C_C _ _)) (C_K (C_B)) -> 20 
  C_F (C_K (C_D _ _)) (C_K (C_B)) -> 21 
  C_F (C_K (C_E _ _)) (C_K (C_B)) -> 22 
  C_F (C_K (C_F _ _)) (C_K (C_B)) -> 23 
  C_F C_L (C_K (C_B)) -> 24 
  C_F (C_M _ _) (C_K (C_B)) -> 25 
  C_F C_N (C_K (C_B)) -> 26 
  C_F C_J (C_K (C_C _ _)) -> 27 
  C_F (C_K (C_B)) (C_K (C_C _ _)) -> 28 
  C_F (C_K (C_C _ _)) (C_K (C_C _ _)) -> 29 
  C_F (C_K (C_D _ _)) (C_K (C_C _ _)) -> 30 
  C_F (C_K (C_E _ _)) (C_K (C_C _ _)) -> 31 
  C_F (C_K (C_F _ _)) (C_K (C_C _ _)) -> 32 
  C_F C_L (C_K (C_C _ _)) -> 33 
  C_F (C_M _ _) (C_K (C_C _ _)) -> 34 
  C_F C_N (C_K (C_C _ _)) -> 35 
  C_F C_J (C_K (C_D _ _)) -> 36 
  C_F (C_K (C_B)) (C_K (C_D _ _)) -> 37 
  C_F (C_K (C_C _ _)) (C_K (C_D _ _)) -> 38 
  C_F (C_K (C_D _ _)) (C_K (C_D _ _)) -> 39 
  C_F (C_K (C_E _ _)) (C_K (C_D _ _)) -> 40 
  C_F (C_K (C_F _ _)) (C_K (C_D _ _)) -> 41 
  C_F C_L (C_K (C_D _ _)) -> 42 
  C_F (C_M _ _) (C_K (C_D _ _)) -> 43 
  C_F C_N (C_K (C_D _ _)) -> 44 
  C_F C_J (C_K (C_E _ _)) -> 45 
  C_F (C_K (C_B)) (C_K (C_E _ _)) -> 46 
  C_F (C_K (C_C _ _)) (C_K (C_E _ _)) -> 47 
  C_F (C_K (C_D _ _)) (C_K (C_E _ _)) -> 48 
  C_F (C_K (C_E _ _)) (C_K (C_E _ _)) -> 49 
  C_F (C_K (C_F _ _)) (C_K (C_E _ _)) -> 50 
  C_F C_L (C_K (C_E _ _)) -> 51 
  C_F (C_M _ _) (C_K (C_E _ _)) -> 52 
  C_F C_N (C_K (C_E _ _)) -> 53 
  C_F C_J (C_K (C_F _ _)) -> 54 
  C_F (C_K (C_B)) (C_K (C_F _ _)) -> 55 
  C_F (C_K (C_C _ _)) (C_K (C_F _ _)) -> 56 
  C_F (C_K (C_D _ _)) (C_K (C_F _ _)) -> 57 
  C_F (C_K (C_E _ _)) (C_K (C_F _ _)) -> 58 
  C_F (C_K (C_F _ _)) (C_K (C_F _ _)) -> 59 
  C_F C_L (C_K (C_F _ _)) -> 60 
  C_F (C_M _ _) (C_K (C_F _ _)) -> 61 
  C_F C_N (C_K (C_F _ _)) -> 62 
  C_F C_J C_L -> 63 
  C_F (C_K (C_B)) C_L -> 64 
  C_F (C_K (C_C _ _)) C_L -> 65 
  C_F (C_K (C_D _ _)) C_L -> 66 
  C_F (C_K (C_E _ _)) C_L -> 67 
  C_F (C_K (C_F _ _)) C_L -> 68 
  C_F C_L C_L -> 69 
  C_F (C_M _ _) C_L -> 70 
  C_F C_N C_L -> 71 
  C_F C_J (C_M ((_,_)) 'x') -> 72 
  C_F (C_K (C_B)) (C_M ((_,_)) 'x') -> 73 
  C_F (C_K (C_C _ _)) (C_M ((_,_)) 'x') -> 74 
  C_F (C_K (C_D _ _)) (C_M ((_,_)) 'x') -> 75 
  C_F (C_K (C_E _ _)) (C_M ((_,_)) 'x') -> 76 
  C_F (C_K (C_F _ _)) (C_M ((_,_)) 'x') -> 77 
  C_F C_L (C_M ((_,_)) 'x') -> 78 
  C_F (C_M _ _) (C_M ((_,_)) 'x') -> 79 
  C_F C_N (C_M ((_,_)) 'x') -> 80 
  C_F C_J (C_M ((_,_)) _) -> 81 
  C_F (C_K (C_B)) (C_M ((_,_)) _) -> 82 
  C_F (C_K (C_C _ _)) (C_M ((_,_)) _) -> 83 
  C_F (C_K (C_D _ _)) (C_M ((_,_)) _) -> 84 
  C_F (C_K (C_E _ _)) (C_M ((_,_)) _) -> 85 
  C_F (C_K (C_F _ _)) (C_M ((_,_)) _) -> 86 
  C_F C_L (C_M ((_,_)) _) -> 87 
  C_F (C_M _ _) (C_M ((_,_)) _) -> 88 
  C_F C_N (C_M ((_,_)) _) -> 89 
  C_F C_J C_N -> 90 
  C_F (C_K (C_B)) C_N -> 91 
  C_F (C_K (C_C _ _)) C_N -> 92 
  C_F (C_K (C_D _ _)) C_N -> 93 
  C_F (C_K (C_E _ _)) C_N -> 94 
  C_F (C_K (C_F _ _)) C_N -> 95 
  C_F C_L C_N -> 96 
  C_F (C_M _ _) C_N -> 97 
  C_F C_N C_N -> 98 
