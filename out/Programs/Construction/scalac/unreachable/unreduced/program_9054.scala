package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[E], b: T_B[D], c: Byte) extends T_A[E, D]
case class CC_B[G, F](a: CC_A[F, G], b: T_A[G, F]) extends T_A[F, G]
case class CC_C[H](a: T_A[T_A[CC_A[Char, (Char,Boolean)], CC_A[Char, (Char,Boolean)]], Byte], b: H) extends T_A[H, Byte]
case class CC_D(a: T_A[T_A[Int, Boolean], T_A[Boolean, Char]], b: T_B[T_A[Byte, Byte]], c: T_A[T_A[Char, Byte], Byte]) extends T_B[T_B[T_A[Int, Byte]]]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), _) => 0 
  case CC_C(CC_B(_, _), _) => 1 
  case CC_C(CC_C(_, CC_A(_, _, _)), _) => 2 
  case CC_C(CC_C(_, CC_B(_, _)), _) => 3 
}
}