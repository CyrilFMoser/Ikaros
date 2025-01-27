package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A], c: Int) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: Boolean) extends T_A
case class CC_D(a: (T_B[CC_C],CC_A)) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(CC_A(_, _, _), _, _), true) => 1 
  case CC_C(CC_A(CC_B(), _, _), true) => 2 
  case CC_C(CC_A(CC_C(_, _), _, _), true) => 3 
  case CC_C(CC_A(CC_A(_, _, _), _, _), false) => 4 
  case CC_C(CC_A(CC_B(), _, _), false) => 5 
  case CC_C(CC_A(CC_C(_, _), _, _), false) => 6 
}
}
// This is not matched: CC_A(_, _, _)