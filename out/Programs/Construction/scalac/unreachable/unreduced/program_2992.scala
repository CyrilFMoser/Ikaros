package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_B[C]) extends T_A[C]
case class CC_B() extends T_B[T_A[T_A[Boolean]]]
case class CC_C(a: T_B[Int], b: CC_A[CC_A[Byte]]) extends T_B[T_A[T_A[Boolean]]]
case class CC_D(a: (CC_C,Boolean), b: Byte) extends T_B[T_A[T_A[Boolean]]]

val v_a: T_B[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A(_, _)) => 1 
}
}
// This is not matched: CC_D(_, _)