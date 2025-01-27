package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(T_A[T_B],T_A[T_B])]
case class CC_B(a: T_A[T_B], b: CC_A, c: CC_A) extends T_A[(T_A[T_B],T_A[T_B])]
case class CC_C(a: T_B, b: (Byte,T_A[CC_A])) extends T_A[(T_A[T_B],T_A[T_B])]
case class CC_D(a: CC_B, b: T_B) extends T_B
case class CC_E(a: (CC_C,T_B)) extends T_B

val v_a: T_A[(T_A[T_B],T_A[T_B])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_C(_, (_,_)) => 2 
}
}