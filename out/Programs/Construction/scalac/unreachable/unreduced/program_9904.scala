package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Boolean) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[Boolean, Boolean], Boolean], b: CC_A[T_A[Int, Int], (Int,Boolean)]) extends T_A[CC_A[CC_A[Char, Int], Byte], Byte]
case class CC_C[E](a: T_A[E, E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[T_A[CC_A[CC_A[Char, Int], Byte], Byte], T_A[CC_A[CC_A[Char, Int], Byte], Byte]], T_A[CC_A[CC_A[Char, Int], Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_) => 1 
}
}