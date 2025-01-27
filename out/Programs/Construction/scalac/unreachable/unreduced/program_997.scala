package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Byte,Byte)], b: Byte, c: Int) extends T_A[(T_A[Boolean],Int)]
case class CC_B() extends T_A[(T_A[Boolean],Int)]
case class CC_C(a: T_A[CC_A]) extends T_A[(T_A[Boolean],Int)]

val v_a: T_A[(T_A[Boolean],Int)] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_A(_, _, _)