package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Char, b: F) extends T_A[E, T_A[T_B[Boolean, Char], T_B[Byte, Byte]]]
case class CC_B[G](a: T_B[G, G], b: G) extends T_A[G, T_A[T_B[Boolean, Char], T_B[Byte, Byte]]]
case class CC_C[H](a: T_A[T_B[H, H], (Char,Boolean)], b: H, c: H) extends T_A[H, T_A[T_B[Boolean, Char], T_B[Byte, Byte]]]
case class CC_D[J, I](a: Char, b: Int) extends T_B[I, J]

val v_a: T_A[Int, T_A[T_B[Boolean, Char], T_B[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(CC_D(_, _), _)