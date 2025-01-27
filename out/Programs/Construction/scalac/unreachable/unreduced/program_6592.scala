package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[(T_A[T_B, T_B],T_A[Byte, T_B]), C]
case class CC_B(a: T_A[CC_A[T_B], T_A[T_B, Boolean]], b: Int) extends T_A[(T_A[T_B, T_B],T_A[Byte, T_B]), T_A[CC_A[T_B], T_B]]
case class CC_C(a: CC_B) extends T_B
case class CC_D(a: (CC_A[T_B],(T_B,CC_C)), b: (T_A[CC_B, Char],(CC_B,CC_C))) extends T_B
case class CC_E(a: CC_C, b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_E(_, CC_B(_, _)) => 1 
}
}
// This is not matched: CC_D((CC_A(),(_,_)), _)