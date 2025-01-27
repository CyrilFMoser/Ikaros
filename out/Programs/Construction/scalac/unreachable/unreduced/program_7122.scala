package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A[CC_A[Boolean]], b: CC_A[Char]) extends T_A[T_A[T_A[Byte]]]
case class CC_C[C](a: Boolean, b: C) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_)) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_)