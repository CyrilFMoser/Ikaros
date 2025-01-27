package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, T_A], T_A]) extends T_A
case class CC_B() extends T_B[T_A, T_B[CC_A, CC_A]]
case class CC_C(a: CC_B, b: T_B[T_A, T_B[CC_A, CC_A]], c: T_A) extends T_B[T_A, T_B[CC_A, CC_A]]
case class CC_D(a: CC_B, b: CC_B) extends T_B[T_A, T_B[CC_A, CC_A]]

val v_a: T_B[T_A, T_B[CC_A, CC_A]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), CC_B(), CC_A(_, _)) => 1 
  case CC_C(CC_B(), CC_D(CC_B(), CC_B()), CC_A(_, _)) => 2 
  case CC_D(_, CC_B()) => 3 
}
}
// This is not matched: CC_C(CC_B(), CC_C(_, _, _), CC_A(_, _))