package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, (Byte,T_A[Boolean, Int])]
case class CC_B[D](a: T_A[CC_A[D], D], b: T_A[D, D], c: CC_A[D]) extends T_A[D, (Byte,T_A[Boolean, Int])]
case class CC_C[E]() extends T_A[E, (Byte,T_A[Boolean, Int])]

val v_a: T_A[Boolean, (Byte,T_A[Boolean, Int])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}