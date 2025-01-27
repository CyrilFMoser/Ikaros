package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B() extends T_B
case class CC_C() extends T_B
case class CC_D(a: Byte, b: T_A[CC_C, Byte], c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_D(_, _, CC_B()) => 2 
  case CC_D(_, _, CC_C()) => 3 
  case CC_D(_, _, CC_D(_, _, CC_B())) => 4 
  case CC_D(_, _, CC_D(_, _, CC_C())) => 5 
  case CC_D(_, _, CC_D(_, _, CC_D(_, _, _))) => 6 
}
}