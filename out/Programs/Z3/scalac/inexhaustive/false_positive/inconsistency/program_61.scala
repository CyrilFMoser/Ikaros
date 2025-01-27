package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A, T_A], b: T_A) extends T_A
case class CC_D[D]() extends T_B[D, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
  case CC_A() => 1 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)