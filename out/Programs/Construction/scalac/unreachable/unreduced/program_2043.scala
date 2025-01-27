package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_B]
case class CC_B(a: (T_B,CC_A[T_B])) extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_B, b: T_A[T_A[Boolean, T_B], T_B], c: (CC_A[CC_C],CC_A[Boolean])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B((CC_B(_),CC_A(_, _, _))) => 0 
  case CC_B((CC_D(_, _, _),CC_A(_, _, _))) => 1 
  case CC_C() => 2 
  case CC_D(CC_B(_), CC_A(CC_A(_, _, _), _, _), (CC_A(_, _, _),CC_A(_, _, _))) => 3 
  case CC_D(CC_C(), CC_A(CC_A(_, _, _), _, _), (CC_A(_, _, _),CC_A(_, _, _))) => 4 
  case CC_D(CC_D(CC_B(_), CC_A(_, _, _), (_,_)), CC_A(CC_A(_, _, _), _, _), (CC_A(_, _, _),CC_A(_, _, _))) => 5 
  case CC_D(CC_D(CC_C(), CC_A(_, _, _), (_,_)), CC_A(CC_A(_, _, _), _, _), (CC_A(_, _, _),CC_A(_, _, _))) => 6 
  case CC_D(CC_D(CC_D(_, _, _), CC_A(_, _, _), (_,_)), CC_A(CC_A(_, _, _), _, _), (CC_A(_, _, _),CC_A(_, _, _))) => 7 
}
}
// This is not matched: CC_B((CC_C(),CC_A(_, _, _)))