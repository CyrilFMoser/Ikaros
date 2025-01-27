package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: C) extends T_A[T_A[T_A[T_B, (Byte,Byte)], (Boolean,Boolean)], C]
case class CC_B[D](a: T_B, b: (T_B,T_A[Boolean, Boolean])) extends T_A[T_A[T_A[T_B, (Byte,Byte)], (Boolean,Boolean)], D]
case class CC_C[E]() extends T_A[T_A[T_A[T_B, (Byte,Byte)], (Boolean,Boolean)], E]
case class CC_D(a: T_B, b: CC_A[CC_A[T_B]], c: CC_C[T_B]) extends T_B
case class CC_E(a: CC_A[T_A[T_B, T_B]], b: T_B) extends T_B

val v_a: T_A[T_A[T_A[T_B, (Byte,Byte)], (Boolean,Boolean)], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_D(_, _, _), (CC_D(_, _, _),_)) => 1 
  case CC_B(CC_E(_, _), (CC_D(_, _, _),_)) => 2 
  case CC_B(CC_E(_, _), (CC_E(_, _),_)) => 3 
  case CC_C() => 4 
}
}
// This is not matched: CC_B(CC_D(_, _, _), (CC_E(_, _),_))