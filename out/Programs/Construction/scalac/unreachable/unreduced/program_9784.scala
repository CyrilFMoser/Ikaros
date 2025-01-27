package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_A, b: B) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Boolean, b: (T_A,T_A), c: T_A) extends T_B[T_B[CC_B]]
case class CC_D(a: Byte, b: T_B[CC_B], c: CC_C) extends T_B[T_B[CC_B]]
case class CC_E(a: CC_B, b: CC_C, c: CC_D) extends T_B[T_B[CC_B]]

val v_a: T_B[T_B[CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(_, _)) => 0 
  case CC_C(_, _, CC_B()) => 1 
  case CC_D(_, _, CC_C(_, (_,_), _)) => 2 
  case CC_E(CC_B(), CC_C(_, _, CC_A(_, _)), CC_D(_, _, _)) => 3 
  case CC_E(CC_B(), CC_C(_, _, CC_B()), CC_D(_, _, _)) => 4 
}
}