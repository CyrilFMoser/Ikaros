package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A, c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_B[CC_B]
case class CC_D(a: T_B[CC_B], b: (CC_B,T_B[CC_B])) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_B()) => 1 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B()), CC_A(_, _, _)) => 2 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B()), CC_B()) => 3 
  case CC_A(_, CC_A(_, CC_B(), CC_A(_, _, _)), CC_A(_, _, _)) => 4 
  case CC_A(_, CC_A(_, CC_B(), CC_A(_, _, _)), CC_B()) => 5 
  case CC_A(_, CC_A(_, CC_B(), CC_B()), CC_A(_, _, _)) => 6 
  case CC_A(_, CC_A(_, CC_B(), CC_B()), CC_B()) => 7 
  case CC_A(_, CC_B(), CC_A(_, _, _)) => 8 
  case CC_A(_, CC_B(), CC_B()) => 9 
  case CC_B() => 10 
}
}