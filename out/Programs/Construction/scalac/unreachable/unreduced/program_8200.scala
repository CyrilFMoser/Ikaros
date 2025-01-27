package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A, c: T_A) extends T_A
case class CC_B[C](a: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D[D]() extends T_B[D, (T_B[T_A, CC_C],Char)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_))) => 1 
  case CC_A(_, _, CC_A(_, _, CC_C())) => 2 
  case CC_A(_, _, CC_C()) => 3 
  case CC_B(_) => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_A(_, _, CC_B(_))