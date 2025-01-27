package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(T_A[Char],T_A[Char])]
case class CC_B(a: (Char,CC_A), b: (CC_A,(CC_A,CC_A)), c: T_A[CC_A]) extends T_A[(T_A[Char],T_A[Char])]

val v_a: T_A[(T_A[Char],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (CC_A(),(_,_)), _) => 1 
}
}