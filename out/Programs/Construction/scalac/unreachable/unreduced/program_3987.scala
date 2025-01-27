package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, T_A[Boolean, T_A[Byte, Char]]]
case class CC_B[F](a: (Boolean,T_A[Byte, Int]), b: T_B[F, F]) extends T_A[F, T_A[Boolean, T_A[Byte, Char]]]
case class CC_C[G](a: CC_A[T_B[G, G]], b: CC_B[T_A[G, G]], c: G) extends T_A[G, T_A[Boolean, T_A[Byte, Char]]]

val v_a: T_A[Boolean, T_A[Boolean, T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_), CC_B((_,_), _), _) => 2 
}
}