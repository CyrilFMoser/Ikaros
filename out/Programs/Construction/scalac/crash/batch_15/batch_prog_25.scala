package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: (T_A[Byte],Boolean)) extends T_A[Byte]
case class CC_B(a: CC_A[CC_A[Boolean]], b: T_A[Byte], c: CC_A[Boolean]) extends T_A[Byte]
case class CC_C[C]() extends T_A[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _)