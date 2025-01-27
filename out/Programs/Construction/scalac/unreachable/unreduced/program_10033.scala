package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char]) extends T_A[Char]
case class CC_B(a: T_A[Char], b: (T_A[CC_A],T_A[Char]), c: T_A[Char]) extends T_A[Char]
case class CC_C() extends T_A[(T_A[Char],Byte)]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, (_,_), _)) => 1 
}
}