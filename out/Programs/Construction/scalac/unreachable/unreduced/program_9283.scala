package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: ((Char,T_A),T_A), b: T_B[T_B[T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: ((T_A,CC_B),T_A), b: CC_A, c: CC_B) extends T_A
case class CC_D() extends T_B[Int]
case class CC_E() extends T_B[Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(((_,_),CC_A(_, _)), _) => 0 
  case CC_A(((_,_),CC_B()), _) => 1 
  case CC_A(((_,_),CC_C(_, _, _)), _) => 2 
  case CC_B() => 3 
  case CC_C(((_,_),CC_A(_, _)), CC_A((_,_), _), CC_B()) => 4 
  case CC_C(((_,_),CC_B()), CC_A((_,_), _), CC_B()) => 5 
  case CC_C(((_,_),CC_C(_, _, _)), CC_A((_,_), _), CC_B()) => 6 
}
}