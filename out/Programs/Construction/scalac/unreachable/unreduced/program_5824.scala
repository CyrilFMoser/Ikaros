package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[Byte]) extends T_A[T_A[T_A[Byte]]]
case class CC_B() extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: Int) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(12) => 2 
  case CC_C(_) => 3 
}
}