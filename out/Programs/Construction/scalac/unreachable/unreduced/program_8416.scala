package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Boolean, Int], Boolean], b: T_A[Byte, T_A[Char, Byte]], c: T_A[T_A[Int, Int], T_B[Boolean, Byte]]) extends T_A[(Byte,Byte), T_B[T_B[Byte, Char], T_B[Byte, (Char,Boolean)]]]
case class CC_B[E](a: E, b: E, c: T_B[E, E]) extends T_B[E, Byte]
case class CC_C[F](a: T_B[F, Byte], b: F, c: T_B[F, Byte]) extends T_B[F, Byte]
case class CC_D[G]() extends T_B[G, CC_B[T_B[CC_A, Byte]]]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(CC_B(_, _, _), _, CC_B(_, _, _))) => 0 
  case CC_C(_, _, CC_C(CC_B(_, _, _), _, CC_C(_, _, _))) => 1 
  case CC_C(_, _, CC_C(CC_C(_, _, _), _, CC_B(_, _, _))) => 2 
  case CC_C(_, _, CC_C(CC_C(_, _, _), _, CC_C(_, _, _))) => 3 
}
}
// This is not matched: CC_C(_, _, CC_B(_, _, _))