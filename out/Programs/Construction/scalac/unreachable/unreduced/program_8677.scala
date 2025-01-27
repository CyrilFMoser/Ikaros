package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: T_A[Boolean]) extends T_A[(T_A[Boolean],T_A[Char])]
case class CC_B(a: T_A[CC_A], b: T_A[CC_A], c: CC_A) extends T_A[(T_A[Boolean],T_A[Char])]
case class CC_C() extends T_A[(T_A[Boolean],T_A[Char])]

val v_a: T_A[(T_A[Boolean],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C() => 3 
}
}