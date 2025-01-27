package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C]) extends T_A[T_A[T_A[Int, Char], Byte], C]
case class CC_B() extends T_A[T_A[T_A[Int, Char], Byte], T_A[T_A[Boolean, Boolean], T_A[Byte, Boolean]]]

val v_a: T_A[T_A[T_A[Int, Char], Byte], T_A[T_A[Boolean, Boolean], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}