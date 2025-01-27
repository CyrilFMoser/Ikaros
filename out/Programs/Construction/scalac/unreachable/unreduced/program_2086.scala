package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: D) extends T_A[D, T_B[T_B[Char]]]
case class CC_B[E](a: (CC_A[Boolean],T_B[Char])) extends T_A[T_A[CC_A[Int], (Char,(Char,Boolean))], E]
case class CC_C[F](a: F, b: CC_A[F], c: F) extends T_A[F, T_B[T_B[Char]]]

val v_a: T_A[T_A[CC_A[Int], (Char,(Char,Boolean))], T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((CC_A(_, _),_)) => 1 
}
}
// This is not matched: CC_C(_, CC_A(_, _), _)