module Program_31 () where 

 main = print $ show v_b
data B_A a b = C_A ((Bool,(Bool,Int))) | C_B Char (B_C a) | C_C (B_D b a) (B_D b a)
data B_C e = C_F e | C_G (B_A e e) (B_B e e) | C_H | C_I Char
data B_B c d = C_D | C_E ((Int,Bool)) ((Bool,Int))
data B_D f g = C_J g | C_K (B_C g) | C_L

v_a :: B_C Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ -> 0 
  C_G _ _ -> 1 
  C_H -> 2 
  C_I _ -> 3 
