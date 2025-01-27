package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: Boolean, b: Byte, c: T_B[D, E]) extends T_A[D]
case class CC_B(a: T_A[T_A[(Int,Boolean)]], b: T_B[T_A[Char], T_B[Int, Int]], c: (Boolean,T_A[Int])) extends T_A[CC_A[T_B[Char, Byte], CC_A[Boolean, Int]]]
case class CC_C[F](a: F, b: T_A[F]) extends T_B[CC_A[T_A[CC_B], CC_B], CC_B]
case class CC_D(a: T_A[(CC_B,CC_B)], b: Char, c: Boolean) extends T_B[CC_A[T_A[CC_B], CC_B], CC_B]
case class CC_E(a: CC_C[CC_C[CC_B]], b: CC_D) extends T_B[CC_A[T_A[CC_B], CC_B], CC_B]

val v_a: T_B[CC_A[T_A[CC_B], CC_B], CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A(_, _, _), 'x', _) => 1 
  case CC_D(CC_A(_, _, _), _, _) => 2 
}
}
// This is not matched: CC_E(_, _)