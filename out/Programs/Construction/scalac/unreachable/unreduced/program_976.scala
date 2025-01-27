package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_B[D]) extends T_A[T_A[T_A[Int, (Byte,Int)], Boolean], D]
case class CC_B(a: CC_A[T_A[Boolean, Char]], b: Char) extends T_B[(CC_A[Int],T_A[Int, Byte])]
case class CC_C(a: CC_A[T_B[CC_B]], b: CC_B) extends T_B[(CC_A[Int],T_A[Int, Byte])]

val v_a: T_B[(CC_A[Int],T_A[Int, Byte])] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), 'x') => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_C(_, _) => 2 
}
}