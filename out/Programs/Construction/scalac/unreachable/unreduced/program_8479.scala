package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[T_B, Boolean], T_B]) extends T_A[T_A[T_B, Boolean], C]
case class CC_B[D](a: T_B, b: T_B) extends T_A[T_A[Byte, T_B], D]
case class CC_C(a: CC_B[T_A[T_B, (Byte,Char)]], b: CC_A[CC_A[T_B]]) extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_A[T_A[T_B, Char], Boolean]) extends T_B

val v_a: T_A[T_A[Byte, T_B], CC_C] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(CC_B(_, _), _), _) => 0 
  case CC_B(CC_D(), _) => 1 
  case CC_B(CC_E(_), _) => 2 
}
}