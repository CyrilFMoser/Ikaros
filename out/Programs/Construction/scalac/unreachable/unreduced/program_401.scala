package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Boolean) extends T_A[T_A[T_B[Char, Boolean], T_B[(Int,Char), Byte]], Char]
case class CC_B[E](a: T_A[E, E], b: (T_A[CC_A, CC_A],T_A[CC_A, CC_A]), c: CC_A) extends T_A[E, CC_A]
case class CC_C[F](a: CC_A) extends T_A[F, CC_A]

val v_a: T_A[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_)) => 0 
  case CC_C(CC_A(_)) => 1 
}
}