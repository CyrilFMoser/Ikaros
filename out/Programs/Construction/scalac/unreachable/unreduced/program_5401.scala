package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: B, b: (T_A,T_B[T_A]), c: (T_A,T_B[T_A])) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Char) extends T_A
case class CC_D(a: T_A, b: CC_B) extends T_B[T_B[CC_A[CC_C]]]
case class CC_E() extends T_B[T_B[CC_A[CC_C]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _, _),_), _) => 0 
  case CC_A(_, (CC_B(),_), _) => 1 
  case CC_A(_, (CC_C(_),_), _) => 2 
  case CC_B() => 3 
  case CC_C('x') => 4 
  case CC_C(_) => 5 
}
}