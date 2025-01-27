package Program_63 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[T_A, CC_A], T_B[CC_A, T_A]], b: T_A) extends T_A
case class CC_C[C]() extends T_B[T_B[T_B[CC_B, CC_B], T_B[CC_B, Char]], C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_B(_, _)) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _), _, _)