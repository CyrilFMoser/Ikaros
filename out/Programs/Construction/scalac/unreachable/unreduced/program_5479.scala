package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Boolean]
case class CC_B[D](a: T_A[D, Boolean]) extends T_A[D, Boolean]
case class CC_C(a: (((Byte,Boolean),Byte),T_A[Int, Byte])) extends T_A[Boolean, Boolean]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_B(CC_C((_,_))) => 2 
}
}