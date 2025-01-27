package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_A[(Boolean,Boolean)]]) extends T_A[(T_A[Int],T_A[(Byte,Char)])]
case class CC_B(a: Byte) extends T_A[(T_A[Int],T_A[(Byte,Char)])]
case class CC_C[B](a: CC_B) extends T_A[(T_A[Int],T_A[(Byte,Char)])]

val v_a: T_A[(T_A[Int],T_A[(Byte,Char)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(CC_B(0)) => 1 
  case CC_C(CC_B(_)) => 2 
}
}
// This is not matched: CC_B(_)