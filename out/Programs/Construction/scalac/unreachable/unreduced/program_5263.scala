package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Int, b: (Char,T_A[Byte, Int]), c: T_B[T_A[Int, Int], T_A[Byte, Int]]) extends T_A[(T_A[Char, Boolean],Int), Int]
case class CC_B() extends T_A[(T_A[Char, Boolean],Int), Int]
case class CC_C(a: (T_B[CC_A, CC_A],CC_A), b: T_A[T_B[CC_A, CC_B], T_B[CC_A, Byte]], c: CC_A) extends T_A[(T_A[Char, Boolean],Int), Int]
case class CC_D[E, F](a: T_B[F, F], b: T_A[Boolean, E], c: (CC_A,T_B[Byte, CC_C])) extends T_B[E, F]
case class CC_E[G](a: T_A[G, G]) extends T_B[G, CC_B]

val v_a: T_A[(T_A[Char, Boolean],Int), Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((CC_D(_, _, _),CC_A(_, _, _)), _, CC_A(_, (_,_), _)) => 1 
}
}
// This is not matched: CC_A(_, _, _)