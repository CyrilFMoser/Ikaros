package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[Byte]]
case class CC_B(a: Byte, b: T_A[CC_A]) extends T_A[T_A[Byte]]
case class CC_C[C](a: CC_B, b: Boolean, c: T_A[T_A[Byte]]) extends T_B[Boolean]
case class CC_D(a: T_A[T_A[Byte]]) extends T_B[Boolean]
case class CC_E(a: CC_A, b: T_B[Boolean], c: (CC_B,CC_A)) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_B(_, _)) => 1 
  case CC_E(_, _, (CC_B(_, _),CC_A())) => 2 
}
}
// This is not matched: CC_D(CC_A())