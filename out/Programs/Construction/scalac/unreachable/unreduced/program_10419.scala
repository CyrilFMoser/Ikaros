package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_B[Boolean]), b: T_B[T_A], c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[T_B[Int]], b: CC_B) extends T_B[T_B[Int]]
case class CC_D() extends T_B[T_B[Int]]
case class CC_E(a: CC_C, b: Int) extends T_B[T_B[Int]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),_), _, CC_A((_,_), _, CC_A(_, _, _))) => 0 
  case CC_A((CC_A(_, _, _),_), _, CC_A((_,_), _, CC_B())) => 1 
  case CC_A((CC_A(_, _, _),_), _, CC_B()) => 2 
  case CC_A((CC_B(),_), _, CC_A((_,_), _, CC_A(_, _, _))) => 3 
  case CC_A((CC_B(),_), _, CC_A((_,_), _, CC_B())) => 4 
  case CC_A((CC_B(),_), _, CC_B()) => 5 
  case CC_B() => 6 
}
}