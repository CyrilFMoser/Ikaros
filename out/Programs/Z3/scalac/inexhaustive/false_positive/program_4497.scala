package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B(a: T_B[Int]) extends T_A[T_A[Byte, Byte], T_B[(Int,Byte)]]
case class CC_C[F]() extends T_B[F]
case class CC_D[G]() extends T_B[G]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_C()) => 0 
}
}
// This is not matched: (CC_B Byte (T_A Byte))