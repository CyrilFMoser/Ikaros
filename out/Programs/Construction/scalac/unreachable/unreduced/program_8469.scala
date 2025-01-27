package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Int, T_B[Int, Int]], b: T_A[T_A[Int]]) extends T_A[T_B[T_A[Char], T_A[Char]]]
case class CC_B() extends T_A[T_B[T_A[Char], T_A[Char]]]
case class CC_C(a: ((CC_B,Char),(Char,Char)), b: CC_B, c: CC_B) extends T_A[T_B[T_A[Char], T_A[Char]]]
case class CC_D[E, D]() extends T_B[D, E]
case class CC_E[F](a: T_B[F, F], b: F) extends T_B[T_B[Char, CC_A], F]
case class CC_F[G](a: T_A[G], b: T_B[G, G]) extends T_B[G, T_A[G]]

val v_a: T_A[T_B[T_A[Char], T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)