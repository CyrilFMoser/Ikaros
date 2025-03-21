package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_A[T_B]]) extends T_A[T_A[T_A[T_B]]]
case class CC_B[B](a: ((CC_A,CC_A),CC_A), b: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: T_A[CC_B[CC_A]]) extends T_A[T_A[T_A[T_B]]]
case class CC_D(a: Byte, b: Int, c: T_B) extends T_B
case class CC_E() extends T_B
case class CC_F(a: Char) extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _, _), _) => 0 
  case CC_A(CC_E(), _) => 1 
  case CC_A(CC_F(_), _) => 2 
  case CC_B(_, _) => 3 
}
}
// This is not matched: CC_C(_)