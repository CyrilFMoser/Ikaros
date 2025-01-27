package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: (T_A,(T_A,Boolean)), c: (T_A,T_A)) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_A, b: T_A, c: Int) extends T_A
case class CC_D(a: T_A, b: CC_C) extends T_B[(T_B[T_A],CC_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, (_,_))) => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_B(CC_C(_, CC_A(_, _, _), _)) => 2 
  case CC_B(CC_C(_, CC_B(_), _)) => 3 
  case CC_B(CC_C(_, CC_C(_, _, _), _)) => 4 
  case CC_C(CC_A(_, _, _), _, _) => 5 
}
}
// This is not matched: CC_A(_, _, _)