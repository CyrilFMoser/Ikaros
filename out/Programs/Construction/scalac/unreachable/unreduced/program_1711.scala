package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Boolean], b: T_B[(T_A,(Char,Int))], c: T_B[Boolean]) extends T_A
case class CC_B(a: T_B[CC_A], b: T_A, c: ((CC_A,(Int,Char)),CC_A)) extends T_A
case class CC_C(a: T_B[CC_A]) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, (_,_)) => 1 
}
}