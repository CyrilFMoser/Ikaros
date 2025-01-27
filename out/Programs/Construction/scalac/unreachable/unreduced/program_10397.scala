package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A], c: Int) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C() extends T_B[T_B[CC_A]]
case class CC_D(a: T_B[T_B[CC_A]], b: CC_A, c: CC_C) extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C(), CC_A(CC_A(_, _, _), _, 12), CC_C()) => 1 
  case CC_D(CC_D(CC_C(), CC_A(_, _, _), CC_C()), CC_A(CC_A(_, _, _), _, 12), CC_C()) => 2 
  case CC_D(CC_D(CC_D(_, _, _), CC_A(_, _, _), CC_C()), CC_A(CC_A(_, _, _), _, 12), CC_C()) => 3 
  case CC_D(CC_C(), CC_A(CC_B(_), _, 12), CC_C()) => 4 
  case CC_D(CC_D(CC_C(), CC_A(_, _, _), CC_C()), CC_A(CC_B(_), _, 12), CC_C()) => 5 
  case CC_D(CC_D(CC_D(_, _, _), CC_A(_, _, _), CC_C()), CC_A(CC_B(_), _, 12), CC_C()) => 6 
  case CC_D(CC_C(), CC_A(CC_A(_, _, _), _, _), CC_C()) => 7 
  case CC_D(CC_D(CC_C(), CC_A(_, _, _), CC_C()), CC_A(CC_A(_, _, _), _, _), CC_C()) => 8 
  case CC_D(CC_D(CC_D(_, _, _), CC_A(_, _, _), CC_C()), CC_A(CC_A(_, _, _), _, _), CC_C()) => 9 
  case CC_D(CC_C(), CC_A(CC_B(_), _, _), CC_C()) => 10 
  case CC_D(CC_D(CC_C(), CC_A(_, _, _), CC_C()), CC_A(CC_B(_), _, _), CC_C()) => 11 
  case CC_D(CC_D(CC_D(_, _, _), CC_A(_, _, _), CC_C()), CC_A(CC_B(_), _, _), CC_C()) => 12 
}
}