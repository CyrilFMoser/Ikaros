package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Byte, C], b: T_A[C, C]) extends T_A[Byte, C]
case class CC_B() extends T_A[Byte, (CC_A[Char],T_A[Byte, Int])]
case class CC_C[D](a: Boolean, b: D) extends T_A[Byte, D]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_C(_, _), _) => 1 
  case CC_C(_, _) => 2 
}
}