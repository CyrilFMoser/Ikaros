package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[Boolean, T_A[Boolean, T_B[Char, Int]]]
case class CC_B[F, E](a: T_B[E, E]) extends T_A[F, E]
case class CC_C[G](a: T_B[(Boolean,Boolean), G], b: T_B[(Boolean,Boolean), G], c: T_A[G, G]) extends T_B[(Boolean,Boolean), G]

val v_a: T_A[Boolean, T_A[Boolean, T_B[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}