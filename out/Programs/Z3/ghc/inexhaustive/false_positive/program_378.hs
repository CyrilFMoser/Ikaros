module Program_4 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (((Bool,Int),Bool)) | C_C (B_A b b) (B_A b b) | C_D

v_a :: B_A Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_C (C_C (C_C _ _) _) (C_C (C_A) (C_D)) -> 1 
  C_C (C_C (C_B _) _) (C_C (C_C _ _) (C_D)) -> 2 
  C_C (C_C (C_D) (C_A)) (C_C (C_A) (C_A)) -> 3 
  C_C (C_D) (C_C (C_A) (C_B _)) -> 4 
  C_C (C_C (C_A) (C_A)) _ -> 5 
  C_C (C_C (C_C _ _) (C_D)) (C_C (C_D) (C_B _)) -> 6 
  C_C (C_C (C_B _) _) (C_C (C_A) (C_A)) -> 7 
  C_C (C_C (C_C _ _) (C_A)) (C_C (C_D) (C_C _ _)) -> 8 
  C_C (C_C (C_A) (C_B _)) _ -> 9 
  C_C (C_C (C_C _ _) _) (C_B (((_,_),_))) -> 10 
  C_C (C_C (C_D) (C_B _)) (C_C (C_A) (C_A)) -> 11 
  C_C (C_C (C_A) (C_B _)) (C_C _ (C_B _)) -> 12 
  C_C (C_C (C_D) _) _ -> 13 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_C _ _) (C_C _ _)) -> 14 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_D) (C_D)) -> 15 
  C_C (C_C (C_B _) _) (C_C (C_C _ _) (C_C _ _)) -> 16 
  C_C (C_C _ (C_D)) (C_C (C_D) (C_D)) -> 17 
  C_C (C_C (C_A) (C_D)) (C_C (C_B _) (C_D)) -> 18 
  C_C (C_C (C_A) (C_C _ _)) _ -> 19 
  C_C (C_C (C_D) (C_A)) (C_C (C_C _ _) _) -> 20 
  C_C (C_C (C_A) (C_A)) (C_C _ (C_A)) -> 21 
  C_C (C_C _ (C_A)) (C_C (C_A) (C_A)) -> 22 
  C_C (C_C (C_B _) (C_A)) (C_C (C_A) (C_A)) -> 23 
  C_C (C_C _ _) (C_C (C_A) (C_B _)) -> 24 
  C_C _ (C_C _ _) -> 25 
  C_C (C_C (C_D) (C_D)) (C_C (C_C _ _) (C_B _)) -> 26 
  C_C (C_C (C_D) (C_A)) (C_C _ (C_C _ _)) -> 27 
  C_C (C_C _ (C_D)) (C_C (C_A) (C_B _)) -> 28 
  C_C (C_C (C_D) _) (C_B (((_,_),_))) -> 29 
  C_C _ (C_C (C_A) _) -> 30 
  C_C (C_C (C_A) (C_D)) (C_C (C_D) _) -> 31 
  C_C (C_C (C_A) (C_D)) (C_C (C_D) (C_A)) -> 32 
  C_C (C_C _ (C_B _)) (C_C (C_C _ _) (C_D)) -> 33 
  C_C (C_C (C_A) _) (C_C (C_C _ _) (C_A)) -> 34 
  C_C (C_C _ (C_C _ _)) (C_C (C_C _ _) (C_D)) -> 35 
  C_C (C_C (C_B _) (C_C _ _)) (C_C (C_D) (C_D)) -> 36 
  C_C (C_C _ _) (C_B _) -> 37 
  C_C (C_B _) (C_C (C_D) (C_C _ _)) -> 38 
  C_C _ (C_C (C_B _) (C_C _ _)) -> 39 
  C_C (C_C (C_B _) (C_A)) (C_C (C_D) _) -> 40 
  C_C (C_C (C_D) (C_C _ _)) (C_C (C_B _) (C_A)) -> 41 
  C_C (C_B _) (C_C (C_B _) (C_B _)) -> 42 
  C_C (C_C (C_B _) _) (C_C (C_B _) (C_A)) -> 43 
  C_C (C_C (C_B _) (C_D)) (C_C (C_D) (C_A)) -> 44 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_C _ _) _) -> 45 
  C_C (C_C (C_D) (C_D)) (C_C (C_B _) (C_D)) -> 46 
  C_C (C_D) (C_C (C_C _ _) (C_D)) -> 47 
  C_C (C_C (C_A) _) (C_C (C_D) (C_B _)) -> 48 
  C_C (C_C (C_D) (C_C _ _)) (C_A) -> 49 
  C_C (C_C (C_B _) _) (C_C _ (C_C _ _)) -> 50 
  C_C (C_C _ (C_A)) (C_C (C_B _) (C_A)) -> 51 
  C_C _ (C_C (C_C _ _) (C_C _ _)) -> 52 
  C_C (C_C (C_D) _) (C_C (C_D) (C_A)) -> 53 
  C_C (C_C (C_C _ _) (C_A)) (C_B _) -> 54 
  C_C (C_C (C_B _) (C_B _)) (C_B (((_,_),_))) -> 55 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_C _ _) (C_A)) -> 56 
  C_C (C_C (C_D) (C_C _ _)) (C_C (C_A) (C_D)) -> 57 
  C_C (C_C (C_D) _) (C_C (C_A) (C_B _)) -> 58 
  C_C (C_B (((_,_),_))) (C_C (C_D) (C_B _)) -> 59 
  C_C (C_C (C_C _ _) (C_D)) (C_C (C_A) _) -> 60 
  C_C (C_C (C_C _ _) _) (C_C (C_C _ _) (C_A)) -> 61 
  C_C (C_A) (C_C (C_C _ _) (C_D)) -> 62 
  C_C (C_C (C_B _) (C_B _)) (C_C (C_A) _) -> 63 
  C_C (C_B (((_,_),_))) (C_A) -> 64 
  C_C (C_C (C_D) (C_C _ _)) (C_C _ (C_C _ _)) -> 65 
  C_C (C_C _ (C_B _)) (C_C _ (C_B _)) -> 66 
  C_C (C_C (C_B _) (C_A)) (C_C (C_A) (C_D)) -> 67 
  C_C (C_C _ (C_C _ _)) (C_C _ _) -> 68 
  C_C (C_A) (C_D) -> 69 
  C_C (C_C (C_C _ _) (C_B _)) (C_D) -> 70 
  C_C (C_A) (C_C (C_A) (C_C _ _)) -> 71 
  C_C (C_C (C_B _) (C_A)) (C_C (C_B _) (C_A)) -> 72 
  C_C (C_C (C_C _ _) (C_D)) (C_C (C_A) (C_D)) -> 73 
  C_C (C_C (C_D) (C_C _ _)) (C_C (C_A) (C_B _)) -> 74 
  C_C (C_C (C_A) _) (C_C _ (C_B _)) -> 75 
  C_C (C_A) (C_C _ (C_A)) -> 76 
  C_C (C_B (((_,_),_))) (C_C (C_A) (C_C _ _)) -> 77 
  C_C (C_C (C_B _) _) (C_C (C_A) (C_B _)) -> 78 
  C_C (C_C (C_C _ _) (C_A)) (C_D) -> 79 
  C_C (C_C _ (C_A)) (C_C (C_B _) (C_C _ _)) -> 80 
  C_C (C_C (C_D) (C_D)) (C_C (C_D) (C_A)) -> 81 
  C_C (C_C (C_A) (C_B _)) (C_A) -> 82 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_D) _) -> 83 
  C_C (C_C (C_B _) (C_D)) (C_C (C_B _) (C_B _)) -> 84 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_A) _) -> 85 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_C _ _) (C_D)) -> 86 
  C_C (C_C _ (C_B _)) (C_C (C_A) (C_B _)) -> 87 
  C_C _ _ -> 88 
  C_C (C_C (C_D) (C_B _)) (C_C (C_C _ _) (C_A)) -> 89 
  C_C (C_C _ _) (C_C _ _) -> 90 
  C_C (C_A) (C_C (C_A) (C_D)) -> 91 
  C_C (C_C (C_A) (C_D)) (C_C _ (C_B _)) -> 92 
  C_C _ (C_C (C_A) (C_A)) -> 93 
  C_C (C_C _ (C_D)) (C_D) -> 94 
  C_C (C_C (C_C _ _) (C_A)) (C_C _ (C_B _)) -> 95 
  C_C _ (C_B _) -> 96 
  C_C (C_C (C_B _) (C_D)) (C_C (C_B _) (C_A)) -> 97 
  C_C (C_C (C_D) (C_B _)) (C_C (C_D) (C_C _ _)) -> 98 
  C_C (C_C (C_A) (C_C _ _)) (C_C (C_A) _) -> 99 
  C_C (C_C (C_C _ _) (C_B _)) (C_B _) -> 100 
  C_C (C_C (C_C _ _) (C_C _ _)) (C_C (C_B _) (C_A)) -> 101 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_D) (C_A)) -> 102 
  C_C (C_C (C_C _ _) (C_B _)) (C_C _ _) -> 103 
  C_C (C_C (C_C _ _) _) (C_C (C_C _ _) _) -> 104 
  C_C (C_C (C_C _ _) (C_D)) (C_C (C_B _) _) -> 105 
  C_C (C_C (C_C _ _) (C_B _)) (C_C (C_D) (C_D)) -> 106 
