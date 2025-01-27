package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[D, D]]
case class CC_B(a: Boolean, b: Boolean, c: T_A[CC_A[Byte], T_A[CC_A[Byte], CC_A[Byte]]]) extends T_B[T_A[T_A[Int, Char], T_A[T_A[Int, Char], T_A[Int, Char]]]]
case class CC_C(a: T_A[CC_B, T_A[CC_B, CC_B]], b: CC_B) extends T_B[T_A[T_A[Int, Char], T_A[T_A[Int, Char], T_A[Int, Char]]]]
case class CC_D(a: T_B[T_B[Char]], b: CC_B) extends T_B[T_A[T_A[Int, Char], T_A[T_A[Int, Char], T_A[Int, Char]]]]

val v_a: T_B[T_A[T_A[Int, Char], T_A[T_A[Int, Char], T_A[Int, Char]]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
  case CC_C(_, _) => 1 
  case CC_D(_, _) => 2 
}
}