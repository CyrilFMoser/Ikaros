package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_B[D], c: D) extends T_A[D, T_A[T_A[(Int,Byte), Char], T_B[Byte]]]
case class CC_B[E](a: E, b: CC_A[E], c: Byte) extends T_A[E, T_A[T_A[(Int,Byte), Char], T_B[Byte]]]
case class CC_C[F](a: CC_B[F], b: (T_B[Char],CC_A[Byte]), c: F) extends T_B[F]
case class CC_D(a: CC_B[CC_C[Boolean]]) extends T_B[T_A[(Char,Boolean), CC_A[Boolean]]]
case class CC_E(a: T_B[T_B[CC_D]]) extends T_B[T_A[(Char,Boolean), CC_A[Boolean]]]

val v_a: T_B[T_A[(Char,Boolean), CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_E(_) => 1 
}
}
// This is not matched: CC_D(_)