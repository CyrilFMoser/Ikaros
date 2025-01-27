package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[E, D]
case class CC_B(a: T_A[Byte, CC_A[(Int,Byte), Boolean]]) extends T_B[T_B[Boolean]]
case class CC_C(a: T_A[((Boolean,Boolean),CC_B), (CC_B,CC_B)], b: T_A[T_A[CC_B, CC_B], Int]) extends T_B[T_B[Boolean]]
case class CC_D(a: T_A[CC_B, CC_B], b: T_B[T_A[(Boolean,Int), Byte]], c: Boolean) extends T_B[T_B[Boolean]]

val v_a: T_B[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _) => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_B(CC_A())