package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D](a: T_B, b: T_A[D, D], c: T_B) extends T_A[T_B, D]
case class CC_C(a: T_A[T_B, CC_B[T_B]], b: T_A[T_A[T_B, T_B], T_A[T_B, (Boolean,Int)]], c: T_A[T_A[T_B, T_B], T_B]) extends T_B
case class CC_D(a: Boolean, b: CC_C, c: Boolean) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), _, _) => 0 
  case CC_C(CC_B(CC_C(_, _, _), _, CC_C(_, _, _)), _, _) => 1 
  case CC_C(CC_B(CC_D(_, _, _), _, CC_C(_, _, _)), _, _) => 2 
  case CC_C(CC_B(CC_E(), _, CC_C(_, _, _)), _, _) => 3 
  case CC_C(CC_B(CC_C(_, _, _), _, CC_D(_, _, _)), _, _) => 4 
  case CC_C(CC_B(CC_D(_, _, _), _, CC_D(_, _, _)), _, _) => 5 
  case CC_C(CC_B(CC_E(), _, CC_D(_, _, _)), _, _) => 6 
  case CC_C(CC_B(CC_C(_, _, _), _, CC_E()), _, _) => 7 
  case CC_C(CC_B(CC_D(_, _, _), _, CC_E()), _, _) => 8 
  case CC_C(CC_B(CC_E(), _, CC_E()), _, _) => 9 
  case CC_D(_, CC_C(CC_A(_), _, _), _) => 10 
  case CC_D(_, CC_C(CC_B(_, _, _), _, _), _) => 11 
  case CC_E() => 12 
}
}