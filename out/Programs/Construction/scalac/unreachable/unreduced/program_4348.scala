package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[C, C]]) extends T_A[T_A[T_A[Int, Char], Boolean], C]
case class CC_B[D](a: CC_A[D]) extends T_A[T_A[T_A[Int, Char], Boolean], D]
case class CC_C() extends T_A[T_A[T_A[Int, Char], Boolean], CC_A[T_A[Int, Byte]]]

val v_a: T_A[T_A[T_A[Int, Char], Boolean], CC_A[T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_C() => 2 
}
}