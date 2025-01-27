package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[Int], c: T_A[T_B]) extends T_A[(T_A[(Char,Boolean)],Byte)]
case class CC_B() extends T_A[(T_A[(Char,Boolean)],Byte)]
case class CC_C() extends T_B
case class CC_D(a: (T_A[CC_B],CC_A)) extends T_B

val v_a: T_A[(T_A[(Char,Boolean)],Byte)] = null
val v_b: Int = v_a match{
  case CC_A(CC_D((_,_)), _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(CC_C(), _, _)