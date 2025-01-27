package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,Boolean)) extends T_A
case class CC_B(a: (CC_A,(T_A,Boolean)), b: CC_A, c: T_B[CC_A]) extends T_A
case class CC_C(a: CC_A) extends T_B[T_B[Char]]
case class CC_D(a: T_B[T_B[Char]], b: CC_B) extends T_B[T_B[Char]]
case class CC_E(a: Byte, b: T_B[CC_A]) extends T_B[T_B[Char]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),_)) => 0 
  case CC_A((CC_B(_, _, _),_)) => 1 
  case CC_B(_, CC_A((_,_)), _) => 2 
}
}