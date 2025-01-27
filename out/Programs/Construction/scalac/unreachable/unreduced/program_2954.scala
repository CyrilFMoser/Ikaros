package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[T_A, T_A]], b: T_B[T_B[T_A, T_A], T_A], c: T_B[T_B[T_A, T_A], (T_A,Byte)]) extends T_A
case class CC_B(a: (T_B[T_A, T_A],CC_A), b: T_A, c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, CC_B(_, _, _)) => 1 
  case CC_B(_, _, CC_C()) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_B(_, _, CC_A(_, _, _))