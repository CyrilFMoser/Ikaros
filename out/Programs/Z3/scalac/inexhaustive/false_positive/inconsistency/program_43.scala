package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,Byte)) extends T_A
case class CC_B(a: T_B[CC_A, Int], b: CC_A) extends T_A
case class CC_C[C]() extends T_B[T_B[CC_A, CC_A], C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A((_,0))) => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)