package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, T_A[T_A[Byte, Int], Byte]]
case class CC_B(a: CC_A[CC_A[Byte]], b: CC_A[T_A[Boolean, Int]], c: T_A[CC_A[Boolean], T_A[Boolean, Boolean]]) extends T_A[T_A[(Boolean,Int), T_A[Char, Byte]], T_A[T_A[Byte, Int], Byte]]
case class CC_C[D](a: Char) extends T_A[D, T_A[T_A[Byte, Int], Byte]]

val v_a: T_A[T_A[(Boolean,Int), T_A[Char, Byte]], T_A[T_A[Byte, Int], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}