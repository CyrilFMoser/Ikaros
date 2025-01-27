package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[Int, Char], T_A[Byte, Char]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Int, Char], T_A[Byte, Char]]]
case class CC_C(a: CC_A[T_A[Byte, Char]], b: CC_A[CC_A[Byte]], c: CC_B[CC_A[Char]]) extends T_A[(CC_A[Byte],Char), T_A[T_A[Int, Char], T_A[Byte, Char]]]

val v_a: T_A[Byte, T_A[T_A[Int, Char], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}