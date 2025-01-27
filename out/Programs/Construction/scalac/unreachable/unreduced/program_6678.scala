package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Boolean]], b: (T_A[Boolean],T_A[Boolean])) extends T_A[T_A[T_A[Char]]]
case class CC_B[C](a: T_B[C], b: C, c: C) extends T_B[C]
case class CC_C() extends T_B[T_A[T_B[CC_A]]]
case class CC_D[D](a: T_B[D], b: Boolean) extends T_B[D]

val v_a: T_B[T_A[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D(CC_B(CC_B(_, _, _), _, _), true) => 1 
  case CC_D(CC_B(CC_B(_, _, _), _, _), false) => 2 
  case CC_D(CC_B(CC_C(), _, _), true) => 3 
  case CC_D(CC_B(CC_C(), _, _), false) => 4 
  case CC_D(CC_B(CC_D(_, _), _, _), true) => 5 
  case CC_D(CC_B(CC_D(_, _), _, _), false) => 6 
  case CC_D(CC_C(), true) => 7 
  case CC_D(CC_C(), false) => 8 
  case CC_D(CC_D(CC_B(_, _, _), _), true) => 9 
  case CC_D(CC_D(CC_B(_, _, _), _), false) => 10 
  case CC_D(CC_D(CC_C(), _), true) => 11 
  case CC_D(CC_D(CC_C(), _), false) => 12 
  case CC_D(CC_D(CC_D(_, _), _), true) => 13 
  case CC_D(CC_D(CC_D(_, _), _), false) => 14 
}
}
// This is not matched: CC_C()