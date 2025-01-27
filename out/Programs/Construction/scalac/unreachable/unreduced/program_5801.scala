package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[Int, Char]
case class CC_B(a: CC_A, b: T_A[T_A[CC_A, CC_A], T_A[CC_A, (Boolean,Byte)]], c: CC_A) extends T_A[Int, Char]
case class CC_C(a: T_A[Byte, CC_B], b: T_A[T_A[Int, Char], CC_B], c: Boolean) extends T_A[Int, Char]
case class CC_D[F, E](a: CC_B, b: F) extends T_B[E, F]
case class CC_E[G]() extends T_B[G, CC_D[(CC_A,Boolean), CC_A]]
case class CC_F[H](a: CC_D[H, H], b: T_B[H, H]) extends T_B[H, CC_D[(CC_A,Boolean), CC_A]]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)