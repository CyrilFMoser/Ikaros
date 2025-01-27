package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C[C]() extends T_B[C, (CC_B,Byte)]
case class CC_D[D](a: T_B[CC_B, (CC_B,Byte)], b: CC_C[D]) extends T_B[D, (CC_B,Byte)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}