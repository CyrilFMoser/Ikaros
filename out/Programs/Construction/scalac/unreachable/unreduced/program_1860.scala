package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Byte]]
case class CC_B(a: T_A[T_A[Byte]], b: Int, c: T_A[Byte]) extends T_A[T_A[Byte]]
case class CC_C[B]() extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, 12, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C() => 3 
}
}