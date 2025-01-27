package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Byte]
case class CC_B() extends T_A[Byte]
case class CC_C(a: (CC_B,T_A[CC_A]), b: CC_A, c: CC_B) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C((CC_B(),_), CC_A(), CC_B()) => 2 
}
}