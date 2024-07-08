module Program_11 () where 

 main = print $ show v_b
data B_A = C_A (B_B B_A B_A) | C_B B_A | C_C (((Int,Int),B_A)) B_A
data B_B a b = C_D

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_C (((_,_),C_C _ _)) (C_C _ _)) -> 0 
  C_B (C_C _ (C_B _)) -> 1 
  C_C (((_,_),C_B (C_C _ _))) (C_B (C_A _)) -> 2 
  C_C (((_,_),C_B (C_A _))) (C_C _ (C_A _)) -> 3 
  C_C (((_,_),C_B (C_B _))) (C_B (C_B _)) -> 4 
  C_C (((_,_),C_C _ _)) (C_C (((_,_),C_C _ _)) (C_C _ _)) -> 5 
  C_C (((_,_),C_C _ (C_B _))) (C_C (((_,_),C_C _ _)) (C_B _)) -> 6 
  C_C (((_,_),C_C _ (C_B _))) (C_B _) -> 7 
  C_C (((_,_),C_C ((_,_)) (C_B _))) (C_A (C_D)) -> 8 
  C_C (((_,_),C_A (C_D))) (C_A (C_D)) -> 9 
  C_C (((_,_),C_A _)) (C_C (((_,_),C_A _)) _) -> 10 
  C_C (((_,_),C_C _ (C_C _ _))) (C_C _ (C_A _)) -> 11 
  C_C (((_,_),C_B (C_B _))) (C_C (((_,_),C_A _)) (C_B _)) -> 12 
  C_C _ (C_C (((_,_),C_B _)) (C_A _)) -> 13 
  C_C (((_,_),C_C ((_,_)) _)) (C_B (C_A _)) -> 14 
  C_C (((_,_),C_C ((_,_)) _)) (C_A (C_D)) -> 15 
  C_C (((_,_),C_C ((_,_)) (C_C _ _))) (C_C (((_,_),C_C _ _)) _) -> 16 
  C_C (((_,_),C_B _)) (C_C (((_,_),C_B _)) (C_C _ _)) -> 17 
  C_C (((_,_),C_C _ (C_B _))) (C_C (((_,_),C_B _)) (C_C _ _)) -> 18 
  C_C (((_,_),C_B (C_C _ _))) (C_C _ _) -> 19 
  C_C (((_,_),C_C ((_,_)) (C_B _))) (C_B (C_C _ _)) -> 20 
  C_C (((_,_),C_C _ (C_C _ _))) (C_C (((_,_),C_B _)) (C_A _)) -> 21 
  C_C (((_,_),C_B (C_B _))) (C_C (((_,_),C_B _)) (C_A _)) -> 22 
  C_C (((_,_),C_C ((_,_)) (C_C _ _))) (C_C (((_,_),C_A _)) (C_B _)) -> 23 
  C_C (((_,_),C_B (C_B _))) (C_C _ (C_C _ _)) -> 24 
  C_C (((_,_),C_C ((_,_)) (C_A _))) (C_C (((_,_),C_A _)) (C_C _ _)) -> 25 
  C_C (((_,_),C_C _ (C_B _))) (C_B (C_C _ _)) -> 26 
  C_C (((_,_),C_B (C_A _))) (C_B (C_B _)) -> 27 
  C_C (((_,_),C_C ((_,_)) (C_C _ _))) (C_C _ _) -> 28 
  C_C (((_,_),C_C _ (C_A _))) (C_C (((_,_),C_A _)) (C_C _ _)) -> 29 
  C_C (((_,_),C_C ((_,_)) (C_C _ _))) _ -> 30 
  C_C (((_,_),C_C ((_,_)) _)) (C_C (((_,_),C_C _ _)) (C_A _)) -> 31 
  C_C (((_,_),C_C ((_,_)) (C_A _))) (C_C (((_,_),C_B _)) (C_B _)) -> 32 
  C_C (((_,_),C_C ((_,_)) (C_C _ _))) (C_C (((_,_),C_B _)) (C_C _ _)) -> 33 
  C_C (((_,_),C_A _)) (C_C (((_,_),C_B _)) (C_A _)) -> 34 
  C_C (((_,_),C_B (C_C _ _))) (C_B (C_C _ _)) -> 35 
  C_C (((_,_),C_C _ (C_C _ _))) (C_C _ _) -> 36 
  C_C (((_,_),C_C ((_,_)) (C_A _))) (C_C (((_,_),C_A _)) _) -> 37 
  C_C (((_,_),C_B (C_B _))) (C_B (C_A _)) -> 38 
  C_C (((_,_),C_C ((_,_)) (C_B _))) (C_C (((_,_),C_B _)) (C_C _ _)) -> 39 
  C_C (((_,_),C_B (C_C _ _))) (C_A (C_D)) -> 40 
  C_C (((_,_),C_C _ (C_A _))) (C_C (((_,_),C_B _)) (C_C _ _)) -> 41 
  C_C (((_,_),C_C _ (C_B _))) (C_A _) -> 42 
  C_C (((_,_),C_B (C_C _ _))) (C_C _ (C_A _)) -> 43 
  C_C (((_,_),C_C _ (C_A _))) (C_C (((_,_),C_C _ _)) (C_B _)) -> 44 
  C_C (((_,_),C_C ((_,_)) (C_C _ _))) (C_C _ (C_C _ _)) -> 45 
  C_C (((_,_),C_C _ (C_C _ _))) _ -> 46 
  C_C (((_,_),C_C ((_,_)) (C_C _ _))) (C_C (((_,_),C_A _)) _) -> 47 
  C_C (((_,_),C_C _ _)) (C_C (((_,_),C_B _)) (C_B _)) -> 48 
  C_C (((_,_),C_C _ (C_C _ _))) (C_C _ (C_B _)) -> 49 
  C_C (((_,_),C_C _ (C_B _))) (C_C (((_,_),C_A _)) (C_A _)) -> 50 
  C_C (((_,_),C_C ((_,_)) _)) (C_C (((_,_),C_B _)) (C_A _)) -> 51 
  C_C (((_,_),C_C ((_,_)) (C_A _))) (C_C (((_,_),C_C _ _)) (C_C _ _)) -> 52 
  C_C (((_,_),C_C ((_,_)) (C_A _))) (C_C (((_,_),C_A _)) (C_A _)) -> 53 
  C_C (((_,_),C_C _ _)) (C_B (C_A _)) -> 54 
  C_C (((_,_),C_B (C_A _))) (C_B _) -> 55 
  C_C (((_,_),C_C ((_,_)) (C_C _ _))) (C_B _) -> 56 
  C_C (((_,_),C_C ((_,_)) (C_B _))) (C_C _ (C_B _)) -> 57 
  C_C (((_,_),C_C ((_,_)) (C_C _ _))) (C_B (C_B _)) -> 58 
  C_C (((_,_),C_C _ _)) (C_C (((_,_),C_C _ _)) _) -> 59 
  C_C (((_,_),C_B _)) (C_C (((_,_),C_C _ _)) (C_B _)) -> 60 
  C_C (((_,_),C_B (C_A _))) (C_C (((_,_),C_C _ _)) (C_B _)) -> 61 
  C_C (((_,_),C_B (C_B _))) (C_C _ _) -> 62 
  C_C (((_,_),C_B (C_A _))) (C_B (C_C _ _)) -> 63 
  C_C (((_,_),C_A _)) (C_C (((_,_),C_C _ _)) (C_C _ _)) -> 64 
  C_C (((_,_),C_C _ (C_B _))) (C_C _ _) -> 65 
  C_C (((_,_),C_A _)) (C_C (((_,_),C_C _ _)) _) -> 66 
  C_C (((_,_),C_C _ (C_A _))) (C_B (C_B _)) -> 67 
  C_C (((_,_),C_B (C_C _ _))) (C_C (((_,_),C_A _)) _) -> 68 
  C_C (((_,_),C_B _)) (C_C _ _) -> 69 
  C_C (((_,_),C_C ((_,_)) (C_A _))) (C_C (((_,_),C_A _)) (C_B _)) -> 70 
  C_C (((_,_),C_B (C_B _))) (C_A _) -> 71 
  C_C (((_,_),C_C ((_,_)) (C_B _))) (C_C (((_,_),C_B _)) (C_B _)) -> 72 
  C_C (((_,_),C_B (C_B _))) (C_C _ (C_A _)) -> 73 
  C_C (((_,_),C_C _ (C_C _ _))) (C_B (C_C _ _)) -> 74 
  C_C (((_,_),C_C _ (C_A _))) (C_C (((_,_),C_B _)) _) -> 75 
  C_C (((_,_),C_C _ (C_C _ _))) (C_C (((_,_),C_A _)) _) -> 76 
  C_C (((_,_),C_B (C_C _ _))) (C_C (((_,_),C_B _)) (C_A _)) -> 77 
  C_C (((_,_),C_C _ (C_B _))) (C_C (((_,_),C_B _)) (C_A _)) -> 78 
  C_C (((_,_),C_A (C_D))) (C_B _) -> 79 
  C_C (((_,_),C_C ((_,_)) (C_A _))) (C_C (((_,_),C_B _)) _) -> 80 
  C_C (((_,_),C_C ((_,_)) (C_A _))) (C_C _ (C_C _ _)) -> 81 
  C_C (((_,_),C_C _ (C_C _ _))) (C_A _) -> 82 
  C_C (((_,_),C_B (C_A _))) (C_C (((_,_),C_B _)) (C_C _ _)) -> 83 
  C_C (((_,_),C_C _ _)) (C_C _ _) -> 84 
  C_C (((_,_),C_C ((_,_)) (C_B _))) (C_B (C_B _)) -> 85 
  C_C (((_,_),C_C ((_,_)) (C_B _))) (C_C (((_,_),C_C _ _)) _) -> 86 
  C_C (((_,_),C_A (C_D))) (C_A _) -> 87 
  C_C (((_,_),C_B _)) (C_C (((_,_),C_A _)) (C_B _)) -> 88 
  C_C (((_,_),C_C ((_,_)) (C_C _ _))) (C_C _ (C_A _)) -> 89 
  C_C (((_,_),C_C _ (C_B _))) (C_C (((_,_),C_C _ _)) (C_C _ _)) -> 90 
  C_C (((_,_),C_B (C_C _ _))) (C_C (((_,_),C_C _ _)) (C_B _)) -> 91 
  C_C (((_,_),C_C ((_,_)) (C_A _))) (C_C (((_,_),C_B _)) (C_C _ _)) -> 92 
  C_C (((_,_),C_C ((_,_)) _)) _ -> 93 
  C_C (((_,_),C_C _ (C_A _))) (C_A (C_D)) -> 94 
  C_C (((_,_),C_C _ _)) (C_A _) -> 95 
  C_C _ (C_A _) -> 96 
  C_C (((_,_),C_A (C_D))) (C_C (((_,_),C_A _)) (C_A _)) -> 97 
  C_C (((_,_),C_C ((_,_)) (C_A _))) (C_C _ (C_A _)) -> 98 
  C_C (((_,_),C_C ((_,_)) _)) (C_C _ _) -> 99 
  C_C (((_,_),C_C ((_,_)) (C_B _))) (C_C (((_,_),C_A _)) (C_C _ _)) -> 100 
  C_C (((_,_),C_C _ (C_C _ _))) (C_C _ (C_C _ _)) -> 101 
