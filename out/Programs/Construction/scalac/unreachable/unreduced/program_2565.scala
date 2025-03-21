package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[T_B]]]
case class CC_C[B]() extends T_A[T_A[T_A[T_B]]]
case class CC_D(a: (CC_C[CC_A],Char)) extends T_B
case class CC_E(a: T_B, b: T_A[T_B]) extends T_B
case class CC_F(a: CC_A, b: CC_D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((CC_C(),'x')) => 0 
  case CC_D((CC_C(),_)) => 1 
  case CC_E(_, _) => 2 
  case CC_F(CC_A(), CC_D((_,_))) => 3 
}
}