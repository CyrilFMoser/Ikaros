package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[(Byte,Int), Int], T_A[T_A[Int, Byte], T_A[Boolean, Boolean]]]
case class CC_B(a: T_A[T_A[Byte, CC_A], CC_A], b: CC_A) extends T_A[T_A[(Byte,Int), Int], T_A[T_A[Int, Byte], T_A[Boolean, Boolean]]]
case class CC_C(a: Byte, b: T_A[CC_B, CC_A]) extends T_A[T_A[(Byte,Int), Int], T_A[T_A[Int, Byte], T_A[Boolean, Boolean]]]

val v_a: T_A[T_A[(Byte,Int), Int], T_A[T_A[Int, Byte], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}