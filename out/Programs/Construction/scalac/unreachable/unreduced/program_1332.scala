package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Boolean], b: T_A[(T_B,T_B)], c: Int) extends T_A[(T_B,T_A[(Boolean,Char)])]
case class CC_B(a: ((Char,Int),T_B)) extends T_A[(T_B,T_A[(Boolean,Char)])]
case class CC_C(a: CC_B, b: CC_A, c: T_B) extends T_B
case class CC_D(a: CC_A) extends T_B
case class CC_E[B](a: (CC_D,Int), b: CC_D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_), _, CC_C(_, _, _)) => 0 
  case CC_C(CC_B(_), _, CC_D(_)) => 1 
  case CC_C(CC_B(_), _, CC_E(_, _)) => 2 
  case CC_D(CC_A(_, _, _)) => 3 
  case CC_E(_, CC_D(_)) => 4 
}
}