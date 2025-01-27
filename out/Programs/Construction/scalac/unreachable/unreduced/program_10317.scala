package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Int, Byte]], b: T_B[T_A[Boolean], (Byte,Int)], c: T_A[(Boolean,Char)]) extends T_A[T_B[T_A[Boolean], T_A[Boolean]]]
case class CC_B[D](a: Int, b: T_A[D], c: CC_A) extends T_A[D]
case class CC_C[E]() extends T_B[E, CC_B[E]]
case class CC_D[F](a: T_A[F]) extends T_B[Int, F]
case class CC_E[G](a: G, b: T_A[G]) extends T_B[Int, G]

val v_a: T_A[T_B[T_A[Boolean], T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), _) => 1 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 2 
}
}
// This is not matched: CC_B(_, CC_B(_, CC_A(_, _, _), _), _)