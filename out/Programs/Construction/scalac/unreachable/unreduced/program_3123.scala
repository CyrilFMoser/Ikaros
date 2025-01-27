package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Int,T_A), b: (T_A,T_B[T_A, T_A])) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: C, b: (CC_A,(Int,Int)), c: C) extends T_B[C, (T_B[CC_A, T_A],Char)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),_)) => 0 
  case CC_A(_, (CC_B(),_)) => 1 
  case CC_B() => 2 
}
}