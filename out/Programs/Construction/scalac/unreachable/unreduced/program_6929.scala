package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: Boolean) extends T_A[T_A[Char]]
case class CC_B(a: Boolean, b: T_A[CC_A], c: CC_A) extends T_A[T_A[Char]]
case class CC_C(a: CC_B, b: T_A[Boolean]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, CC_A(_, _)) => 1 
}
}
// This is not matched: CC_C(_, _)