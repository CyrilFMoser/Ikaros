package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B(a: T_B[Char], b: Byte, c: (T_A[Byte],Int)) extends T_B[T_A[T_A[Boolean]]]
case class CC_C(a: Int) extends T_B[T_A[T_A[Boolean]]]

val v_a: T_B[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, 0, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}