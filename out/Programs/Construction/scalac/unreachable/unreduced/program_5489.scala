package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_A[T_A[(Byte,Byte)]], c: T_B) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: CC_A) extends T_B
case class CC_C(a: T_B) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_C(CC_B(_)) => 1 
  case CC_C(CC_C(CC_B(_))) => 2 
  case CC_C(CC_C(CC_C(_))) => 3 
  case CC_C(CC_C(CC_D())) => 4 
  case CC_C(CC_D()) => 5 
  case CC_D() => 6 
}
}