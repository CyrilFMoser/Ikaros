package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B]]
case class CC_B(a: Boolean, b: CC_A) extends T_A[T_A[T_B]]
case class CC_C() extends T_A[T_A[T_B]]
case class CC_D(a: CC_C, b: CC_A, c: (T_A[CC_C],Byte)) extends T_B
case class CC_E(a: CC_B) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, (_,0)) => 0 
  case CC_D(_, _, (_,_)) => 1 
  case CC_F() => 2 
}
}
// This is not matched: CC_E(CC_B(_, _))