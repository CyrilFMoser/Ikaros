package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: (T_A,CC_A), b: (T_B[(Char,Byte), CC_A],T_A)) extends T_A
case class CC_C(a: (T_B[T_A, Int],T_B[CC_A, CC_A]), b: Char, c: T_A) extends T_A
case class CC_D[C]() extends T_B[C, (CC_C,CC_B)]
case class CC_E[D](a: CC_D[D]) extends T_B[T_B[CC_D[CC_A], (CC_C,CC_B)], D]
case class CC_F[E](a: T_A, b: CC_E[E]) extends T_B[E, (CC_C,CC_B)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), (_,_)) => 1 
  case CC_C((_,_), _, CC_A()) => 2 
  case CC_C((_,_), _, CC_C(_, _, _)) => 3 
}
}
// This is not matched: CC_C((_,_), _, CC_B(_, _))