package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B[F]() extends T_A[T_B[Char, Int], F]
case class CC_C[G](a: T_B[G, Char], b: (Byte,Char)) extends T_B[CC_B[Byte], G]

val v_a: T_B[CC_B[Byte], Char] = null
val v_b: Int = v_a match{
  case CC_C(_, (0,_)) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)