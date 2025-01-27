package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[Boolean], c: T_A[Byte]) extends T_A[T_A[T_A[Byte]]]
case class CC_B[B](a: B, b: CC_A) extends T_A[T_A[T_A[Byte]]]
case class CC_C[C](a: T_A[C], b: CC_B[CC_B[C]]) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}