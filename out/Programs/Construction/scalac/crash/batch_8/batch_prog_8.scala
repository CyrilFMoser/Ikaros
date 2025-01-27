package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Int, Int], T_A[T_A[Int, Byte], T_A[Byte, Boolean]]]
case class CC_B() extends T_A[T_A[Int, Int], T_A[T_A[Int, Byte], T_A[Byte, Boolean]]]
case class CC_C(a: Boolean) extends T_A[T_A[Int, Int], T_A[T_A[Int, Byte], T_A[Byte, Boolean]]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}