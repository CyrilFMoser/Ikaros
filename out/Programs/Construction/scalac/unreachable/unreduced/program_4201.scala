package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: Int, c: T_A[(Char,Boolean)]) extends T_A[(T_A[Char],T_A[(Boolean,Byte)])]
case class CC_B() extends T_A[(T_A[Char],T_A[(Boolean,Byte)])]
case class CC_C() extends T_A[(T_A[Char],T_A[(Boolean,Byte)])]

val v_a: T_A[(T_A[Char],T_A[(Boolean,Byte)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}