package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: (T_B[T_A],(T_A,T_A)), c: Char) extends T_A
case class CC_B() extends T_B[CC_A]
case class CC_C(a: T_B[CC_A], b: (T_A,T_B[T_A])) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), (CC_A(_, _, _),_)) => 1 
  case CC_C(CC_C(CC_B(), _), (CC_A(_, _, _),_)) => 2 
}
}
// This is not matched: CC_C(CC_C(CC_C(_, _), _), (CC_A(_, _, _),_))