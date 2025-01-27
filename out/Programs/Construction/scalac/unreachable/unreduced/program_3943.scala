package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,(T_A,Boolean)), b: (T_A,T_B[T_A, T_A]), c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: T_B[T_B[CC_A, Int], CC_B], c: T_B[CC_B, T_A]) extends T_A
case class CC_D[C](a: C, b: Int, c: T_A) extends T_B[CC_C, C]
case class CC_E[D](a: D) extends T_B[CC_C, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _, _),_), _) => 0 
  case CC_A(_, (CC_B(),_), _) => 1 
  case CC_A(_, (CC_C(_, _, _),_), _) => 2 
  case CC_B() => 3 
  case CC_C(_, _, _) => 4 
}
}