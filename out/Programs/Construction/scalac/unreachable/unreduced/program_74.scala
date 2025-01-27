package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Byte],Int)) extends T_A[T_A[Byte]]
case class CC_B(a: Byte, b: CC_A, c: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_C(a: CC_B, b: T_A[T_A[Byte]], c: Boolean) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}