package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Char]]) extends T_A[T_A[T_B[Boolean]]]
case class CC_B(a: CC_A, b: T_B[(CC_A,Byte)]) extends T_A[T_A[T_B[Boolean]]]
case class CC_C(a: T_A[T_A[CC_A]], b: T_B[Byte]) extends T_A[T_A[T_B[Boolean]]]

val v_a: T_A[T_A[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_)