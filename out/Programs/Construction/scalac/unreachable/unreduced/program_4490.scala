package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, C], c: Int) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D) extends T_A[D, CC_A[D]]
case class CC_C() extends T_A[CC_A[CC_B[Byte]], CC_A[CC_A[CC_B[Byte]]]]

val v_a: T_A[CC_A[CC_B[Byte]], CC_A[CC_A[CC_B[Byte]]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_C() => 1 
}
}