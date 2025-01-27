package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Byte], b: T_A[T_A[Byte]]) extends T_A[T_A[T_A[T_B]]]
case class CC_B() extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: Boolean, b: T_B) extends T_A[T_A[T_A[T_B]]]

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(true, _) => 2 
  case CC_C(false, _) => 3 
}
}