package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_B, C]
case class CC_B(a: CC_A[(Boolean,Boolean)], b: T_A[Char, T_B], c: T_B) extends T_B
case class CC_C[D](a: T_A[D, D], b: T_A[D, D]) extends T_B
case class CC_D(a: CC_A[(T_B,CC_B)], b: T_B, c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _) => 1 
  case CC_D(_, CC_B(_, _, _), CC_B(CC_A(_, _), _, CC_B(_, _, _))) => 2 
  case CC_D(_, CC_B(_, _, _), CC_B(CC_A(_, _), _, CC_C(_, _))) => 3 
  case CC_D(_, CC_B(_, _, _), CC_B(CC_A(_, _), _, CC_D(_, _, _))) => 4 
  case CC_D(_, CC_B(_, _, _), CC_C(_, _)) => 5 
  case CC_D(_, CC_B(_, _, _), CC_D(CC_A(_, _), CC_B(_, _, _), CC_B(_, _, _))) => 6 
  case CC_D(_, CC_B(_, _, _), CC_D(CC_A(_, _), CC_B(_, _, _), CC_C(_, _))) => 7 
  case CC_D(_, CC_B(_, _, _), CC_D(CC_A(_, _), CC_B(_, _, _), CC_D(_, _, _))) => 8 
  case CC_D(_, CC_B(_, _, _), CC_D(CC_A(_, _), CC_C(_, _), CC_B(_, _, _))) => 9 
  case CC_D(_, CC_B(_, _, _), CC_D(CC_A(_, _), CC_C(_, _), CC_C(_, _))) => 10 
  case CC_D(_, CC_B(_, _, _), CC_D(CC_A(_, _), CC_C(_, _), CC_D(_, _, _))) => 11 
  case CC_D(_, CC_B(_, _, _), CC_D(CC_A(_, _), CC_D(_, _, _), CC_B(_, _, _))) => 12 
  case CC_D(_, CC_B(_, _, _), CC_D(CC_A(_, _), CC_D(_, _, _), CC_C(_, _))) => 13 
  case CC_D(_, CC_B(_, _, _), CC_D(CC_A(_, _), CC_D(_, _, _), CC_D(_, _, _))) => 14 
  case CC_D(_, CC_C(_, _), CC_B(CC_A(_, _), _, CC_B(_, _, _))) => 15 
  case CC_D(_, CC_C(_, _), CC_B(CC_A(_, _), _, CC_C(_, _))) => 16 
  case CC_D(_, CC_C(_, _), CC_B(CC_A(_, _), _, CC_D(_, _, _))) => 17 
  case CC_D(_, CC_C(_, _), CC_C(_, _)) => 18 
  case CC_D(_, CC_C(_, _), CC_D(CC_A(_, _), CC_B(_, _, _), CC_B(_, _, _))) => 19 
  case CC_D(_, CC_C(_, _), CC_D(CC_A(_, _), CC_B(_, _, _), CC_C(_, _))) => 20 
  case CC_D(_, CC_C(_, _), CC_D(CC_A(_, _), CC_C(_, _), CC_B(_, _, _))) => 21 
  case CC_D(_, CC_C(_, _), CC_D(CC_A(_, _), CC_C(_, _), CC_C(_, _))) => 22 
  case CC_D(_, CC_C(_, _), CC_D(CC_A(_, _), CC_C(_, _), CC_D(_, _, _))) => 23 
  case CC_D(_, CC_C(_, _), CC_D(CC_A(_, _), CC_D(_, _, _), CC_B(_, _, _))) => 24 
  case CC_D(_, CC_C(_, _), CC_D(CC_A(_, _), CC_D(_, _, _), CC_C(_, _))) => 25 
  case CC_D(_, CC_C(_, _), CC_D(CC_A(_, _), CC_D(_, _, _), CC_D(_, _, _))) => 26 
  case CC_D(_, CC_D(_, _, _), CC_B(CC_A(_, _), _, CC_B(_, _, _))) => 27 
  case CC_D(_, CC_D(_, _, _), CC_B(CC_A(_, _), _, CC_C(_, _))) => 28 
  case CC_D(_, CC_D(_, _, _), CC_B(CC_A(_, _), _, CC_D(_, _, _))) => 29 
  case CC_D(_, CC_D(_, _, _), CC_C(_, _)) => 30 
  case CC_D(_, CC_D(_, _, _), CC_D(CC_A(_, _), CC_B(_, _, _), CC_B(_, _, _))) => 31 
  case CC_D(_, CC_D(_, _, _), CC_D(CC_A(_, _), CC_B(_, _, _), CC_C(_, _))) => 32 
  case CC_D(_, CC_D(_, _, _), CC_D(CC_A(_, _), CC_B(_, _, _), CC_D(_, _, _))) => 33 
  case CC_D(_, CC_D(_, _, _), CC_D(CC_A(_, _), CC_C(_, _), CC_B(_, _, _))) => 34 
  case CC_D(_, CC_D(_, _, _), CC_D(CC_A(_, _), CC_C(_, _), CC_C(_, _))) => 35 
  case CC_D(_, CC_D(_, _, _), CC_D(CC_A(_, _), CC_C(_, _), CC_D(_, _, _))) => 36 
  case CC_D(_, CC_D(_, _, _), CC_D(CC_A(_, _), CC_D(_, _, _), CC_B(_, _, _))) => 37 
  case CC_D(_, CC_D(_, _, _), CC_D(CC_A(_, _), CC_D(_, _, _), CC_C(_, _))) => 38 
  case CC_D(_, CC_D(_, _, _), CC_D(CC_A(_, _), CC_D(_, _, _), CC_D(_, _, _))) => 39 
}
}
// This is not matched: CC_D(_, CC_C(_, _), CC_D(CC_A(_, _), CC_B(_, _, _), CC_D(_, _, _)))