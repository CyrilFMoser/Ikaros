package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_A[Byte, Int], T_B[Byte]], b: Int) extends T_A[T_B[T_A[Byte, Char]], T_B[T_A[Byte, Char]]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}