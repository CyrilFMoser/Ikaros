package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Int, Char], T_A[Char, Char]]) extends T_A[T_A[T_A[Char, Byte], Int], T_A[T_B[Int, (Boolean,Boolean)], T_B[Int, Boolean]]]
case class CC_B(a: T_A[Byte, CC_A], b: CC_A, c: CC_A) extends T_A[T_A[T_A[Char, Byte], Int], T_A[T_B[Int, (Boolean,Boolean)], T_B[Int, Boolean]]]
case class CC_C[E, F]() extends T_B[F, E]
case class CC_D[H, G]() extends T_B[G, H]

val v_a: T_A[T_A[T_A[Char, Byte], Int], T_A[T_B[Int, (Boolean,Boolean)], T_B[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, CC_A(CC_D())) => 1 
}
}
// This is not matched: CC_B(_, _, CC_A(CC_C()))