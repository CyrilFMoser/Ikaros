package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B(a: (T_A[Byte],Boolean), b: Boolean, c: (T_A[CC_A],T_A[CC_A])) extends T_A[CC_A]
case class CC_C(a: T_A[CC_A], b: T_A[T_A[Boolean]], c: (CC_B,T_A[CC_A])) extends T_A[CC_A]

val v_a: T_A[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_B((_,_), _, (_,_)), _, (CC_B(_, _, _),CC_B(_, _, _))) => 1 
  case CC_C(CC_B((_,_), _, (_,_)), _, (CC_B(_, _, _),CC_C(_, _, _))) => 2 
  case CC_C(CC_C(_, _, _), _, (CC_B(_, _, _),CC_C(_, _, _))) => 3 
}
}
// This is not matched: CC_C(CC_C(_, _, _), _, (CC_B(_, _, _),CC_B(_, _, _)))