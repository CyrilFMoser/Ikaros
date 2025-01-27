package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[(Int,Char), Byte],T_A[Boolean, Int])) extends T_A[C, T_A[C, C]]
case class CC_B() extends T_A[(CC_A[Char],Boolean), T_A[(CC_A[Char],Boolean), (CC_A[Char],Boolean)]]
case class CC_C[D](a: Char, b: (CC_B,Char)) extends T_A[D, T_A[D, D]]

val v_a: T_A[T_A[(CC_A[Char],Boolean), T_A[(CC_A[Char],Boolean), (CC_A[Char],Boolean)]], T_A[T_A[(CC_A[Char],Boolean), T_A[(CC_A[Char],Boolean), (CC_A[Char],Boolean)]], T_A[(CC_A[Char],Boolean), T_A[(CC_A[Char],Boolean), (CC_A[Char],Boolean)]]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_C(_, _) => 1 
}
}