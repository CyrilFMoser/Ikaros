package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_B[D], c: T_A[D, D]) extends T_A[D, T_A[T_A[Boolean, Int], T_B[Int]]]
case class CC_B[E](a: CC_A[E], b: T_A[E, E]) extends T_A[E, T_A[T_A[Boolean, Int], T_B[Int]]]
case class CC_C(a: CC_A[((Char,Int),Int)], b: T_B[T_A[Int, Byte]], c: T_B[T_B[Int]]) extends T_B[T_B[T_A[Char, Char]]]
case class CC_D[F](a: T_B[F], b: F, c: Boolean) extends T_B[F]
case class CC_E[G](a: CC_B[G], b: CC_A[G], c: G) extends T_B[G]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(CC_D(_, _, _), _, _), _, _) => 0 
  case CC_D(CC_D(CC_E(_, _, _), _, _), _, _) => 1 
  case CC_D(CC_E(_, CC_A(_, _, _), _), _, _) => 2 
}
}