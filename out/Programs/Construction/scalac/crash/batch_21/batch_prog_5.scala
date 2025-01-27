package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Boolean, b: (T_B,T_A[T_B])) extends T_A[B]
case class CC_B(a: (T_A[T_B],Byte)) extends T_A[T_B]
case class CC_C() extends T_B
case class CC_D(a: CC_B) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_B((_,_))) => 0 
}
}