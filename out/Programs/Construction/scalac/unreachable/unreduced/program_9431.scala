package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[Byte, Int]]
case class CC_B[D](a: (CC_A[(Boolean,Boolean)],T_A[Byte, Boolean])) extends T_A[D, T_A[Byte, Int]]
case class CC_C[E](a: CC_A[E], b: T_A[E, E], c: E) extends T_A[E, T_A[Byte, Int]]

val v_a: T_A[Boolean, T_A[Byte, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),_)) => 1 
}
}
// This is not matched: CC_C(CC_A(), _, _)