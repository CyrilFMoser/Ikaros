package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, E]) extends T_A[D, T_A[T_A[Byte, Byte], (Int,Char)]]
case class CC_B[F](a: F, b: T_B[F]) extends T_B[F]
case class CC_C[G](a: T_A[G, G], b: G) extends T_B[G]
case class CC_D(a: CC_B[Byte], b: CC_A[(Byte,Boolean), T_B[Boolean]], c: T_B[Boolean]) extends T_B[CC_C[CC_A[Int, Char]]]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x', CC_B(_, CC_B(_, _))) => 0 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 1 
  case CC_B('x', CC_B(_, CC_C(_, _))) => 2 
  case CC_B(_, CC_B(_, CC_C(_, _))) => 3 
  case CC_B('x', CC_C(_, _)) => 4 
  case CC_B(_, CC_C(_, _)) => 5 
  case CC_C(_, _) => 6 
}
}