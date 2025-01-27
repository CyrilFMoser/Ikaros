package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, E], c: T_B[E, E]) extends T_A[E, T_A[T_B[Int, Boolean], T_A[(Char,Byte), Int]]]
case class CC_B[F](a: F) extends T_A[F, T_A[T_B[Int, Boolean], T_A[(Char,Byte), Int]]]
case class CC_C[G, H](a: CC_B[G], b: G) extends T_B[G, H]

val v_a: T_A[Int, T_A[T_B[Int, Boolean], T_A[(Char,Byte), Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C(_, _)) => 0 
  case CC_B(_) => 1 
}
}