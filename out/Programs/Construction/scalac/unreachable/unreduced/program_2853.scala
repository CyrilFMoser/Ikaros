package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_B[T_A])) extends T_A
case class CC_B(a: CC_A, b: T_A, c: CC_A) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D(a: T_A) extends T_B[T_B[T_B[CC_A]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),_)) => 0 
  case CC_A((CC_B(_, _, _),_)) => 1 
  case CC_A((CC_C(_),_)) => 2 
  case CC_B(_, CC_A((_,_)), CC_A(_)) => 3 
  case CC_B(_, CC_C(CC_A(_)), CC_A(_)) => 4 
  case CC_C(CC_A(_)) => 5 
}
}
// This is not matched: CC_B(_, CC_B(_, _, _), CC_A(_))