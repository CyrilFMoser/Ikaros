package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D, b: (T_A[Int, Int],T_A[Byte, Int])) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B(a: CC_A[CC_A[Int, Char], T_A[Byte, Byte]], b: Boolean) extends T_A[T_A[Byte, T_A[Byte, Byte]], Byte]
case class CC_C[E](a: Byte, b: CC_A[E, E]) extends T_A[T_A[E, T_A[E, E]], E]

val v_a: T_A[T_A[Byte, T_A[Byte, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_C(_, _) => 2 
}
}