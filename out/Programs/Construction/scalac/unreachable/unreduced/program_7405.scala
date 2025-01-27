package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, E]) extends T_A[T_B[T_A[Boolean, Byte], T_A[Char, Char]], E]
case class CC_B[F](a: T_B[F, F]) extends T_A[T_B[T_A[Boolean, Byte], T_A[Char, Char]], T_A[CC_A[Char], T_B[Boolean, Boolean]]]
case class CC_C[G](a: G) extends T_B[G, T_A[((Char,Char),(Boolean,Boolean)), T_A[Char, Byte]]]
case class CC_D[I, H](a: Int) extends T_B[H, I]
case class CC_E[J](a: CC_B[J], b: T_A[J, J], c: J) extends T_B[J, T_A[((Char,Char),(Boolean,Boolean)), T_A[Char, Byte]]]

val v_a: T_B[Int, T_A[((Char,Char),(Boolean,Boolean)), T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_) => 1 
  case CC_E(_, _, _) => 2 
}
}