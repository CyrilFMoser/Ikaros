package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Int, C]
case class CC_B[D](a: D, b: D) extends T_A[Int, D]
case class CC_C(a: T_A[T_A[Int, (Byte,Int)], Byte], b: T_A[Byte, (Byte,(Int,Char))]) extends T_A[Int, CC_B[CC_A[Byte]]]

val v_a: T_A[Int, CC_B[CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_B(_, _), _) => 1 
  case CC_C(_, _) => 2 
}
}