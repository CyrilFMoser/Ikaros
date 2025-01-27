package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, D], b: T_A[D, T_A[D, D]], c: T_A[T_A[D, D], T_A[T_A[D, D], T_A[D, D]]]) extends T_A[T_A[Byte, (Boolean,(Char,Int))], D]
case class CC_C[E](a: T_A[E, T_A[E, E]]) extends T_A[T_A[Byte, (Boolean,(Char,Int))], E]

val v_a: T_A[T_A[Byte, (Boolean,(Char,Int))], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(CC_A(_)), CC_A(CC_A(_))) => 0 
  case CC_C(_) => 1 
}
}