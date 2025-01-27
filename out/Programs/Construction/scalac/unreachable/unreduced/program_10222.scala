package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_B[Int, Byte]]]
case class CC_B(a: CC_A, b: T_A[CC_A], c: T_B[T_A[(Byte,Boolean)], T_A[CC_A]]) extends T_A[T_A[T_B[Int, Byte]]]
case class CC_C(a: Byte, b: T_A[T_B[Boolean, Byte]], c: CC_B) extends T_B[Boolean, Byte]

val v_a: T_A[T_A[T_B[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}