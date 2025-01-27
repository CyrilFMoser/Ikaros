package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Int) extends T_A[T_B, T_A[T_B, Boolean]]
case class CC_B(a: T_A[T_B, T_A[T_B, Boolean]], b: (Boolean,T_A[T_B, CC_A])) extends T_A[T_B, T_A[T_B, Boolean]]
case class CC_C(a: CC_A, b: Byte) extends T_A[T_B, T_A[T_B, Boolean]]

val v_a: T_A[T_B, T_A[T_B, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (_,_)) => 1 
  case CC_C(CC_A(12), _) => 2 
}
}
// This is not matched: CC_C(CC_A(_), _)