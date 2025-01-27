package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[E](a: T_A[E, E], b: T_A[E, CC_A[E, E]], c: T_B) extends T_A[E, CC_A[E, E]]
case class CC_C(a: CC_B[Byte], b: Int) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_A(), CC_A(), CC_C(_, _)), _) => 0 
}
}
// This is not matched: CC_C(CC_B(CC_A(), CC_B(_, _, _), CC_C(_, _)), _)