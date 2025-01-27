package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[Boolean, D], b: T_A[Byte, D]) extends T_A[T_A[T_B[(Char,Byte)], T_B[Byte]], D]
case class CC_B[E](a: CC_A[E], b: CC_A[E], c: T_A[E, E]) extends T_A[E, T_B[T_A[E, Int]]]
case class CC_C[F](a: CC_A[CC_A[F]], b: F, c: T_B[F]) extends T_B[F]
case class CC_D(a: CC_C[CC_A[Int]], b: Int) extends T_B[T_B[T_A[Boolean, Byte]]]

val v_a: T_B[T_B[T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, CC_C(_, _, _), _)) => 0 
  case CC_C(_, _, CC_D(CC_C(_, _, _), 12)) => 1 
  case CC_C(_, _, CC_D(CC_C(_, _, _), _)) => 2 
  case CC_D(_, _) => 3 
}
}