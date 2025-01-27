package Program_14 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: (T_B,(Int,Byte)), c: (T_A,T_A)) extends T_A
case class CC_B() extends T_A
case class CC_C(a: (T_B,T_B), b: T_A) extends T_A
case class CC_D[A](a: T_A, b: A, c: T_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_D(CC_B(), _, CC_B()) => 1 
  case CC_D(CC_B(), _, CC_A(_, _, _)) => 2 
  case CC_D(CC_A(_, _, _), _, CC_B()) => 3 
  case CC_D(_, _, CC_A(_, _, _)) => 4 
  case CC_D(CC_B(), _, _) => 5 
  case CC_D(CC_C(_, _), _, CC_B()) => 6 
  case CC_D(CC_A(_, _, _), _, CC_C(_, _)) => 7 
}
}
// This is not matched: (CC_D T_A Wildcard Wildcard Wildcard T_B)
// This is not matched: (CC_B Char Wildcard Wildcard (T_A Char))