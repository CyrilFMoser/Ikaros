package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: (T_A[Boolean],T_A[(Boolean,Byte)])) extends T_A[Boolean]
case class CC_C() extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),_)) => 1 
  case CC_B((CC_B(_),_)) => 2 
  case CC_B((CC_C(),_)) => 3 
  case CC_C() => 4 
}
}