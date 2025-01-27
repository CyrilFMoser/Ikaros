package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: Int) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_B, b: Byte, c: CC_A) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, CC_A(_)) => 2 
}
}