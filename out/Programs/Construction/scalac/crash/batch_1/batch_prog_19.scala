package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: Int) extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C[D]() extends T_A[D]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()