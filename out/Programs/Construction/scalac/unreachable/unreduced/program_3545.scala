package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, F], b: F) extends T_A[Byte, E]
case class CC_B() extends T_A[Byte, T_A[T_B[(Int,Char), Int], T_A[Byte, Char]]]
case class CC_C[G](a: T_A[Byte, G], b: G, c: T_A[G, G]) extends T_A[Byte, G]

val v_a: T_A[Byte, T_A[T_B[(Int,Char), Int], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _), _, _) => 2 
  case CC_C(CC_B(), _, _) => 3 
}
}
// This is not matched: CC_C(CC_C(_, _, _), _, _)