package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[Int, Char],T_A[Boolean, Char]), c: T_A[C, C]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]], C]
case class CC_B[D](a: CC_A[D], b: D) extends T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]], D]
case class CC_C[E](a: E, b: E, c: CC_B[E]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]], E]

val v_a: T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_C(_, _, _) => 2 
}
}