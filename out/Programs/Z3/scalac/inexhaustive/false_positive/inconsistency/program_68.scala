package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[D]() extends T_A[D]
case class CC_C[F]() extends T_A[F]
case class CC_E(a: T_A[Byte], b: T_B[Int]) extends T_B[T_A[Boolean]]

val v_a: T_B[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_E(CC_C(), _) => 0 
}
}
// This is not matched: (CC_C T_A)