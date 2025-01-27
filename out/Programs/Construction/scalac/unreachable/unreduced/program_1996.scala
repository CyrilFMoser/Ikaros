package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: T_A) extends T_A
case class CC_B(a: T_A, b: CC_A, c: T_A) extends T_A
case class CC_C(a: CC_B, b: T_B[Boolean, T_A], c: T_A) extends T_A
case class CC_D(a: CC_B, b: T_B[T_B[Boolean, CC_B], CC_A]) extends T_B[CC_C, CC_B]
case class CC_E(a: CC_A) extends T_B[CC_C, CC_B]
case class CC_F(a: CC_E, b: CC_D, c: CC_B) extends T_B[CC_C, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, CC_B(_, _, _)), CC_A(_, _), _) => 1 
  case CC_B(CC_A(_, CC_C(_, _, _)), CC_A(_, _), _) => 2 
  case CC_B(CC_B(_, _, _), CC_A(_, _), _) => 3 
  case CC_B(CC_C(CC_B(_, _, _), _, CC_A(_, _)), CC_A(_, _), _) => 4 
  case CC_B(CC_C(CC_B(_, _, _), _, CC_B(_, _, _)), CC_A(_, _), _) => 5 
  case CC_B(CC_C(CC_B(_, _, _), _, CC_C(_, _, _)), CC_A(_, _), _) => 6 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_A(_, CC_A(_, _))) => 7 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_A(_, CC_B(_, _, _))) => 8 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_A(_, CC_C(_, _, _))) => 9 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_B(_, _, CC_A(_, _))) => 10 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_B(_, _, CC_B(_, _, _))) => 11 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_B(_, _, CC_C(_, _, _))) => 12 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_C(_, _, CC_A(_, _))) => 13 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_C(_, _, CC_B(_, _, _))) => 14 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_C(_, _, CC_C(_, _, _))) => 15 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_A(_, CC_A(_, _))) => 16 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_A(_, CC_B(_, _, _))) => 17 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_A(_, CC_C(_, _, _))) => 18 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_B(_, _, CC_A(_, _))) => 19 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_B(_, _, CC_B(_, _, _))) => 20 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_B(_, _, CC_C(_, _, _))) => 21 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(_, _, CC_A(_, _))) => 22 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(_, _, CC_B(_, _, _))) => 23 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(_, _, CC_C(_, _, _))) => 24 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_A(_, CC_A(_, _))) => 25 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_A(_, CC_B(_, _, _))) => 26 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_A(_, CC_C(_, _, _))) => 27 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_B(_, _, CC_A(_, _))) => 28 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_B(_, _, CC_B(_, _, _))) => 29 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_B(_, _, CC_C(_, _, _))) => 30 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(_, _, CC_A(_, _))) => 31 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(_, _, CC_B(_, _, _))) => 32 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(_, _, CC_C(_, _, _))) => 33 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_A(_, CC_A(_, _))) => 34 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_A(_, CC_B(_, _, _))) => 35 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_A(_, CC_C(_, _, _))) => 36 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_B(_, _, CC_A(_, _))) => 37 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_B(_, _, CC_B(_, _, _))) => 38 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_B(_, _, CC_C(_, _, _))) => 39 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(_, _, CC_A(_, _))) => 40 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(_, _, CC_B(_, _, _))) => 41 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(_, _, CC_C(_, _, _))) => 42 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_A(_, CC_A(_, _))) => 43 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_A(_, CC_B(_, _, _))) => 44 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_A(_, CC_C(_, _, _))) => 45 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_B(_, _, CC_A(_, _))) => 46 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_B(_, _, CC_B(_, _, _))) => 47 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_B(_, _, CC_C(_, _, _))) => 48 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(_, _, CC_A(_, _))) => 49 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(_, _, CC_B(_, _, _))) => 50 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(_, _, CC_C(_, _, _))) => 51 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_A(_, CC_A(_, _))) => 52 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_A(_, CC_B(_, _, _))) => 53 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_A(_, CC_C(_, _, _))) => 54 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_B(_, _, CC_A(_, _))) => 55 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_B(_, _, CC_B(_, _, _))) => 56 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_B(_, _, CC_C(_, _, _))) => 57 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(_, _, CC_A(_, _))) => 58 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(_, _, CC_B(_, _, _))) => 59 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(_, _, CC_C(_, _, _))) => 60 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_A(_, CC_A(_, _))) => 61 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_A(_, CC_B(_, _, _))) => 62 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_A(_, CC_C(_, _, _))) => 63 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_B(_, _, CC_A(_, _))) => 64 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_B(_, _, CC_B(_, _, _))) => 65 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_B(_, _, CC_C(_, _, _))) => 66 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(_, _, CC_A(_, _))) => 67 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(_, _, CC_B(_, _, _))) => 68 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_C(_, _, CC_C(_, _, _))) => 69 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_A(_, CC_A(_, _))) => 70 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_A(_, CC_B(_, _, _))) => 71 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_A(_, CC_C(_, _, _))) => 72 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_B(_, _, CC_A(_, _))) => 73 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_B(_, _, CC_B(_, _, _))) => 74 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_B(_, _, CC_C(_, _, _))) => 75 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(_, _, CC_A(_, _))) => 76 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(_, _, CC_B(_, _, _))) => 77 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_B(_, _, _)), _, CC_C(_, _, CC_C(_, _, _))) => 78 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_A(_, CC_A(_, _))) => 79 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_A(_, CC_B(_, _, _))) => 80 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_A(_, CC_C(_, _, _))) => 81 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_B(_, _, CC_A(_, _))) => 82 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_B(_, _, CC_B(_, _, _))) => 83 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_B(_, _, CC_C(_, _, _))) => 84 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(_, _, CC_A(_, _))) => 85 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(_, _, CC_B(_, _, _))) => 86 
  case CC_C(CC_B(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)), _, CC_C(_, _, CC_C(_, _, _))) => 87 
}
}
// This is not matched: CC_B(CC_A(_, CC_A(_, _)), CC_A(_, _), _)