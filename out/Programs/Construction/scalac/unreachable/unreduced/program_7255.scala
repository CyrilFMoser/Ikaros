package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[Boolean], c: T_A[Boolean]) extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]
case class CC_C(a: T_A[T_A[CC_B]], b: Boolean, c: CC_A) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _, _), _, _), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(CC_A(_, _, _), _, _), CC_B()) => 1 
  case CC_A(_, CC_A(CC_A(_, _, _), _, _), CC_C(_, _, _)) => 2 
  case CC_A(_, CC_A(CC_B(), _, _), CC_A(_, _, _)) => 3 
  case CC_A(_, CC_A(CC_B(), _, _), CC_B()) => 4 
  case CC_A(_, CC_A(CC_B(), _, _), CC_C(_, _, _)) => 5 
  case CC_A(_, CC_A(CC_C(_, _, _), _, _), CC_A(_, _, _)) => 6 
  case CC_A(_, CC_A(CC_C(_, _, _), _, _), CC_B()) => 7 
  case CC_A(_, CC_A(CC_C(_, _, _), _, _), CC_C(_, _, _)) => 8 
  case CC_A(_, CC_B(), CC_A(_, _, _)) => 9 
  case CC_A(_, CC_B(), CC_B()) => 10 
  case CC_A(_, CC_B(), CC_C(_, _, _)) => 11 
  case CC_A(_, CC_C(_, _, CC_A(_, _, _)), CC_A(_, _, _)) => 12 
  case CC_A(_, CC_C(_, _, CC_A(_, _, _)), CC_B()) => 13 
  case CC_A(_, CC_C(_, _, CC_A(_, _, _)), CC_C(_, _, _)) => 14 
  case CC_B() => 15 
  case CC_C(_, _, _) => 16 
}
}