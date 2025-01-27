package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, ((T_B,T_B),T_B)]
case class CC_B[D](a: D, b: CC_A[D], c: (Char,T_B)) extends T_A[D, ((T_B,T_B),T_B)]
case class CC_C[E]() extends T_A[(CC_B[T_B],T_A[(Boolean,Boolean), T_B]), ((T_B,T_B),T_B)]

val v_a: T_A[(CC_B[T_B],T_A[(Boolean,Boolean), T_B]), ((T_B,T_B),T_B)] = null
val v_b: Int = v_a match{
  case CC_B((CC_B(_, _, _),_), CC_A(_), (_,_)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)