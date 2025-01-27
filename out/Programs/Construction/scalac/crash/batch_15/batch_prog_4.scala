package Program_4 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B[A](a: T_A) extends T_A
case class CC_C(a: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_), _, _) => 1 
  case CC_A(CC_C(CC_A(_, _, _)), _, _) => 2 
  case CC_B(CC_A(_, _, _)) => 3 
  case CC_B(CC_B(_)) => 4 
  case CC_B(CC_C(CC_A(_, _, _))) => 5 
  case CC_C(CC_A(CC_B(_), _, _)) => 6 
  case CC_C(CC_A(CC_C(_), _, _)) => 7 
}
}
// This is not matched: CC_C(CC_A(CC_A(_, _, _), _, _))