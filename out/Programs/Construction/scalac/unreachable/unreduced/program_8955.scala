package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[CC_A[Char], Int]) extends T_A[CC_A[CC_A[Byte]], T_A[CC_A[CC_A[Byte]], CC_A[CC_A[Byte]]]]

val v_a: T_A[CC_A[CC_A[Byte]], T_A[CC_A[CC_A[Byte]], CC_A[CC_A[Byte]]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}