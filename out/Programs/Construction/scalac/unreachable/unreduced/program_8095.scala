package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Byte, b: T_B[D], c: D) extends T_A[D, (Byte,T_B[Char])]
case class CC_B(a: CC_A[Byte], b: T_A[CC_A[Boolean], Int]) extends T_A[Int, (Byte,T_B[Char])]

val v_a: T_A[Int, (Byte,T_B[Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 12) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(CC_A(0, _, _), _) => 2 
  case CC_B(CC_A(_, _, _), _) => 3 
}
}