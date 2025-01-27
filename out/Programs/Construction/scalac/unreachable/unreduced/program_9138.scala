package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A], c: T_B[T_A]) extends T_A
case class CC_B[B]() extends T_A
case class CC_C(a: T_A, b: CC_A) extends T_A
case class CC_D() extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_A(CC_B(), _, _), _, _) => 1 
  case CC_A(CC_A(CC_C(_, _), _, _), _, _) => 2 
  case CC_A(CC_B(), _, _) => 3 
  case CC_A(CC_C(_, _), _, _) => 4 
  case CC_B() => 5 
  case CC_C(CC_A(CC_A(_, _, _), _, _), CC_A(_, _, _)) => 6 
  case CC_C(CC_A(CC_B(), _, _), CC_A(_, _, _)) => 7 
  case CC_C(CC_A(CC_C(_, _), _, _), CC_A(_, _, _)) => 8 
  case CC_C(CC_B(), CC_A(_, _, _)) => 9 
  case CC_C(CC_C(CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 10 
  case CC_C(CC_C(CC_B(), CC_A(_, _, _)), CC_A(_, _, _)) => 11 
  case CC_C(CC_C(CC_C(_, _), CC_A(_, _, _)), CC_A(_, _, _)) => 12 
}
}