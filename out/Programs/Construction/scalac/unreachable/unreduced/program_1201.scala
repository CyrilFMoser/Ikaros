package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[T_A], c: T_B[Int]) extends T_A
case class CC_C() extends T_A
case class CC_D[B](a: T_A, b: B, c: CC_C) extends T_B[CC_C]
case class CC_E(a: CC_A, b: T_A) extends T_B[CC_C]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_), _, CC_C()) => 0 
  case CC_D(CC_B(_, _, _), _, CC_C()) => 1 
  case CC_D(CC_C(), _, CC_C()) => 2 
  case CC_E(_, CC_A(_)) => 3 
  case CC_E(_, CC_B(_, _, _)) => 4 
}
}
// This is not matched: CC_E(_, CC_C())