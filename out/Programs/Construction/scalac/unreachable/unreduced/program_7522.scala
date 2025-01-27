package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean]) extends T_A[(T_A[Char],Int)]
case class CC_B(a: (CC_A,(CC_A,CC_A))) extends T_A[(T_A[Char],Int)]

val v_a: T_A[(T_A[Char],Int)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}