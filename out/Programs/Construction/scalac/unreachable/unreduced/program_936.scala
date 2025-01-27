package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: T_A[Int]) extends T_A[T_A[T_A[Byte]]]
case class CC_B() extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: Byte, b: CC_A) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(0, CC_A(_, _)) => 2 
  case CC_C(_, CC_A(_, _)) => 3 
}
}