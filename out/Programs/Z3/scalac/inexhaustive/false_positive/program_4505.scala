package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[F, E](a: T_A[E, Int], b: F) extends T_A[E, F]

val v_a: CC_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
}
}
// This is not matched: (CC_B Byte Byte (T_A Byte Byte))