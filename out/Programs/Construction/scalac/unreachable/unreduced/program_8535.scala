package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[(CC_A,T_A), T_B[T_A, CC_A]]) extends T_A
case class CC_C(a: ((CC_A,CC_B),T_B[T_A, T_A]), b: (CC_B,CC_A), c: T_B[CC_B, CC_A]) extends T_A
case class CC_D[C](a: T_A, b: CC_C, c: CC_B) extends T_B[C, CC_A]
case class CC_E[D](a: CC_C) extends T_B[D, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(((_,_),_), (CC_B(_),CC_A()), CC_D(CC_B(_), CC_C(_, _, _), CC_B(_))) => 2 
  case CC_C(((_,_),_), (CC_B(_),CC_A()), CC_D(CC_C(_, _, _), CC_C(_, _, _), CC_B(_))) => 3 
  case CC_C(((_,_),_), (CC_B(_),CC_A()), CC_E(CC_C(_, _, _))) => 4 
}
}
// This is not matched: CC_C(((_,_),_), (CC_B(_),CC_A()), CC_D(CC_A(), CC_C(_, _, _), CC_B(_)))