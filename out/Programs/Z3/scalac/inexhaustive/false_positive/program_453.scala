package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[(Int,Int), Byte]]
case class CC_B[D](a: T_A[D, D], b: D) extends T_A[CC_A[D], D]

val v_a: T_A[CC_A[Int], Int] = null
val v_b: Int = v_a match{
  case CC_B(_, 12) => 0 
}
}
// This is not matched: (CC_C T_A T_A)