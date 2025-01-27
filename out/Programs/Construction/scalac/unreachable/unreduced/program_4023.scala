package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: T_B[T_A, T_A], c: T_A) extends T_A
case class CC_B(a: (T_A,T_A)) extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_C, b: T_A, c: CC_A) extends T_B[T_B[CC_C, ((Char,Char),(Int,Boolean))], T_B[T_A, CC_B]]
case class CC_E(a: CC_D) extends T_B[T_B[CC_C, ((Char,Char),(Int,Boolean))], T_B[T_A, CC_B]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((CC_A(_, _, _),CC_A(_, _, _))) => 1 
  case CC_B((CC_A(_, _, _),CC_C())) => 2 
  case CC_B((CC_B(_),CC_A(_, _, _))) => 3 
  case CC_B((CC_B(_),CC_B(_))) => 4 
  case CC_B((CC_B(_),CC_C())) => 5 
  case CC_B((CC_C(),CC_A(_, _, _))) => 6 
  case CC_B((CC_C(),CC_B(_))) => 7 
  case CC_B((CC_C(),CC_C())) => 8 
  case CC_C() => 9 
}
}
// This is not matched: CC_B((CC_A(_, _, _),CC_B(_)))