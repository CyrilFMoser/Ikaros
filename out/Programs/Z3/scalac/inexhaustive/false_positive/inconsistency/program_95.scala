package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[D](a: T_B[D], b: D) extends T_A[D]
case class CC_B() extends T_B[(Int,Byte)]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_C T_A)