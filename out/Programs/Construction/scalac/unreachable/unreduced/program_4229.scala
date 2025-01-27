package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Char], T_A[Char]], b: T_B[T_A[Boolean], T_B[(Int,Int), Char]], c: T_A[T_B[Boolean, Byte]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: Byte) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: T_B[(CC_A,CC_B), Char]) extends T_A[T_A[T_A[Int]]]
case class CC_D[D, E](a: T_B[E, D], b: T_A[E]) extends T_B[E, D]
case class CC_E[G, F](a: CC_B, b: CC_A, c: Byte) extends T_B[G, F]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _), _, _) => 0 
  case CC_A(CC_E(CC_B(_), _, _), _, _) => 1 
  case CC_B(_) => 2 
  case CC_C(CC_D(_, _)) => 3 
}
}
// This is not matched: CC_C(CC_E(_, _, _))