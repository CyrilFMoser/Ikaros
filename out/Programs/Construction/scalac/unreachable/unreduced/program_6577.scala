package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Byte, C], b: C) extends T_A[Byte, C]
case class CC_B[D]() extends T_A[D, (Byte,T_A[Byte, Int])]
case class CC_C[E](a: E, b: T_A[E, E], c: E) extends T_A[E, (Byte,T_A[Byte, Int])]

val v_a: T_A[Boolean, (Byte,T_A[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(true, _, _) => 1 
  case CC_C(false, _, _) => 2 
}
}