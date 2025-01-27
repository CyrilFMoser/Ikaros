package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: ((Char,T_B),T_B), b: ((T_B,T_B),T_A[T_B, T_B])) extends T_A[T_A[T_B, Boolean], C]
case class CC_B[E](a: T_A[T_A[T_B, Boolean], E], b: Byte) extends T_A[T_A[T_B, Boolean], E]
case class CC_C(a: T_A[Char, T_B], b: CC_B[T_B], c: (T_A[T_B, T_B],T_A[Byte, T_B])) extends T_B
case class CC_D(a: T_A[T_A[T_B, Boolean], T_A[Byte, T_B]]) extends T_B
case class CC_E(a: CC_C, b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(CC_A(_, _), _), _) => 0 
  case CC_C(_, CC_B(CC_B(_, _), _), _) => 1 
  case CC_D(CC_A(_, (_,_))) => 2 
  case CC_D(CC_B(CC_A(_, _), _)) => 3 
  case CC_D(CC_B(CC_B(_, _), _)) => 4 
  case CC_E(CC_C(_, CC_B(_, _), (_,_)), CC_C(_, CC_B(_, _), (_,_))) => 5 
  case CC_E(CC_C(_, CC_B(_, _), (_,_)), CC_D(_)) => 6 
  case CC_E(CC_C(_, CC_B(_, _), (_,_)), CC_E(CC_C(_, _, _), _)) => 7 
}
}