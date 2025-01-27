package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: T_B) extends T_A[B]
case class CC_B() extends T_B
case class CC_C(a: (T_A[CC_B],Boolean), b: CC_A[(CC_B,CC_B)], c: CC_A[T_B]) extends T_B
case class CC_D(a: CC_C, b: (CC_C,T_A[CC_C])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A(CC_A(_, _), _), _) => 1 
}
}
// This is not matched: CC_D(CC_C((_,_), CC_A(_, _), CC_A(_, _)), (CC_C(_, _, _),CC_A(_, _)))