package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: Int) extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_A[CC_B], b: T_A[T_B], c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
  case CC_D(_, CC_A(CC_B(_, _)), CC_C()) => 2 
  case CC_D(_, CC_A(CC_C()), CC_C()) => 3 
}
}
// This is not matched: CC_D(_, CC_A(CC_D(_, _, _)), CC_C())