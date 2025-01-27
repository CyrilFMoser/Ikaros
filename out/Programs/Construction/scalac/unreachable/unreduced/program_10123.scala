package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B, c: Int) extends T_A[T_B, C]
case class CC_B(a: T_A[T_B, T_B], b: T_A[T_A[T_B, (Char,Char)], T_A[T_B, T_B]], c: CC_A[CC_A[T_B]]) extends T_A[T_B, Boolean]
case class CC_C(a: T_B) extends T_B
case class CC_D(a: T_A[T_B, T_A[T_B, Byte]], b: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_))) => 0 
  case CC_C(CC_C(CC_D(_, _))) => 1 
  case CC_C(CC_D(CC_A(_, _, _), _)) => 2 
  case CC_D(CC_A(_, CC_C(_), _), _) => 3 
  case CC_D(CC_A(_, CC_D(_, _), _), _) => 4 
}
}