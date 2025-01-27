package Program_14 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: T_A[Int]) extends T_A[C]
case class CC_C[D]() extends T_A[D]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_C()) => 0 
}
}
// This is not matched: (CC_D T_B)