module Program_26 () where 

 main = print $ show v_b
data B_B a = C_E B_C
data B_C = C_F (B_B Bool) ((B_C,B_C)) | C_G (B_B B_A) | C_H | C_I | C_J
data B_A = C_A Int | C_B B_C B_A | C_C (B_B B_A) | C_D

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F (C_E (C_F _ _)) ((C_F _ _,C_F _ _)) -> 0 
  C_F (C_E (C_F _ _)) ((C_F _ _,C_G _)) -> 1 
  C_F (C_E (C_F _ _)) ((C_F _ _,C_H)) -> 2 
  C_F (C_E (C_F _ _)) ((C_F _ _,C_I)) -> 3 
  C_F (C_E (C_F _ _)) ((C_F _ _,C_J)) -> 4 
  C_F (C_E (C_F _ _)) ((C_G _,C_F _ _)) -> 5 
  C_F (C_E (C_F _ _)) ((C_G _,C_G _)) -> 6 
  C_F (C_E (C_F _ _)) ((C_G _,C_H)) -> 7 
  C_F (C_E (C_F _ _)) ((C_G _,C_I)) -> 8 
  C_F (C_E (C_F _ _)) ((C_H,C_F _ _)) -> 9 
  C_F (C_E (C_F _ _)) ((C_H,C_G _)) -> 10 
  C_F (C_E (C_F _ _)) ((C_H,C_H)) -> 11 
  C_F (C_E (C_F _ _)) ((C_H,C_I)) -> 12 
  C_F (C_E (C_F _ _)) ((C_H,C_J)) -> 13 
  C_F (C_E (C_F _ _)) ((C_I,C_F _ _)) -> 14 
  C_F (C_E (C_F _ _)) ((C_I,C_G _)) -> 15 
  C_F (C_E (C_F _ _)) ((C_I,C_H)) -> 16 
  C_F (C_E (C_F _ _)) ((C_I,C_I)) -> 17 
  C_F (C_E (C_F _ _)) ((C_I,C_J)) -> 18 
  C_F (C_E (C_F _ _)) ((C_J,C_F _ _)) -> 19 
  C_F (C_E (C_F _ _)) ((C_J,C_G _)) -> 20 
  C_F (C_E (C_F _ _)) ((C_J,C_H)) -> 21 
  C_F (C_E (C_F _ _)) ((C_J,C_I)) -> 22 
  C_F (C_E (C_F _ _)) ((C_J,C_J)) -> 23 
  C_F (C_E (C_G _)) ((C_F _ _,C_F _ _)) -> 24 
  C_F (C_E (C_G _)) ((C_F _ _,C_G _)) -> 25 
  C_F (C_E (C_G _)) ((C_F _ _,C_H)) -> 26 
  C_F (C_E (C_G _)) ((C_F _ _,C_I)) -> 27 
  C_F (C_E (C_G _)) ((C_F _ _,C_J)) -> 28 
  C_F (C_E (C_G _)) ((C_G _,C_F _ _)) -> 29 
  C_F (C_E (C_G _)) ((C_G _,C_G _)) -> 30 
  C_F (C_E (C_G _)) ((C_G _,C_H)) -> 31 
  C_F (C_E (C_G _)) ((C_G _,C_I)) -> 32 
  C_F (C_E (C_G _)) ((C_G _,C_J)) -> 33 
  C_F (C_E (C_G _)) ((C_H,C_F _ _)) -> 34 
  C_F (C_E (C_G _)) ((C_H,C_G _)) -> 35 
  C_F (C_E (C_G _)) ((C_H,C_H)) -> 36 
  C_F (C_E (C_G _)) ((C_H,C_I)) -> 37 
  C_F (C_E (C_G _)) ((C_H,C_J)) -> 38 
  C_F (C_E (C_G _)) ((C_I,C_F _ _)) -> 39 
  C_F (C_E (C_G _)) ((C_I,C_G _)) -> 40 
  C_F (C_E (C_G _)) ((C_I,C_H)) -> 41 
  C_F (C_E (C_G _)) ((C_I,C_I)) -> 42 
  C_F (C_E (C_G _)) ((C_I,C_J)) -> 43 
  C_F (C_E (C_G _)) ((C_J,C_F _ _)) -> 44 
  C_F (C_E (C_G _)) ((C_J,C_G _)) -> 45 
  C_F (C_E (C_G _)) ((C_J,C_H)) -> 46 
  C_F (C_E (C_G _)) ((C_J,C_I)) -> 47 
  C_F (C_E (C_G _)) ((C_J,C_J)) -> 48 
  C_F (C_E C_H) ((C_F _ _,C_F _ _)) -> 49 
  C_F (C_E C_H) ((C_F _ _,C_G _)) -> 50 
  C_F (C_E C_H) ((C_F _ _,C_H)) -> 51 
  C_F (C_E C_H) ((C_F _ _,C_I)) -> 52 
  C_F (C_E C_H) ((C_F _ _,C_J)) -> 53 
  C_F (C_E C_H) ((C_G _,C_F _ _)) -> 54 
  C_F (C_E C_H) ((C_G _,C_G _)) -> 55 
  C_F (C_E C_H) ((C_G _,C_H)) -> 56 
  C_F (C_E C_H) ((C_G _,C_I)) -> 57 
  C_F (C_E C_H) ((C_G _,C_J)) -> 58 
  C_F (C_E C_H) ((C_H,C_F _ _)) -> 59 
  C_F (C_E C_H) ((C_H,C_G _)) -> 60 
  C_F (C_E C_H) ((C_H,C_H)) -> 61 
  C_F (C_E C_H) ((C_H,C_I)) -> 62 
  C_F (C_E C_H) ((C_H,C_J)) -> 63 
  C_F (C_E C_H) ((C_I,C_F _ _)) -> 64 
  C_F (C_E C_H) ((C_I,C_G _)) -> 65 
  C_F (C_E C_H) ((C_I,C_H)) -> 66 
  C_F (C_E C_H) ((C_I,C_I)) -> 67 
  C_F (C_E C_H) ((C_I,C_J)) -> 68 
  C_F (C_E C_H) ((C_J,C_F _ _)) -> 69 
  C_F (C_E C_H) ((C_J,C_G _)) -> 70 
  C_F (C_E C_H) ((C_J,C_H)) -> 71 
  C_F (C_E C_H) ((C_J,C_I)) -> 72 
  C_F (C_E C_H) ((C_J,C_J)) -> 73 
  C_F (C_E C_I) ((C_F _ _,C_F _ _)) -> 74 
  C_F (C_E C_I) ((C_F _ _,C_G _)) -> 75 
  C_F (C_E C_I) ((C_F _ _,C_H)) -> 76 
  C_F (C_E C_I) ((C_F _ _,C_I)) -> 77 
  C_F (C_E C_I) ((C_F _ _,C_J)) -> 78 
  C_F (C_E C_I) ((C_G _,C_F _ _)) -> 79 
  C_F (C_E C_I) ((C_G _,C_G _)) -> 80 
  C_F (C_E C_I) ((C_G _,C_H)) -> 81 
  C_F (C_E C_I) ((C_G _,C_I)) -> 82 
  C_F (C_E C_I) ((C_G _,C_J)) -> 83 
  C_F (C_E C_I) ((C_H,C_F _ _)) -> 84 
  C_F (C_E C_I) ((C_H,C_G _)) -> 85 
  C_F (C_E C_I) ((C_H,C_H)) -> 86 
  C_F (C_E C_I) ((C_H,C_I)) -> 87 
  C_F (C_E C_I) ((C_H,C_J)) -> 88 
  C_F (C_E C_I) ((C_I,C_F _ _)) -> 89 
  C_F (C_E C_I) ((C_I,C_G _)) -> 90 
  C_F (C_E C_I) ((C_I,C_H)) -> 91 
  C_F (C_E C_I) ((C_I,C_I)) -> 92 
  C_F (C_E C_I) ((C_I,C_J)) -> 93 
  C_F (C_E C_I) ((C_J,C_F _ _)) -> 94 
  C_F (C_E C_I) ((C_J,C_G _)) -> 95 
  C_F (C_E C_I) ((C_J,C_H)) -> 96 
  C_F (C_E C_I) ((C_J,C_I)) -> 97 
  C_F (C_E C_I) ((C_J,C_J)) -> 98 
  C_F (C_E C_J) ((C_F _ _,C_F _ _)) -> 99 
  C_F (C_E C_J) ((C_F _ _,C_G _)) -> 100 
  C_F (C_E C_J) ((C_F _ _,C_H)) -> 101 
  C_F (C_E C_J) ((C_F _ _,C_I)) -> 102 
  C_F (C_E C_J) ((C_F _ _,C_J)) -> 103 
  C_F (C_E C_J) ((C_G _,C_F _ _)) -> 104 
  C_F (C_E C_J) ((C_G _,C_G _)) -> 105 
  C_F (C_E C_J) ((C_G _,C_H)) -> 106 
  C_F (C_E C_J) ((C_G _,C_I)) -> 107 
  C_F (C_E C_J) ((C_G _,C_J)) -> 108 
  C_F (C_E C_J) ((C_H,C_F _ _)) -> 109 
  C_F (C_E C_J) ((C_H,C_G _)) -> 110 
  C_F (C_E C_J) ((C_H,C_H)) -> 111 
  C_F (C_E C_J) ((C_H,C_I)) -> 112 
  C_F (C_E C_J) ((C_H,C_J)) -> 113 
  C_F (C_E C_J) ((C_I,C_F _ _)) -> 114 
  C_F (C_E C_J) ((C_I,C_G _)) -> 115 
  C_F (C_E C_J) ((C_I,C_H)) -> 116 
  C_F (C_E C_J) ((C_I,C_I)) -> 117 
  C_F (C_E C_J) ((C_I,C_J)) -> 118 
  C_F (C_E C_J) ((C_J,C_F _ _)) -> 119 
  C_F (C_E C_J) ((C_J,C_G _)) -> 120 
  C_F (C_E C_J) ((C_J,C_H)) -> 121 
  C_F (C_E C_J) ((C_J,C_I)) -> 122 
  C_F (C_E C_J) ((C_J,C_J)) -> 123 
  C_G _ -> 124 
  C_H -> 125 
  C_I -> 126 
  C_J -> 127 
