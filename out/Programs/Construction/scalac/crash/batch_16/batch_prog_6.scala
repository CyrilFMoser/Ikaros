package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Int, b: T_A[B]) extends T_A[B]
case class CC_B(a: CC_A[CC_A[Byte]]) extends T_A[CC_A[T_A[Char]]]
case class CC_C(a: CC_B, b: T_A[Boolean]) extends T_A[CC_A[T_A[Char]]]

val v_a: T_A[CC_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(CC_A(_, _)) => 2 
  case CC_C(_, _) => 3 
}
}