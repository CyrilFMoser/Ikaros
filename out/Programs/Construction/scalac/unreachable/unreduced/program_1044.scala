package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[(T_A[Int, Int],Byte), C]
case class CC_B() extends T_A[(T_A[Int, Int],Byte), T_A[T_A[Int, Int], CC_A[Boolean]]]
case class CC_C(a: CC_A[(CC_B,CC_B)], b: CC_B) extends T_A[(T_A[Int, Int],Byte), T_A[T_A[Int, Int], CC_A[Boolean]]]

val v_a: T_A[(T_A[Int, Int],Byte), T_A[T_A[Int, Int], CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_), CC_B()) => 2 
}
}