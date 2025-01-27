package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[E, E], c: E) extends T_A[E, T_A[T_A[Int, (Boolean,Int)], T_A[Char, Boolean]]]
case class CC_B[F]() extends T_A[F, T_A[T_A[Int, (Boolean,Int)], T_A[Char, Boolean]]]
case class CC_C[G](a: (Byte,CC_B[Byte]), b: CC_A[G]) extends T_A[G, T_A[T_A[Int, (Boolean,Int)], T_A[Char, Boolean]]]
case class CC_D[H]() extends T_B[CC_B[CC_B[Int]], H]

val v_a: T_A[Int, T_A[T_A[Int, (Boolean,Int)], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A(_, _, _)) => 1 
}
}
// This is not matched: CC_A(_, _, _)