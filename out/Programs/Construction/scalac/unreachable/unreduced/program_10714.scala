package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: T_B) extends T_A[C, Int]
case class CC_B() extends T_B
case class CC_C(a: CC_B, b: T_A[Boolean, CC_A[CC_B]], c: (CC_B,T_A[(Byte,Int), Int])) extends T_B

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
  case CC_A(_, CC_C(CC_B(), _, _)) => 1 
}
}