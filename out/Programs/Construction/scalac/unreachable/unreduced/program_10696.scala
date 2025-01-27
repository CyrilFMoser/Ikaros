package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_B[T_A[Int], T_B[Char, Byte]]]
case class CC_B[E, D](a: Int, b: T_B[E, D]) extends T_B[E, D]
case class CC_C[G, F](a: Boolean, b: T_A[F], c: Boolean) extends T_B[G, F]

val v_a: T_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(true, _, _) => 1 
  case CC_C(false, _, _) => 2 
}
}