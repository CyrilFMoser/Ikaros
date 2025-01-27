package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char]) extends T_A[(T_A[Boolean],T_A[(Char,Char)])]
case class CC_B(a: Int, b: CC_A) extends T_A[(T_A[Boolean],T_A[(Char,Char)])]

val v_a: T_A[(T_A[Boolean],T_A[(Char,Char)])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}