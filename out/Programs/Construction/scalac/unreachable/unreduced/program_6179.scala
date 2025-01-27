package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, F]) extends T_A[E, F]
case class CC_B(a: CC_A[T_B[Char, Boolean], T_B[Char, (Int,Char)]], b: T_B[T_A[Int, Char], T_B[Boolean, Boolean]], c: CC_A[Boolean, CC_A[Boolean, Int]]) extends T_A[T_B[T_B[Byte, (Boolean,Boolean)], T_B[Char, Int]], T_B[T_A[Char, Int], Byte]]
case class CC_C() extends T_A[T_B[T_B[Byte, (Boolean,Boolean)], T_B[Char, Int]], T_B[T_A[Char, Int], Byte]]
case class CC_D[G]() extends T_B[T_A[CC_B, T_A[CC_B, Byte]], G]
case class CC_E[H, I](a: T_A[H, H], b: H) extends T_B[T_A[CC_B, T_A[CC_B, Byte]], H]

val v_a: T_A[T_B[T_B[Byte, (Boolean,Boolean)], T_B[Char, Int]], T_B[T_A[Char, Int], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(CC_A(_)), _, _) => 1 
}
}
// This is not matched: CC_C()